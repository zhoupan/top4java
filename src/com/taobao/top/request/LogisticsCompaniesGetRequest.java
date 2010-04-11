package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.logistics.companies.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class LogisticsCompaniesGetRequest implements TopRequest {

	private String fields;
	private Boolean isRecommended;
	private String orderMode;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setIsRecommended(Boolean isRecommended) {
		this.isRecommended = isRecommended;
	}
	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
	}

	public String getApiName() {
		return "taobao.logistics.companies.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("is_recommended", this.isRecommended);
		params.put("order_mode", this.orderMode);
		return params;
	}

}
