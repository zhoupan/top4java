package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.notify.user.authorize
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class NotifyUserAuthorizeRequest implements TopRequest {

	private Long duration;
	private String email;

	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getApiName() {
		return "taobao.notify.user.authorize";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("duration", this.duration);
		params.put("email", this.email);
		return params;
	}

}
