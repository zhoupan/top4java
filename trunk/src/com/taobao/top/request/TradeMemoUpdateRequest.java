package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.memo.update
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradeMemoUpdateRequest implements TopRequest {

	private String memo;
	private Long tid;

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getApiName() {
		return "taobao.trade.memo.update";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("memo", this.memo);
		params.put("tid", this.tid);
		return params;
	}

}
