package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.product.img.delete
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ProductImgDeleteRequest implements TopRequest {

	private Long id;
	private Long picId;
	private String productId;
	private String v;

	public void setId(Long id) {
		this.id = id;
	}
	public void setPicId(Long picId) {
		this.picId = picId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public void setV(String v) {
		this.v = v;
	}

	public String getApiName() {
		return "taobao.product.img.delete";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("id", this.id);
		params.put("pic_id", this.picId);
		params.put("product_id", this.productId);
		params.put("v", this.v);
		return params;
	}

}
