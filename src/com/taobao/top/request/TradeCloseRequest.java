package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.close
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TradeCloseRequest implements TopRequest {

	/** 交易编号 */
	private String tid;

	/** 关闭原因 */
	private String reason;

	public void setTid(String tid) {
		this.tid = tid;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getApiName() {
		return "taobao.trade.close";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("tid", this.tid);
		params.put("close_reason", this.reason);

		return params;
	}

}
