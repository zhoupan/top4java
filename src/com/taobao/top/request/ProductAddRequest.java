package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.product.add
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ProductAddRequest implements TopUploadRequest {

	/** 类目编号 */
	private String cid;

	/** 外部产品编号 */
	private String outerId;

	/** 关键属性串 */
	private String props;

	/** 绑定属性串 */
	private String Bindprops;

	/** 销售属性串 */
	private String Saleprops;

	/** 用户自定义属性串 */
	private String Inputprops;

	/** 产品名称 */
	private String name;

	/** 产品市场价 */
	private String price;

	/** 产品描述 */
	private String desc;

	/** 产品主图 */
	public FileItem image;

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public void setProps(String props) {
		this.props = props;
	}

	public void setBindprops(String bindprops) {
		this.Bindprops = bindprops;
	}

	public void setSaleprops(String saleprops) {
		this.Saleprops = saleprops;
	}

	public void setInputprops(String inputprops) {
		this.Inputprops = inputprops;
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
		return "taobao.product.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("cid", this.cid);
		params.put("outer_id", this.outerId);
		params.put("props", this.props);
		params.put("binds", this.Bindprops);
		params.put("sale_props", this.Saleprops);
		params.put("customer_props", this.Inputprops);
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
