package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 退款超时。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class RefundTimeout extends BaseObject {

	/** 提醒的类型 */
	@JsonProperty("remind_type")
	private Integer remindType;

	/** 是否存在超时 */
	@JsonProperty("exist_timeout")
	private Boolean hasTimeout;

	/** 超时时间 */
	@JsonProperty("timeout")
	private String timeoutTime;

	public Integer getRemindType() {
		return this.remindType;
	}

	public void setRemindType(Integer remindType) {
		this.remindType = remindType;
	}

	public Boolean getHasTimeout() {
		return this.hasTimeout;
	}

	public void setHasTimeout(Boolean hasTimeout) {
		this.hasTimeout = hasTimeout;
	}

	public String getTimeoutTime() {
		return this.timeoutTime;
	}

	public void setTimeoutTime(String timeoutTime) {
		this.timeoutTime = timeoutTime;
	}

}
