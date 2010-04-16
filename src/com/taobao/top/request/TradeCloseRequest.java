package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.close
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradeCloseRequest implements TopRequest {

	private String closeReason;
	private Long tid;

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getApiName() {
		return "taobao.trade.close";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("close_reason", this.closeReason);
		params.put("tid", this.tid);
		return params;
	}

}
