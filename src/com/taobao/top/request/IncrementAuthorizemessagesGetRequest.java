package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.increment.authorizemessages.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class IncrementAuthorizemessagesGetRequest implements TopRequest {

	private Integer expiredDay;
	private String fields;
	private String nicks;
	private Integer pageNo;
	private Integer pageSize;

	public void setExpiredDay(Integer expiredDay) {
		this.expiredDay = expiredDay;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setNicks(String nicks) {
		this.nicks = nicks;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getApiName() {
		return "taobao.increment.authorizemessages.get";
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
