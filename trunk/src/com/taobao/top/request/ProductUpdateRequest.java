package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.product.update
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ProductUpdateRequest implements TopRequest {

	private String binds;
	private String desc;
	private Boolean major;
	private String name;
	private String nativeUnkeyprops;
	private String outerId;
	private String price;
	private Long productId;
	private String saleProps;

	public void setBinds(String binds) {
		this.binds = binds;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setMajor(Boolean major) {
		this.major = major;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNativeUnkeyprops(String nativeUnkeyprops) {
		this.nativeUnkeyprops = nativeUnkeyprops;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public void setSaleProps(String saleProps) {
		this.saleProps = saleProps;
	}

	public String getApiName() {
		return "taobao.product.update";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("binds", this.binds);
		params.put("desc", this.desc);
		params.put("major", this.major);
		params.put("name", this.name);
		params.put("native_unkeyprops", this.nativeUnkeyprops);
		params.put("outer_id", this.outerId);
		params.put("price", this.price);
		params.put("product_id", this.productId);
		params.put("sale_props", this.saleProps);
		return params;
	}

}
