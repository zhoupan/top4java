package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.notify.app.subscribe
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class NotifyAppSubscribeRequest implements TopRequest {

	private Integer duration;
	private String status;
	private String topics;

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setTopics(String topics) {
		this.topics = topics;
	}

	public String getApiName() {
		return "taobao.notify.app.subscribe";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("duration", this.duration);
		params.put("status", this.status);
		params.put("topics", this.topics);
		return params;
	}

}
