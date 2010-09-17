package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.time.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TimeGetRequest implements TopRequest {

	

	

	public String getApiName() {
		return "taobao.time.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		
		return params;
	}

}
