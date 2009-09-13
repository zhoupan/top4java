package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.logisticcompanies.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class LogisticsCompaniesGetRequest implements TopRequest {

	/** 需要返回的字段列表 */
	private String fields;

	/** 是否查询推荐物流公司 */
	private Boolean recommended;

	/** 推荐物流公司的下单方式 */
	private String orderMode;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setRecommended(Boolean recommended) {
		this.recommended = recommended;
	}

	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
	}

	public String getApiName() {
		return "taobao.logisticcompanies.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("is_recommended", this.recommended);
		params.put("orderMode", this.orderMode);

		return params;
	}

}
