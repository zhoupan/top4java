package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itempropvalues.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItempropvaluesGetRequest implements TopRequest {

	private Long cid;
	private Date datetime;
	private String fields;
	private String pvs;

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setPvs(String pvs) {
		this.pvs = pvs;
	}

	public String getApiName() {
		return "taobao.itempropvalues.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("cid", this.cid);
		params.put("datetime", this.datetime);
		params.put("fields", this.fields);
		params.put("pvs", this.pvs);
		return params;
	}

}
