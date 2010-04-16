package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.confirmfee.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradeConfirmfeeGetRequest implements TopRequest {

	private Boolean isDetail;
	private Long tid;

	public void setIsDetail(Boolean isDetail) {
		this.isDetail = isDetail;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getApiName() {
		return "taobao.trade.confirmfee.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("is_detail", this.isDetail);
		params.put("tid", this.tid);
		return params;
	}

}
