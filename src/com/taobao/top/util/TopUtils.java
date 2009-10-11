package com.taobao.top.util;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import com.taobao.top.Constants;

/**
 * 系统工具类。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public abstract class TopUtils {

	/**
	 * 给TOP请求签名。
	 * 
	 * @param params 所有字符型的TOP请求参数
	 * @param secret 签名密钥
	 * @return 签名
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 */
	public static String signTopRequest(Map<String, String> params, String secret)
			throws IOException, NoSuchAlgorithmException {
		// 第一步：把字典按Key的字母顺序排序
		Map<String, String> sortedParams = new TreeMap<String, String>(params);
		Set<Entry<String, String>> paramSet = sortedParams.entrySet();

		// 第二步：把所有参数名和参数值串在一起
		StringBuilder query = new StringBuilder(secret);
		for (Entry<String, String> param : paramSet) {
			if (StrUtils.areNotEmpty(param.getKey(), param.getValue())) {
				query.append(param.getKey()).append(param.getValue());
			}
		}

		// 第三步：使用MD5加密
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		byte[] bytes = md5.digest(query.toString().getBytes(Constants.DEFAULT_CHARSET));

		// 第四步：把二进制转化为大写的十六进制
		StringBuilder sign = new StringBuilder();
		for (int i = 0; i < bytes.length; i++) {
			String hex = Integer.toHexString(bytes[i] & 0xFF);
			if (hex.length() == 1) {
				sign.append("0");
			}
			sign.append(hex.toUpperCase());
		}

		return sign.toString();
	}

	/**
	 * 验证TOP回调地址的签名是否合法。
	 * 
	 * @param topParams TOP私有参数（未经Base64解密后的）
	 * @param topSession TOP私有会话码
	 * @param topSign TOP回调签名（经过URL反编码的）
	 * @param appKey 应用公钥
	 * @param appSecret 应用密钥
	 * @return 验证成功返回true，否则返回false
	 * @throws NoSuchAlgorithmException
	 * @throws IOException
	 */
	public static boolean verifyTopResponse(String topParams, String topSession, String topSign,
			String appKey, String appSecret) throws NoSuchAlgorithmException, IOException {
		StringBuilder result = new StringBuilder();
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		result.append(appKey).append(topParams).append(topSession).append(appSecret);
		byte[] bytes = md5.digest(result.toString().getBytes(Constants.DEFAULT_CHARSET));
		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(bytes).equals(topSign);
	}

	/**
	 * 解释TOP回调参数为键值对。
	 * 
	 * @param topParams 经过Base64编码的字符串
	 * @return 键值对参数
	 * @throws IOException
	 */
	public static Map<String, String> decodeTopParams(String topParams) throws IOException {
		if (StrUtils.isEmpty(topParams)) {
			return null;
		}

		Map<String, String> result = new HashMap<String, String>();

		BASE64Decoder decoder = new BASE64Decoder();
		byte[] buffer = decoder.decodeBuffer(topParams);
		String originTopParams = new String(buffer, "GBK");

		String[] pairs = originTopParams.split("&");
		for (String pair : pairs) {
			String[] params = pair.split("=");
			if (params != null && params.length == 2) {
				result.put(params[0], params[1]);
			}
		}

		return result;
	}

	/**
	 * 获取文件的真实后缀名。目前只支持JPG, GIF, PNG, BMP四种图片文件。
	 * 
	 * @param bytes 文件字节流
	 * @return JPG, GIF, PNG or null
	 */
	public static String getFileSuffix(byte[] bytes) {
		if (bytes == null || bytes.length < 10) {
			return null;
		}

		if (bytes[0] == 'G' && bytes[1] == 'I' && bytes[2] == 'F') {
			return "GIF";
		} else if (bytes[1] == 'P' && bytes[2] == 'N' && bytes[3] == 'G') {
			return "PNG";
		} else if (bytes[6] == 'J' && bytes[7] == 'F' && bytes[8] == 'I' && bytes[9] == 'F') {
			return "JPG";
		} else if (bytes[0] == 'B' && bytes[1] == 'M') {
			return "BMP";
		} else {
			return null;
		}
	}

	/**
	 * 获取文件的真实媒体类型。目前只支持JPG, GIF, PNG, BMP四种图片文件。
	 * 
	 * @param bytes 文件字节流
	 * @return 媒体类型(MEME-TYPE)
	 */
	public static String getMimeType(byte[] bytes) {
		String suffix = getFileSuffix(bytes);
		String mimeType;

		if ("JPG".equals(suffix)) {
			mimeType = "image/jpeg";
		} else if ("GIF".equals(suffix)) {
			mimeType = "image/gif";
		} else if ("PNG".equals(suffix)) {
			mimeType = "image/png";
		} else if ("BMP".equals(suffix)) {
			mimeType = "image/bmp";
		}else {
			mimeType = "application/octet-stream";
		}

		return mimeType;
	}

	/**
	 * 清除字典中值为空的项。
	 * 
	 * @param <V> 泛型
	 * @param map 待清除的字典
	 * @return 清除后的字典
	 */
	public static <V> Map<String, V> cleanupMap(Map<String, V> map) {
		if (map == null || map.isEmpty()) {
			return null;
		}

		Map<String, V> result = new HashMap<String, V>(map.size());
		Set<Entry<String, V>> entries = map.entrySet();

		for (Entry<String, V> entry : entries) {
			if (entry.getValue() != null) {
				result.put(entry.getKey(), entry.getValue());
			}
		}

		return result;
	}

}
