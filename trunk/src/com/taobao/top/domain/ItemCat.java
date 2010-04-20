package com.taobao.top.domain;

import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListClass;

/**
 * ItemCat Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("item_cat")
@ApiListClass("item_cats")
public class ItemCat extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("cid")
	private Long cid;

	@ApiField("is_parent")
	private Boolean isParent;

	@ApiField("name")
	private String name;

	@ApiField("parent_cid")
	private Long parentCid;

	@ApiField("sort_order")
	private Integer sortOrder;

	@ApiField("status")
	private String status;

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Boolean getIsParent() {
		return this.isParent;
	}
	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
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

	public Integer getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
