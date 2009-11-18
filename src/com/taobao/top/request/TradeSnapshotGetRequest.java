package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.snapshot.get
 * 
 * @author carver.gu
 * @since 1.0, Oct 19, 2009
 */
public class TradeSnapshotGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 交易编号 */
	private Long tid;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getApiName() {
		return "taobao.trade.snapshot.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("tid", this.tid);
		return params;
	}

}
