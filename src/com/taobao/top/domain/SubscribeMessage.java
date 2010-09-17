package com.taobao.top.domain;

import java.util.Date;
import java.util.List;

import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListField;

/**
 * SubscribeMessage Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("subscribe_message")
public class SubscribeMessage extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("app_key")
	private String appKey;

	@ApiField("end_date")
	private String endDate;

	@ApiField("modified")
	private Date modified;

	@ApiField("notify_info")
	@ApiListField("notify_infos")
	private List<NotifyInfo> notifyInfos;

	@ApiField("notify_url")
	private String notifyUrl;

	@ApiField("start_date")
	private String startDate;

	@ApiField("subscription")
	@ApiListField("subscriptions")
	private List<Subscription> subscriptions;

	@ApiField("valid")
	private Boolean valid;

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

	public List<NotifyInfo> getNotifyInfos() {
		return this.notifyInfos;
	}
	public void setNotifyInfos(List<NotifyInfo> notifyInfos) {
		this.notifyInfos = notifyInfos;
	}

	public String getNotifyUrl() {
		return this.notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
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

	public Boolean getValid() {
		return this.valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

}
