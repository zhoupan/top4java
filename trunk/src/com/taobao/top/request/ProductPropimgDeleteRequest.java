package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.product.propimg.delete
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ProductPropimgDeleteRequest implements TopRequest {

	private Long id;
	private Long productId;

	public void setId(Long id) {
		this.id = id;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getApiName() {
		return "taobao.product.propimg.delete";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("id", this.id);
		params.put("product_id", this.productId);
		return params;
	}

}
