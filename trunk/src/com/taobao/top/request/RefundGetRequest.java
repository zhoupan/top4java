package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.refund.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class RefundGetRequest implements TopRequest {

	private String fields;
	private Long refundId;
	private String v;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}
	public void setV(String v) {
		this.v = v;
	}

	public String getApiName() {
		return "taobao.refund.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("refund_id", this.refundId);
		params.put("v", this.v);
		return params;
	}

}
