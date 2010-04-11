package com.taobao.top.domain;

import java.util.Date;
import java.util.List;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListField;

/**
 * SubscribeMessage Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("subscribe_message")
public class SubscribeMessage extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("app_key")
	private String appKey;

	@JsonField("end_date")
	private String endDate;

	@JsonField("modified")
	private Date modified;

	@JsonField("start_date")
	private String startDate;

	@JsonField("subscription")
	@JsonListField("subscriptions")
	private List<Subscription> subscriptions;

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public List<Subscription> getSubscriptions() {
		return this.subscriptions;
	}
	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

}
