package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.refund.messages.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class RefundMessagesGetRequest implements TopRequest {

	private String fields;
	private Integer pageNo;
	private Integer pageSize;
	private Long refundId;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public String getApiName() {
		return "taobao.refund.messages.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("refund_id", this.refundId);
		return params;
	}

}
