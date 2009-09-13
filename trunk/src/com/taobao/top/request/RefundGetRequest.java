package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.refund.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class RefundGetRequest implements TopRequest {

	/** 需要返回的字段 */
	private String fields;

	/** 退款单号 */
	private String rid;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getApiName() {
		return "taobao.refund.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("refund_id", this.rid);
		params.put("fields", this.fields);

		return params;
	}

}
