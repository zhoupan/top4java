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

	/** 要返回的字段列表 */
	private String fields;

	/** 退款单号 */
	private Long rid;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setRid(Long rid) {
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
