package com.taobao.top.domain;

import java.util.Date;
import java.util.List;

import com.taobao.top.mapping.JsonList;
import com.taobao.top.mapping.JsonProperty;

/**
 * SubscribeMessage Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class SubscribeMessage extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonList(list="subscriptions", name="subscription")
	private List<Subscription> subscriptions;

	@JsonProperty("end_date")
	private String endDate;

	@JsonProperty("app_key")
	private String appKey;

	@JsonProperty("start_date")
	private String startDate;

	@JsonProperty("modified")
	private Date modified;

	public List<Subscription> getSubscriptions() {
		return this.subscriptions;
	}
	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

}
