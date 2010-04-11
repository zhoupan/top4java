package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.postage.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class PostageGetRequest implements TopRequest {

	private String fields;
	private String nick;
	private Long postageId;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public String getApiName() {
		return "taobao.postage.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("nick", this.nick);
		params.put("postage_id", this.postageId);
		return params;
	}

}
