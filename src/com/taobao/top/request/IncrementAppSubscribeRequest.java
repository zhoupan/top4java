package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.increment.app.subscribe
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class IncrementAppSubscribeRequest implements TopRequest {

	private Integer duration;
	private String isNotify;
	private String notifyUrl;
	private String status;
	private String topics;

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public void setIsNotify(String isNotify) {
		this.isNotify = isNotify;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setTopics(String topics) {
		this.topics = topics;
	}

	public String getApiName() {
		return "taobao.increment.app.subscribe";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("duration", this.duration);
		params.put("is_notify", this.isNotify);
		params.put("notify_url", this.notifyUrl);
		params.put("status", this.status);
		params.put("topics", this.topics);
		return params;
	}

}
