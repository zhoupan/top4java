package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.confirmfee.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TradeConfirmFeeGetRequest implements TopRequest {

	/** 交易编号 */
	private Long tid;

	/** 是否为子订单 */
	private Boolean childOrder;

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public void setChildOrder(Boolean childOrder) {
		this.childOrder = childOrder;
	}

	public String getApiName() {
		return "taobao.trade.confirmfee.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("tid", this.tid);

		if (childOrder != null) {
			if (childOrder.booleanValue()) {
				params.put("is_detail", "IS_CHILD");
			} else {
				params.put("is_detail", "IS_FATHER");
			}
		}

		return params;
	}

}
