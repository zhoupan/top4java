package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.shop.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ShopGetRequest implements TopRequest {

	/** 需要返回的字段列表 */
	private String fields;

	/** 卖家昵称 */
	private String nick;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getApiName() {
		return "taobao.shop.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("nick", this.nick);

		return params;
	}

}