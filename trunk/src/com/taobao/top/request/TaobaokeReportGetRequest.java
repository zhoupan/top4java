package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.taobaoke.report.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TaobaokeReportGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 需要查询报表的日期 */
	private String date;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getApiName() {
		return "taobao.taobaoke.report.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("date", this.date);

		return params;
	}

}
