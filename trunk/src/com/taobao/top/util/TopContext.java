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

	public String getAppKey() {
		return getParameter("top_appkey");
	}

	public String getSessionKey() {
		return getParameter("top_session");
	}

	public String getSignature() {
		return getParameter("top_sign");
	}

	public Long getUserId() {
		String userId = getParameter("visitor_id");
		if (StrUtils.isEmpty(userId)) {
			return null;
		} else {
			return Long.valueOf(userId);
		}
	}

	public String getUserNick() {
		return getParameter("visitor_nick");
	}

	public String getParameter(String key) {
		return this.parameters.get(key);
	}

	public void addParameters(Map<String, String> parameters) {
		this.parameters.putAll(parameters);
	}

	public void addParameter(String key, String value) {
		this.parameters.put(key, value);
	}

}
