package com.taobao.top.util;

import java.util.HashMap;
import java.util.Map;

/**
 * TOP容器上下文。
 * 
 * @author carver.gu
 * @since 1.0, Oct 15, 2009
 */
public class TopContext {

	private Map<String, String> parameters = new HashMap<String, String>();

	/**
	 * 获取应用编号。
	 * 
	 * @return 应用编号
	 */
	public String getAppKey() {
		return getParameter("top_appkey");
	}

	/**
	 * 获取授权码。
	 * 
	 * @return 授权码
	 */
	public String getSessionKey() {
		return getParameter("top_session");
	}

	/**
	 * 获取回调签名。
	 * 
	 * @return 回调签名
	 */
	public String getSignature() {
		return getParameter("top_sign");
	}

	/**
	 * 获取淘宝用户编号。
	 * 
	 * @return 淘宝用户编号
	 */
	public Long getUserId() {
		String userId = getParameter("visitor_id");
		if (StrUtils.isEmpty(userId)) {
			return null;
		} else {
			return Long.valueOf(userId);
		}
	}

	/**
	 * 获取淘宝用户昵称。
	 * 
	 * @return 淘宝用户昵称
	 */
	public String getUserNick() {
		return getParameter("visitor_nick");
	}

	/**
	 * 获取指定参数的值。
	 * 
	 * @param key 参数名
	 * @return 参数值
	 */
	public String getParameter(String key) {
		return this.parameters.get(key);
	}

	protected void addParameters(Map<String, String> parameters) {
		if (parameters != null && !parameters.isEmpty()) {
			this.parameters.putAll(parameters);
		}
	}

	protected void addParameter(String key, String value) {
		this.parameters.put(key, value);
	}

}
