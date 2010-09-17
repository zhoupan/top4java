package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.increment.items.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class IncrementItemsGetRequest implements TopRequest {

	private Date endModified;
	private String nick;
	private Integer pageNo;
	private Integer pageSize;
	private Date startModified;
	private String status;

	public void setEndModified(Date endModified) {
		this.endModified = endModified;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public void setStartModified(Date startModified) {
		this.startModified = startModified;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getApiName() {
		return "taobao.increment.items.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("end_modified", this.endModified);
		params.put("nick", this.nick);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("start_modified", this.startModified);
		params.put("status", this.status);
		return params;
	}

}
