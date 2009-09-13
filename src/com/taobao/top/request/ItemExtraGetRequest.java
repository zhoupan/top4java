package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemextra.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemExtraGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 昵称 */
	private String nick;

	/** 商品编号 */
	private String iid;

	/** 扩展类型 */
	private String type;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setIid(String iid) {
		this.iid = iid;
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
		params.put("nick", this.nick);
		params.put("iid", this.iid);
		params.put("type", this.type);

		return params;
	}

}
