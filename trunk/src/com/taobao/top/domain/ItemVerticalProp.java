package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * ItemVerticalProp Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemVerticalProp extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private Long id;

	@JsonProperty("is_required")
	private Boolean isRequired;

	@JsonProperty("name")
	private String name;

	@JsonProperty("type")
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
