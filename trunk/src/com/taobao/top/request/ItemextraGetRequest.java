package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemextra.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemextraGetRequest implements TopRequest {

	private String fields;
	private String iid;
	private String nick;
	private Long numIid;
	private String type;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getApiName() {
		return "taobao.itemextra.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("iid", this.iid);
		params.put("nick", this.nick);
		params.put("num_iid", this.numIid);
		params.put("type", this.type);
		return params;
	}

}
