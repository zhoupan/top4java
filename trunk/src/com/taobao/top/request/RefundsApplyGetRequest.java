package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.refunds.apply.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class RefundsApplyGetRequest implements TopRequest {

	private String fields;
	private Integer pageNo;
	private Integer pageSize;
	private String sellerNick;
	private String status;
	private String type;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getApiName() {
		return "taobao.refunds.apply.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("seller_nick", this.sellerNick);
		params.put("status", this.status);
		params.put("type", this.type);
		return params;
	}

}
