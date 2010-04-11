package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.suites.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class SuitesGetRequest implements TopRequest {

	private String fields;
	private String serviceCode;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getApiName() {
		return "taobao.suites.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("service_code", this.serviceCode);
		return params;
	}

}
