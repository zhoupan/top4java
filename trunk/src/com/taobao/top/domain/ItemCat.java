package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * ItemCat Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemCat extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("status")
	private String status;

	@JsonProperty("name")
	private String name;

	@JsonProperty("parent_cid")
	private Long parentCid;

	@JsonProperty("is_parent")
	private Boolean isParent;

	@JsonProperty("sort_order")
	private Integer sortOrder;

	@JsonProperty("cid")
	private Long cid;

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
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

	public Integer getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

}
