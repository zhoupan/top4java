package com.taobao.top.util;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.taobao.top.Constants;

/**
 * 系统工具类。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public abstract class SysUtils {

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
	 * 获取上传图片文件的真实后缀。
	 * 
	 * @param bytes 字节数组
	 * @return JPG, GIF, PNG or null
	 */
	public static String getImageSuffix(byte[] bytes) {
		if (bytes == null || bytes.length < 10) {
			return null;
		}

		if (bytes[0] == 'G' && bytes[1] == 'I' && bytes[2] == 'F') {
			return "gif";
		} else if (bytes[1] == 'P' && bytes[2] == 'N' && bytes[3] == 'G') {
			return "png";
		} else if (bytes[6] == 'J' && bytes[7] == 'F' && bytes[8] == 'I' && bytes[9] == 'F') {
			return "jpg";
		} else {
			return null;
		}
	}

	/**
	 * 获取上传图片文件的真实mime-type。
	 * 
	 * @param bytes 字节数组
	 * @return mime-type
	 */
	public static String getImageMimeType(byte[] bytes) {
		String suffix = getImageSuffix(bytes);
		String mimeType;

		if ("jpg".equals(suffix)) {
			mimeType = "image/jpeg";
		} else if ("gif".equals(suffix)) {
			mimeType = "image/gif";
		} else if ("png".equals(suffix)) {
			mimeType = "image/png";
		} else {
			mimeType = "application/octet-stream";
		}

		return mimeType;
	}

}
