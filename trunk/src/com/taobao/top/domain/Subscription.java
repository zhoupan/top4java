package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * Subscription Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class Subscription extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("status")
	private String status;

	@JsonProperty("topic")
	private String topic;

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTopic() {
		return this.topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}

}
