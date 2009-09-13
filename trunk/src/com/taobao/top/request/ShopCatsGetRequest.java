package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.shopcats.list.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ShopCatsGetRequest implements TopRequest {

	public String getApiName() {
		return "taobao.shopcats.list.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		return params;
	}

}
