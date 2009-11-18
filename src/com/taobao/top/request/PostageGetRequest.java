package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.postage.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class PostageGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 模板编号 */
	private Long postageId;

	/** 卖家昵称 */
	private String nick;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getApiName() {
		return "taobao.postage.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("postage_id", this.postageId);
		params.put("nick", this.nick);

		return params;
	}

}
