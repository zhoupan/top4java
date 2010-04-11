package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;
import com.taobao.top.mapping.JsonListField;

/**
 * ItemProp Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("item_prop")
@JsonListClass("item_props")
public class ItemProp extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("child_template")
	private String childTemplate;

	@JsonField("is_allow_alias")
	private Boolean isAllowAlias;

	@JsonField("is_color_prop")
	private Boolean isColorProp;

	@JsonField("is_enum_prop")
	private Boolean isEnumProp;

	@JsonField("is_input_prop")
	private Boolean isInputProp;

	@JsonField("is_item_prop")
	private Boolean isItemProp;

	@JsonField("is_key_prop")
	private Boolean isKeyProp;

	@JsonField("is_sale_prop")
	private Boolean isSaleProp;

	@JsonField("multi")
	private Boolean multi;

	@JsonField("must")
	private Boolean must;

	@JsonField("name")
	private String name;

	@JsonField("parent_pid")
	private Long parentPid;

	@JsonField("parent_vid")
	private Long parentVid;

	@JsonField("pid")
	private Long pid;

	@JsonField("prop_value")
	@JsonListField("prop_values")
	private List<PropValue> propValues;

	@JsonField("sort_order")
	private Integer sortOrder;

	@JsonField("status")
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
