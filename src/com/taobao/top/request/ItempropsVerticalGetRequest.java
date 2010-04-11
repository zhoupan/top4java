package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemprops.vertical.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItempropsVerticalGetRequest implements TopRequest {

	private String cid;
	private String fields;
	private String type;

	public void setCid(String cid) {
		this.cid = cid;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getApiName() {
		return "taobao.itemprops.vertical.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("cid", this.cid);
		params.put("fields", this.fields);
		params.put("type", this.type);
		return params;
	}

}
