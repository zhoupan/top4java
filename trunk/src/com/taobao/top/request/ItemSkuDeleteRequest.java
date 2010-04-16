package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.sku.delete
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemSkuDeleteRequest implements TopRequest {

	private String iid;
	private Integer itemNum;
	private String itemPrice;
	private String lang;
	private Long numIid;
	private String properties;

	public void setIid(String iid) {
		this.iid = iid;
	}
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getApiName() {
		return "taobao.item.sku.delete";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("iid", this.iid);
		params.put("item_num", this.itemNum);
		params.put("item_price", this.itemPrice);
		params.put("lang", this.lang);
		params.put("num_iid", this.numIid);
		params.put("properties", this.properties);
		return params;
	}

}
