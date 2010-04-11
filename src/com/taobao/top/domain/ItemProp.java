package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonList;
import com.taobao.top.mapping.JsonProperty;

/**
 * ItemProp Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemProp extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("child_template")
	private String childTemplate;

	@JsonProperty("is_allow_alias")
	private Boolean isAllowAlias;

	@JsonProperty("is_color_prop")
	private Boolean isColorProp;

	@JsonProperty("is_enum_prop")
	private Boolean isEnumProp;

	@JsonProperty("is_input_prop")
	private Boolean isInputProp;

	@JsonProperty("is_item_prop")
	private Boolean isItemProp;

	@JsonProperty("is_key_prop")
	private Boolean isKeyProp;

	@JsonProperty("is_sale_prop")
	private Boolean isSaleProp;

	@JsonProperty("multi")
	private Boolean multi;

	@JsonProperty("must")
	private Boolean must;

	@JsonProperty("name")
	private String name;

	@JsonProperty("parent_pid")
	private Long parentPid;

	@JsonProperty("parent_vid")
	private Long parentVid;

	@JsonProperty("pid")
	private Long pid;

	@JsonList(list="prop_values", name="prop_value")
	private List<PropValue> propValues;

	@JsonProperty("sort_order")
	private Integer sortOrder;

	@JsonProperty("status")
	private String status;

	public String getChildTemplate() {
		return this.childTemplate;
	}
	public void setChildTemplate(String childTemplate) {
		this.childTemplate = childTemplate;
	}

	public Boolean getIsAllowAlias() {
		return this.isAllowAlias;
	}
	public void setIsAllowAlias(Boolean isAllowAlias) {
		this.isAllowAlias = isAllowAlias;
	}

	public Boolean getIsColorProp() {
		return this.isColorProp;
	}
	public void setIsColorProp(Boolean isColorProp) {
		this.isColorProp = isColorProp;
	}

	public Boolean getIsEnumProp() {
		return this.isEnumProp;
	}
	public void setIsEnumProp(Boolean isEnumProp) {
		this.isEnumProp = isEnumProp;
	}

	public Boolean getIsInputProp() {
		return this.isInputProp;
	}
	public void setIsInputProp(Boolean isInputProp) {
		this.isInputProp = isInputProp;
	}

	public Boolean getIsItemProp() {
		return this.isItemProp;
	}
	public void setIsItemProp(Boolean isItemProp) {
		this.isItemProp = isItemProp;
	}

	public Boolean getIsKeyProp() {
		return this.isKeyProp;
	}
	public void setIsKeyProp(Boolean isKeyProp) {
		this.isKeyProp = isKeyProp;
	}

	public Boolean getIsSaleProp() {
		return this.isSaleProp;
	}
	public void setIsSaleProp(Boolean isSaleProp) {
		this.isSaleProp = isSaleProp;
	}

	public Boolean getMulti() {
		return this.multi;
	}
	public void setMulti(Boolean multi) {
		this.multi = multi;
	}

	public Boolean getMust() {
		return this.must;
	}
	public void setMust(Boolean must) {
		this.must = must;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getParentPid() {
		return this.parentPid;
	}
	public void setParentPid(Long parentPid) {
		this.parentPid = parentPid;
	}

	public Long getParentVid() {
		return this.parentVid;
	}
	public void setParentVid(Long parentVid) {
		this.parentVid = parentVid;
	}

	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public List<PropValue> getPropValues() {
		return this.propValues;
	}
	public void setPropValues(List<PropValue> propValues) {
		this.propValues = propValues;
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
