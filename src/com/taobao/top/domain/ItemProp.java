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

	@JsonProperty("is_enum_prop")
	private Boolean isEnumProp;

	@JsonProperty("parent_vid")
	private Long parentVid;

	@JsonProperty("status")
	private String status;

	@JsonProperty("is_allow_alias")
	private Boolean isAllowAlias;

	@JsonProperty("is_key_prop")
	private Boolean isKeyProp;

	@JsonProperty("pid")
	private Long pid;

	@JsonList(list="prop_values", name="prop_value")
	private List<PropValue> propValues;

	@JsonProperty("is_color_prop")
	private Boolean isColorProp;

	@JsonProperty("must")
	private Boolean must;

	@JsonProperty("name")
	private String name;

	@JsonProperty("multi")
	private Boolean multi;

	@JsonProperty("parent_pid")
	private Long parentPid;

	@JsonProperty("sort_order")
	private Integer sortOrder;

	@JsonProperty("child_template")
	private String childTemplate;

	@JsonProperty("is_input_prop")
	private Boolean isInputProp;

	@JsonProperty("is_item_prop")
	private Boolean isItemProp;

	@JsonProperty("is_sale_prop")
	private Boolean isSaleProp;

	public Boolean getIsEnumProp() {
		return this.isEnumProp;
	}
	public void setIsEnumProp(Boolean isEnumProp) {
		this.isEnumProp = isEnumProp;
	}

	public Long getParentVid() {
		return this.parentVid;
	}
	public void setParentVid(Long parentVid) {
		this.parentVid = parentVid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsAllowAlias() {
		return this.isAllowAlias;
	}
	public void setIsAllowAlias(Boolean isAllowAlias) {
		this.isAllowAlias = isAllowAlias;
	}

	public Boolean getIsKeyProp() {
		return this.isKeyProp;
	}
	public void setIsKeyProp(Boolean isKeyProp) {
		this.isKeyProp = isKeyProp;
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

	public Boolean getIsColorProp() {
		return this.isColorProp;
	}
	public void setIsColorProp(Boolean isColorProp) {
		this.isColorProp = isColorProp;
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

	public Boolean getMulti() {
		return this.multi;
	}
	public void setMulti(Boolean multi) {
		this.multi = multi;
	}

	public Long getParentPid() {
		return this.parentPid;
	}
	public void setParentPid(Long parentPid) {
		this.parentPid = parentPid;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getChildTemplate() {
		return this.childTemplate;
	}
	public void setChildTemplate(String childTemplate) {
		this.childTemplate = childTemplate;
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

	public Boolean getIsSaleProp() {
		return this.isSaleProp;
	}
	public void setIsSaleProp(Boolean isSaleProp) {
		this.isSaleProp = isSaleProp;
	}

}
