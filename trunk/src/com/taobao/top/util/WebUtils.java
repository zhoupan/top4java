package com.taobao.top.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.taobao.top.Constants;

/**
 * 网络工具类。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public abstract class WebUtils {

	private static final String DEFAULT_CHARSET = Constants.DEFAULT_CHARSET;
	private static final String METHOD_POST = "POST";
	private static final String METHOD_GET = "GET";

	/**
	 * 执行HTTP POST请求。
	 * 
	 * @param url 请求地址
	 * @param params 请求参数
	 * @return 响应字符串
	 * @throws IOException
	 */
	public static String doPost(String url, Map<String, String> params) throws IOException {
		return doPost(url, params, DEFAULT_CHARSET);
	}

	/**
	 * 执行带文件上传的HTTP POST请求。
	 * 
	 * @param url 请求地址
	 * @param textParams 文本请求参数
	 * @param fileParams 文件请求参数
	 * @return 响应字符串
	 * @throws IOException
	 */
	public static String doPost(String url, Map<String, String> textParams,
			Map<String, FileItem> fileParams) throws IOException {
		if (fileParams == null || fileParams.isEmpty()) {
			return doPost(url, textParams, DEFAULT_CHARSET);
		} else {
			return doPost(url, textParams, fileParams, DEFAULT_CHARSET);
		}
	}

	/**
	 * 执行HTTP GET请求。
	 * 
	 * @param url 请求地址
	 * @param params 请求参数
	 * @return 响应字符串
	 * @throws IOException
	 */
	public static String doGet(String url, Map<String, String> params) throws IOException {
		return doGet(url, params, DEFAULT_CHARSET);
	}

	public static String doPost(String url, Map<String, String> textParams,
			Map<String, FileItem> fileParams, String charset) throws IOException {
		String boundary = System.currentTimeMillis() + ""; // 随机分隔线
		HttpURLConnection conn = null;
		OutputStream out = null;
		InputStream in = null;
		String rsp = null;

		try {
			String ctype = "multipart/form-data;charset=utf-8;boundary=" + boundary;
			conn = getConnection(new URL(url), METHOD_POST, ctype);
			out = conn.getOutputStream();

			byte[] entryBoundaryBytes = ("\r\n--" + boundary + "\r\n").getBytes(charset);

			// 组装文本请求参数
			Set<Entry<String, String>> textEntrySet = textParams.entrySet();
			for (Entry<String, String> textEntry : textEntrySet) {
				byte[] textBytes = getTextEntry(textEntry.getKey(), textEntry.getValue(), charset);
				out.write(entryBoundaryBytes);
				out.write(textBytes);
			}

			// 组装文件请求参数
			Set<Entry<String, FileItem>> fileEntrySet = fileParams.entrySet();
			for (Entry<String, FileItem> fileEntry : fileEntrySet) {
				FileItem fileItem = fileEntry.getValue();
				byte[] fileBytes = getFileEntry(fileEntry.getKey(), fileItem.getFileName(),
						fileItem.getMimeType(), charset);
				out.write(entryBoundaryBytes);
				out.write(fileBytes);
				out.write(fileItem.getContent());
			}

			// 添加请求结束标志
			byte[] endBoundaryBytes = ("\r\n--" + boundary + "--\r\n").getBytes(charset);
			out.write(endBoundaryBytes);

			in = conn.getInputStream();
			rsp = getResponseAsString(in, charset);
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			if (conn != null) {
				conn.disconnect();
			}
		}

		return rsp;
	}

	private static byte[] getTextEntry(String fieldName, String fieldValue, String charset)
			throws IOException {
		StringBuffer entry = new StringBuffer();
		entry.append("Content-Disposition:form-data;name=\"");
		entry.append(fieldName);
		entry.append("\"\r\nContent-Type:text/plain\r\n\r\n");
		entry.append(fieldValue);
		return entry.toString().getBytes(charset);
	}

	private static byte[] getFileEntry(String fieldName, String fileName, String mimeType,
			String charset) throws IOException {
		StringBuffer entry = new StringBuffer();
		entry.append("Content-Disposition:form-data;name=\"");
		entry.append(fieldName);
		entry.append("\";filename=\"");
		entry.append(fileName);
		entry.append("\"\r\nContent-Type:");
		entry.append(mimeType);
		entry.append("\r\n\r\n");
		return entry.toString().getBytes(charset);
	}

	public static String doPost(String url, Map<String, String> params, String charset)
			throws IOException {
		HttpURLConnection conn = null;
		OutputStream out = null;
		InputStream in = null;
		String rsp = null;

		try {
			String ctype = "application/x-www-form-urlencoded;charset=" + charset;
			conn = getConnection(new URL(url), METHOD_POST, ctype);
			out = conn.getOutputStream();
			String query = buildQuery(params, charset);
			out.write(query.getBytes(charset));
			in = conn.getInputStream();
			rsp = getResponseAsString(in, charset);
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			if (conn != null) {
				conn.disconnect();
			}
		}

		return rsp;
	}

	public static String doGet(String url, Map<String, String> params, String charset)
			throws IOException {
		HttpURLConnection conn = null;
		InputStream in = null;
		String rsp = null;

		try {
			String ctype = "application/x-www-form-urlencoded;charset=" + charset;
			String query = buildQuery(params, charset);
			conn = getConnection(buildGetUrl(url, query), METHOD_GET, ctype);
			in = conn.getInputStream();
			rsp = getResponseAsString(in, charset);
		} finally {
			if (in != null) {
				in.close();
			}
			if (conn != null) {
				conn.disconnect();
			}
		}

		return rsp;
	}

	private static HttpURLConnection getConnection(URL url, String method, String ctype)
			throws IOException {
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod(method);
		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setRequestProperty("Accept", "text/xml,text/javascript");
		conn.setRequestProperty("User-Agent", "Top4Java");
		conn.setRequestProperty("Content-Type", ctype);
		return conn;
	}

	private static URL buildGetUrl(String strUrl, String query) throws IOException {
		URL url = new URL(strUrl);

		if (StrUtils.isEmpty(url.getQuery())) {
			if (strUrl.endsWith("?")) {
				strUrl = strUrl + query;
			} else {
				strUrl = strUrl + "?" + query;
			}
		} else {
			if (strUrl.endsWith("&")) {
				strUrl = strUrl + query;
			} else {
				strUrl = strUrl + "&" + query;
			}
		}

		return new URL(strUrl);
	}

	private static String buildQuery(Map<String, String> params, String charset) throws IOException {
		if (params == null) {
			return null;
		}

		StringBuilder query = new StringBuilder();
		Set<Entry<String, String>> entries = params.entrySet();
		boolean hasParam = false;

		for (Entry<String, String> entry : entries) {
			String name = entry.getKey();
			String value = entry.getValue();
			// 忽略参数名或参数值为空的参数
			if (StrUtils.areNotEmpty(name, value)) {
				if (hasParam) {
					query.append("&");
				} else {
					hasParam = true;
				}

				query.append(name).append("=").append(URLEncoder.encode(value, charset));
			}
		}

		return query.toString();
	}

	private static String getResponseAsString(InputStream in, String charset) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(in, charset));
		StringWriter writer = new StringWriter();

		char[] chars = new char[512];
		int count = 0;
		while ((count = reader.read(chars)) > 0) {
			writer.write(chars, 0, count);
		}

		return writer.toString();
	}

}
