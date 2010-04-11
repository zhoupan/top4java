package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.sellercats.list.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class SellercatsListGetRequest implements TopRequest {

	private String nick;

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getApiName() {
		return "taobao.sellercats.list.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("nick", this.nick);
		return params;
	}

}
