package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.taobaoke.interval.report.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TaobaokeIntervalReportGetRequest implements TopRequest {

	private String endDate;
	private String fields;
	private String startDate;

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getApiName() {
		return "taobao.taobaoke.interval.report.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("end_date", this.endDate);
		params.put("fields", this.fields);
		params.put("start_date", this.startDate);
		return params;
	}

}
