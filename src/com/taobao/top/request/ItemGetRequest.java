package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemGetRequest implements TopRequest {

	/** 需要返回的商品对象字段，商品结构体中所有字段均可返回 */
	private String fields;

	/** 卖家昵称 */
	private String nick;

	/** 商品编号 */
	private String iid;

	/** 商品数字编号 */
	private Long Numiid;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	public void setNumiid(Long numiid) {
		this.Numiid = numiid;
	}

	public String getApiName() {
		return "taobao.item.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("nick", this.nick);
		params.put("iid", this.iid);
		params.put("num_iid", this.Numiid);

		return params;
	}

}
