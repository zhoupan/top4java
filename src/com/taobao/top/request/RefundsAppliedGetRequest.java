package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.refunds.apply.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class RefundsAppliedGetRequest implements TopRequest {

	/** 需要返回的字段 */
	private String fields;

	/** 退款状态 */
	private String status;

	/** 卖家昵称 */
	private String sellerNick;

	/** 页码 */
	private Integer pageNo;

	/** 每页条数 */
	private Integer pageSize;

	/** 交易类型 */
	private String type;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getApiName() {
		return "taobao.refunds.apply.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("status", this.status);
		params.put("seller_nick", this.sellerNick);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("fields", this.fields);
		params.put("type", this.type);

		return params;
	}

}
