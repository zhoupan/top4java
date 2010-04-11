package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.skus.custom.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class SkusCustomGetRequest implements TopRequest {

	private String fields;
	private String outerId;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getApiName() {
		return "taobao.skus.custom.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("outer_id", this.outerId);
		return params;
	}

}
