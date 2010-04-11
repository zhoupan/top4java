package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.sku.add
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemSkuAddRequest implements TopRequest {

	private String iid;
	private String itemPrice;
	private String lang;
	private Long numIid;
	private String outerId;
	private String price;
	private String properties;
	private Long quantity;

	public void setIid(String iid) {
		this.iid = iid;
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
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getApiName() {
		return "taobao.item.sku.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("iid", this.iid);
		params.put("item_price", this.itemPrice);
		params.put("lang", this.lang);
		params.put("num_iid", this.numIid);
		params.put("outer_id", this.outerId);
		params.put("price", this.price);
		params.put("properties", this.properties);
		params.put("quantity", this.quantity);
		return params;
	}

}
