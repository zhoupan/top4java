package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemextras.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemextrasGetRequest implements TopRequest {

	private String approveStatus;
	private String fields;
	private String nick;
	private String orderBy;
	private Integer pageNo;
	private Integer pageSize;

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getApiName() {
		return "taobao.itemextras.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("approve_status", this.approveStatus);
		params.put("fields", this.fields);
		params.put("nick", this.nick);
		params.put("order_by", this.orderBy);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		return params;
	}

}
