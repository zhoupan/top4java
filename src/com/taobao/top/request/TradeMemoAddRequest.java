package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.memo.add
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradeMemoAddRequest implements TopRequest {

	private String memo;
	private String tid;

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getApiName() {
		return "taobao.trade.memo.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("memo", this.memo);
		params.put("tid", this.tid);
		return params;
	}

}
