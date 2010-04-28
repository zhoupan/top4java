package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.product.add
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ProductAddRequest implements TopUploadRequest {

	private String binds;
	private Long cid;
	private String customerProps;
	private String desc;
	private FileItem image;
	private Boolean major;
	private String name;
	private String nativeUnkeyprops;
	private String outerId;
	private String price;
	private String props;
	private String saleProps;

	public void setBinds(String binds) {
		this.binds = binds;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public void setCustomerProps(String customerProps) {
		this.customerProps = customerProps;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setImage(FileItem image) {
		this.image = image;
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
	public void setProps(String props) {
		this.props = props;
	}
	public void setSaleProps(String saleProps) {
		this.saleProps = saleProps;
	}

	public String getApiName() {
		return "taobao.product.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("binds", this.binds);
		params.put("cid", this.cid);
		params.put("customer_props", this.customerProps);
		params.put("desc", this.desc);
		params.put("major", this.major);
		params.put("name", this.name);
		params.put("native_unkeyprops", this.nativeUnkeyprops);
		params.put("outer_id", this.outerId);
		params.put("price", this.price);
		params.put("props", this.props);
		params.put("sale_props", this.saleProps);
		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

}
