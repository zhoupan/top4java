package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.product.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ProductGetRequest implements TopRequest {

	private Long cid;
	private String fields;
	private Long productId;
	private String props;

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public void setProps(String props) {
		this.props = props;
	}

	public String getApiName() {
		return "taobao.product.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("cid", this.cid);
		params.put("fields", this.fields);
		params.put("product_id", this.productId);
		params.put("props", this.props);
		return params;
	}

}
