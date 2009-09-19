package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 店铺内卖家自定义商品类目。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class SellerItemCategory extends BaseObject {

	/** 卖家自定义商品类目编号 */
	@JsonProperty("cid")
	private Long cid;

	/** 父商品类目编号 */
	@JsonProperty("parent_cid")
	private Long parentCid;

	/** 卖家自定义商品类目名称 */
	@JsonProperty("name")
	private String name;

	/** 该类目的链接图片地址 */
	@JsonProperty("pict_url")
	private String picUrl;

	/** 该类目在页面上的排序位置 */
	@JsonProperty("sort_order")
	private Integer sortOrder;

	public Long getCid() {
		return this.cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getParentCid() {
		return this.parentCid;
	}

	public void setParentCid(Long parentCid) {
		this.parentCid = parentCid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicUrl() {
		return this.picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}