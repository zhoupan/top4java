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
		return this.parameters.get("top_appkey");
	}

	public String getSessionKey() {
		return this.parameters.get("top_session");
	}

	public String getSignature() {
		return this.parameters.get("top_sign");
	}

	public Long getUserId() {
		String userId = this.parameters.get("visitor_id");
		if (StrUtils.isEmpty(userId)) {
			return null;
		} else {
			return Long.valueOf(userId);
		}
	}

	public String getUserNick() {
		return this.parameters.get("visitor_nick");
	}

	public Map<String, String> getParameters() {
		return this.parameters;
	}

	public void addParameters(Map<String, String> parameters) {
		this.parameters.putAll(parameters);
	}

	public void addParameter(String key, String value) {
		this.parameters.put(key, value);
	}

}
