package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.fullinfo.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TradeDetailGetRequest implements TopRequest {

	/** 需要返回的交易数据结构字段 */
	private String fields;

	/** 交易编号 */
	private String tid;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getApiName() {
		return "taobao.trade.fullinfo.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("tid", this.tid);

		return params;
	}

}
