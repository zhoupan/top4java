package com.taobao.top.domain;

import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListClass;

/**
 * ItemVerticalProp Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("item_vertical_prop")
@ApiListClass("item_vertical_props")
public class ItemVerticalProp extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("id")
	private Long id;

	@ApiField("is_required")
	private Boolean isRequired;

	@ApiField("name")
	private String name;

	@ApiField("type")
	private Integer type;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIsRequired() {
		return this.isRequired;
	}
	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return this.type;
	}
	public void setType(Integer type) {
		this.type = type;
	}

}
