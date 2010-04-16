package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.snapshot.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradeSnapshotGetRequest implements TopRequest {

	private String fields;
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
