package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.skus.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemSkusGetRequest implements TopRequest {

	private String fields;
	private String iids;
	private String nick;
	private String numIids;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setIids(String iids) {
		this.iids = iids;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setNumIids(String numIids) {
		this.numIids = numIids;
	}

	public String getApiName() {
		return "taobao.item.skus.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("iids", this.iids);
		params.put("nick", this.nick);
		params.put("num_iids", this.numIids);
		return params;
	}

}
