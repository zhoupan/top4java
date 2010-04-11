package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.notify.trades.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class NotifyTradesGetRequest implements TopRequest {

	private Date endModified;
	private String nick;
	private Long pageNo;
	private Long pageSize;
	private Date startModified;
	private String status;
	private String type;

	public void setEndModified(Date endModified) {
		this.endModified = endModified;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public void setStartModified(Date startModified) {
		this.startModified = startModified;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getApiName() {
		return "taobao.notify.trades.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("end_modified", this.endModified);
		params.put("nick", this.nick);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("start_modified", this.startModified);
		params.put("status", this.status);
		params.put("type", this.type);
		return params;
	}

}
