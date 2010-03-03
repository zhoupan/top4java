package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.traderates.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TradeRatesGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 评价类型 */
	private String rateType;

	/** 评价者加角色 */
	private String role;

	/** 评价结果 */
	private String result;

	/** 页码 */
	private Integer pageNo;

	/** 每页条数 */
	private Integer pageSize;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getApiName() {
		return "taobao.traderates.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("rate_type", this.rateType);
		params.put("role", this.role);
		params.put("result", this.result);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);

		return params;
	}

}
