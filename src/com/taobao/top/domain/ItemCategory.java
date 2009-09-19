package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 商品类目。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class ItemCategory extends BaseObject {

	/** 类目编号 */
	@JsonProperty("cid")
	private Long cid;

	/** 类目名称 */
	@JsonProperty("name")
	private String name;

	/** 父类目编号 */
	@JsonProperty("parent_cid")
	private Long parentCid;

	/** 该类目是否为父类目 */
	@JsonProperty("is_parent")
	private Boolean isParent;

	/** 类目状态 */
	@JsonProperty("status")
	private String status;

	/** 类目排列序号 */
	@JsonProperty("sort_order")
	private Integer sortOrder;

	/** 类目地址 */
	@JsonProperty("url")
	private String url;

	/** 类目下商品的数量 */
	@JsonProperty("count")
	private Long itemCount;

	public Long getCid() {
		return this.cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public void setCategoryId(Long cid) {
		this.cid = cid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategoryName(String name) {
		this.name = name;
	}

	public Long getParentCid() {
		return this.parentCid;
	}

	public void setParentCid(Long parentCid) {
		this.parentCid = parentCid;
	}

	public Boolean getIsParent() {
		return this.isParent;
	}

	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getItemCount() {
		return this.itemCount;
	}

	public void setItemCount(Long itemCount) {
		this.itemCount = itemCount;
	}

}
