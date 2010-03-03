package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.skus.custom.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class SkusCustomGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 外部商家编号 */
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

		params.put("outer_id", this.outerId);
		params.put("fields", this.fields);

		return params;
	}

}
