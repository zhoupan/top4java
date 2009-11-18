package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.product.propimg.delete
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ProductPropImgDeleteRequest implements TopRequest {

	/** 产品属性图片编号 */
	private Long imgId;

	/** 产品编号 */
	private Long productId;

	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getApiName() {
		return "taobao.product.propimg.delete";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("pic_id", this.imgId);
		params.put("product_id", this.productId);

		return params;
	}

}
