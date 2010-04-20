package com.taobao.top.domain;

import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListClass;

/**
 * Area Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("area")
@ApiListClass("areas")
public class Area extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("id")
	private Long id;

	@ApiField("name")
	private String name;

	@ApiField("parent_id")
	private Long parentId;

	@ApiField("type")
	private Long type;

	@ApiField("zip")
	private String zip;

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

	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
