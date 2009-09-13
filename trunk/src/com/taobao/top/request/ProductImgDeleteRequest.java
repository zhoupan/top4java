package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.product.img.delete
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ProductImgDeleteRequest implements TopRequest {

	/** 产品多图图片编号 */
	private String imgId;

	/** 产品编号 */
	private String productId;

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getApiName() {
		return "taobao.product.img.delete";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("pic_id", this.imgId);
		params.put("product_id", this.productId);

		return params;
	}

}
