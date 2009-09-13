package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.product.update
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ProductUpdateRequest implements TopUploadRequest {

	/** 产品编号 */
	private String productId;

	/** 外部产品编号 */
	private String outerId;

	/** 绑定属性 */
	private String bindProps;

	/** 销售属性 */
	private String saleProps;

	/** 产品名称 */
	private String name;

	/** 产品市场价 */
	private String price;

	/** 产品描述 */
	private String desc;

	/** 产品主图文件 */
	public FileItem image;

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public void setBindProps(String bindProps) {
		this.bindProps = bindProps;
	}

	public void setSaleProps(String saleProps) {
		this.saleProps = saleProps;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}

	public String getApiName() {
		return "taobao.product.update";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("product_id", this.productId);
		params.put("outer_id", this.outerId);
		params.put("binds", this.bindProps);
		params.put("sale_props", this.saleProps);
		params.put("name", this.name);
		params.put("price", this.price);
		params.put("desc", this.desc);

		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

}
