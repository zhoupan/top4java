package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 店铺类目。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class ShopCategory extends BaseObject {

	/** 卖家自定义类目编号 */
	@JsonProperty("cid")
	private Long cid;

	/** 父类目编号 */
	@JsonProperty("parent_cid")
	private Long parentCid;

	/** 卖家自定义类目名称 */
	@JsonProperty("name")
	private String name;

	/** 该类目是否为父类目 */
	@JsonProperty("is_parent")
	private Boolean isParent;

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

	public Boolean isParent() {
		return this.isParent;
	}

	public void setParent(Boolean isParent) {
		this.isParent = isParent;
	}

}