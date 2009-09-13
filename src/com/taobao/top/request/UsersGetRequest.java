package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.users.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class UsersGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 用户昵称列表 */
	private String nicks;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setNicks(String nicks) {
		this.nicks = nicks;
	}

	public String getApiName() {
		return "taobao.users.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("nicks", this.nicks);

		return params;
	}

}
