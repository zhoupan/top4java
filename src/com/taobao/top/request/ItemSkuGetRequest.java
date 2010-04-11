package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.sku.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemSkuGetRequest implements TopRequest {

	private String fields;
	private String nick;
	private Long numIid;
	private Long skuId;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getApiName() {
		return "taobao.item.sku.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("nick", this.nick);
		params.put("num_iid", this.numIid);
		params.put("sku_id", this.skuId);
		return params;
	}

}
