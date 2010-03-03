package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.sku.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemSkuGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** SKU的编号 */
	private Long skuId;

	/** SKU所属用户的昵称 */
	private String nick;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getApiName() {
		return "taobao.item.sku.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("sku_id", this.skuId);
		params.put("nick", this.nick);
		params.put("fields", this.fields);

		return params;
	}

}
