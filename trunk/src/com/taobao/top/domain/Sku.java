package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 销售属性。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("skus")
public class Sku extends BaseObject {

	private static final long serialVersionUID = 6393837539041536403L;

	/** SKU的编号 */
	@JsonProperty("sku_id")
	private Long skuId;

	/** SKU所属商品编号 */
	@JsonProperty("iid")
	private String iid;

	/** SKU的销售属性组合字符串 */
	@JsonProperty("properties")
	private String skuProps;

	/** 属于这个SKU的商品的数量 */
	@JsonProperty("quantity")
	private Integer quantity;

	/** 属于这个SKU的商品的价格取值范围 */
	@JsonProperty("price")
	private String price;

	/** 商家设置的外部编号 */
	@JsonProperty("outer_id")
	private String outerId;

	/** SKU状态 */
	@JsonProperty("status")
	private String status;

	public Long getSkuId() {
		return this.skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getIid() {
		return this.iid;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getSkuProps() {
		return this.skuProps;
	}

	public void setSkuProps(String skuProps) {
		this.skuProps = skuProps;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getOuterId() {
		return this.outerId;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
