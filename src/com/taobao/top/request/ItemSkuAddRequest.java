package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.sku.add
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemSkuAddRequest implements TopRequest {

	/** SKU所属商品编号 */
	private String iid;

	/** SKU的属性串 */
	private String props;

	/** SKU的库存数量 */
	private Integer quantity;

	/** SKU的销售价格 */
	private String price;

	/** SKU的商家外部编号 */
	private String outerId;

	/** SKU文字的版本 */
	private String language;

	public void setIid(String iid) {
		this.iid = iid;
	}

	public void setProps(String props) {
		this.props = props;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getApiName() {
		return "taobao.item.sku.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("iid", this.iid);
		params.put("properties", this.props);
		params.put("quantity", this.quantity);
		params.put("price", this.price);
		params.put("outer_id", this.outerId);
		params.put("lang", this.language);

		return params;
	}

}
