package com.taobao.top;

import java.io.IOException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.taobao.top.parser.TopParser;
import com.taobao.top.request.TopRequest;
import com.taobao.top.request.TopUploadRequest;
import com.taobao.top.util.StrUtils;
import com.taobao.top.util.SysUtils;
import com.taobao.top.util.TopHashMap;
import com.taobao.top.util.WebUtils;

/**
 * 基于REST的TOP客户端。
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TopRestClient implements TopClient {

	private static final Pattern ERR_RSP_JSON = Pattern
			.compile("\\{\"error_rsp\":\\{\"code\":(\\d+),\"msg\":\"(.*)\"\\}\\}");

	private static final String APP_KEY = "app_key";
	private static final String FORMAT = "format";
	private static final String METHOD = "method";
	private static final String TIMESTAMP = "timestamp";
	private static final String VERSION = "v";
	private static final String SIGN = "sign";
	private static final String PARTNER_ID = "partner_id";
	private static final String SESSION = "session";

	private String serverUrl;
	private String appKey;
	private String appSecret;
	private String format = Constants.FORMAT_JSON;

	public TopRestClient(String serverUrl, String appKey, String appSecret) {
		this.appKey = appKey;
		this.appSecret = appSecret;
		this.serverUrl = serverUrl;
	}

	public TopRestClient(String serverUrl, String appKey, String appSecret, String format) {
		this(serverUrl, appKey, appSecret);
		this.format = format;
	}

	public <T> T execute(TopRequest request, TopParser<T> parser) throws TopException {
		return execute(request, parser, null);
	}

	public <T> T execute(TopRequest request, TopParser<T> parser, String session) throws TopException {
		TopHashMap params = new TopHashMap(request.getTextParams());

		// 添加协议级请求参数
		params.put(METHOD, request.getApiName());
		params.put(VERSION, "1.0");
		params.put(APP_KEY, appKey);
		params.put(FORMAT, format);
		params.put(PARTNER_ID, "300");
		params.put(TIMESTAMP, new Date());

		// 添加用户会话授权码
		if (!StrUtils.isEmpty(session)) {
			params.put(SESSION, session);
		}

		// 添加签名参数
		try {
			params.put(SIGN, SysUtils.signTopRequest(params, appSecret));
		} catch (Exception e) {
			throw new TopException(e);
		}

		String rsp;
		try {
			// 是否需要上传文件
			if (request instanceof TopUploadRequest) {
				TopUploadRequest uRequest = (TopUploadRequest) request;
				rsp = WebUtils.doPost(serverUrl, params, uRequest.getFileParams());
			} else {
				rsp = WebUtils.doPost(serverUrl, params);
			}
		} catch (IOException e) {
			throw new TopException(e);
		}

		tryParseException(rsp);
		return parser.parse(rsp);
	}

	/**
	 * 尝试把错误响应转化为异常。
	 * 
	 * @param rsp API响应字符串
	 * @throws TopException
	 */
	private void tryParseException(String rsp) throws TopException {
		if (Constants.FORMAT_JSON.equals(this.format)) {
			// 为了避免二次解释JSON，采用startsWith判断
			if (rsp.startsWith("{\"error_rsp\":")) {
				Matcher matcher = ERR_RSP_JSON.matcher(rsp);
				if (matcher.find()) {
					int errCode = Integer.parseInt(matcher.group(1));
					String errMsg = matcher.group(2);
					throw new TopException(errCode, errMsg);
				} else {
					throw new TopException("Unknown server excpetion!");
				}
			}
		} else {
			throw new TopException("Unsupported response format!");
		}
	}

}
