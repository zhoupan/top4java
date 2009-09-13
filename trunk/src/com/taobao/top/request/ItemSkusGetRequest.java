package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.skus.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemSkusGetRequest implements TopRequest {

	/** 需要返回的字段 */
	private String fields;

	/** 商品的编号列表 */
	private String iids;

	/** 商品所属卖家昵称 */
	private String nick;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setIids(String iids) {
		this.iids = iids;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getApiName() {
		return "taobao.item.skus.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("iids", this.iids);
		params.put("nick", this.nick);

		return params;
	}

}
