package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.notify.authorizemessages.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class NotifyAuthorizemessagesGetRequest implements TopRequest {

	private Long expiredDay;
	private String fields;
	private String nicks;
	private Long pageNo;
	private Long pageSize;

	public void setExpiredDay(Long expiredDay) {
		this.expiredDay = expiredDay;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setNicks(String nicks) {
		this.nicks = nicks;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getApiName() {
		return "taobao.notify.authorizemessages.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("expired_day", this.expiredDay);
		params.put("fields", this.fields);
		params.put("nicks", this.nicks);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		return params;
	}

}
