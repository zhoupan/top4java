package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.product.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ProductGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 产品编号 */
	private Long productId;

	/** 商品类目编号 */
	private Long cid;

	/** 关键属性列表 */
	private String props;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public void setProps(String props) {
		this.props = props;
	}

	public String getApiName() {
		return "taobao.product.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("product_id", this.productId);
		params.put("cid", this.cid);
		params.put("props", this.props);

		return params;
	}

}
