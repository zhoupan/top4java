package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemcats.authorize.get
 * 
 * @author carver.gu
 * @since 1.0, Nov 16, 2009
 */
public class ItemCatsAuthorizeGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getApiName() {
		return "taobao.itemcats.authorize.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		return params;
	}

}
