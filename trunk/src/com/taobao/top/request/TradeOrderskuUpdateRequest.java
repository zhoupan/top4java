package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.ordersku.update
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradeOrderskuUpdateRequest implements TopRequest {

	private Long oid;
	private Long skuId;
	private String skuProps;

	public void setOid(Long oid) {
		this.oid = oid;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	public void setSkuProps(String skuProps) {
		this.skuProps = skuProps;
	}

	public String getApiName() {
		return "taobao.trade.ordersku.update";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("oid", this.oid);
		params.put("sku_id", this.skuId);
		params.put("sku_props", this.skuProps);
		return params;
	}

}
