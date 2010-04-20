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

	private Integer flag;
	private String memo;
	private Long tid;

	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getApiName() {
		return "taobao.trade.memo.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("flag", this.flag);
		params.put("memo", this.memo);
		params.put("tid", this.tid);
		return params;
	}

}
