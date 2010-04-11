package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.traderates.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TraderatesGetRequest implements TopRequest {

	private String fields;
	private Long pageNo;
	private Long pageSize;
	private String rateType;
	private String result;
	private String role;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getApiName() {
		return "taobao.traderates.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("rate_type", this.rateType);
		params.put("result", this.result);
		params.put("role", this.role);
		return params;
	}

}
