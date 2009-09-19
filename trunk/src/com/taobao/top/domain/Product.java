package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonProperty;

/**
 * 产品信息。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class Product extends BaseObject {

	/** 产品编号 */
	@JsonProperty("product_id")
	private Long id;

	/** 产品名称 */
	@JsonProperty("name")
	private String name;

	/** 外部产品编号 */
	@JsonProperty("outer_id")
	private String outerId;

	/** 标准产品编号 */
	@JsonProperty("tsc")
	private String standardId;

	/** 商品类目编号 */
	@JsonProperty("cid")
	private Long categoryId;

	/** 商品类目名称 */
	@JsonProperty("cat_name")
	private String categoryName;

	/** 产品的关键属性列表 */
	@JsonProperty("props")
	private String props;

	/** 产品的关键属性字符串列表 */
	@JsonProperty("props_str")
	private String propStrs;

	/** 产品的非关键（绑定）属性列表 */
	@JsonProperty("binds")
	private String bindProps;

	/** 产品的非关键（绑定）字符串列表 */
	@JsonProperty("binds_str")
	private String bindPropStrs;

	/** 产品的销售属性列表 */
	@JsonProperty("sale_props")
	private String saleProps;

	/** 产品的销售属性字符串列表 */
	@JsonProperty("sale_props_str")
	private String salePropStrs;

	/** 产品的市场价 */
	@JsonProperty("price")
	private String price;

	/** 产品的描述 */
	@JsonProperty("desc")
	private String description;

	/** 产品的主图片地址 */
	@JsonProperty("pic_path")
	private String primaryImgUrl;

	/** 产品的子图片 */
	@JsonProperty("productImg")
	private List<ProductImg> imgs;

	/** 产品的属性图片 */
	@JsonProperty("productPropImg")
	private List<ProductPropImg> propImgs;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOuterId() {
		return this.outerId;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getStandardId() {
		return this.standardId;
	}

	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getProps() {
		return this.props;
	}

	public void setProps(String props) {
		this.props = props;
	}

	public String getPropStrs() {
		return this.propStrs;
	}

	public void setPropStrs(String propStrs) {
		this.propStrs = propStrs;
	}

	public String getBindProps() {
		return this.bindProps;
	}

	public void setBindProps(String bindProps) {
		this.bindProps = bindProps;
	}

	public String getBindPropStrs() {
		return this.bindPropStrs;
	}

	public void setBindPropStrs(String bindPropStrs) {
		this.bindPropStrs = bindPropStrs;
	}

	public String getSaleProps() {
		return this.saleProps;
	}

	public void setSaleProps(String saleProps) {
		this.saleProps = saleProps;
	}

	public String getSalePropStrs() {
		return this.salePropStrs;
	}

	public void setSalePropStrs(String salePropStrs) {
		this.salePropStrs = salePropStrs;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrimaryImgUrl() {
		return this.primaryImgUrl;
	}

	public void setPrimaryImgUrl(String primaryImgUrl) {
		this.primaryImgUrl = primaryImgUrl;
	}

	public List<ProductImg> getImgs() {
		return this.imgs;
	}

	public void setImgs(List<ProductImg> imgs) {
		this.imgs = imgs;
	}

	public List<ProductPropImg> getPropImgs() {
		return this.propImgs;
	}

	public void setPropImgs(List<ProductPropImg> propImgs) {
		this.propImgs = propImgs;
	}

}
