package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.suites.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class SuitesGetRequest implements TopRequest {

	/** 用户订购服务的服务码 */
	private String serviceCode;

	public String getApiName() {
		return "taobao.suites.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("service_code", this.serviceCode);

		return params;
	}

}
