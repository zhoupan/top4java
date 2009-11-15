package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.price.update.page
 * 
 * @author carver.gu
 * @since 1.0, Nov 15, 2009
 */
public class TradePriceUpdateRequest implements TopRequest {

	private Long tid;
	private Integer type;
	private String nick;
	private String callbackUrl;

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getApiName() {
		return "taobao.trade.price.update.page";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("biz_order_id", tid);
		params.put("biz_type", type);
		params.put("nick", nick);
		params.put("callback_url", callbackUrl);
		return params;
	}

}
