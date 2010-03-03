package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 商品属性。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("item_props")
public class ItemProp extends BaseObject {

	private static final long serialVersionUID = 7809692961838601952L;

	/** 属性编号 */
	@JsonProperty("pid")
	private Long pid;

	/** 属性名称 */
	@JsonProperty("name")
	private String name;

	/** 是否关键属性 */
	@JsonProperty("is_key_prop")
	private Boolean keyProp;

	/** 是否销售属性 */
	@JsonProperty("is_sale_prop")
	private Boolean saleProp;

	/** 是否颜色属性 */
	@JsonProperty("is_color_prop")
	private Boolean colorProp;

	/** 是否是可枚举属性 */
	@JsonProperty("is_enum_prop")
	private Boolean enumProp;

	/** 是否是卖家可以自行输入的属性 */
	@JsonProperty("is_input_prop")
	private String inputProp;

	/** 是否商品属性 */
	@JsonProperty("is_item_prop")
	private String itemProp;

	/** 子属性的模板 */
	@JsonProperty("child_template")
	private String childPropTemplate;

	/** 发布产品或商品时是否为必选属性 */
	@JsonProperty("must")
	private Boolean must;

	/** 发布产品或商品时是否可以多选 */
	@JsonProperty("multi")
	private Boolean multi;

	/** 上级属性编号 */
	@JsonProperty("parent_pid")
	private Long parentPid;

	/** 上级属性值编号 */
	@JsonProperty("parent_vid")
	private Long parentVid;

	/** 属性值对象 */
	@JsonProperty("prop_values")
	private List<PropValue> propValues;

	/** 属性状态 */
	@JsonProperty("status")
	private String status;

	/** 排列序号 */
	@JsonProperty("sort_order")
	private Integer sortOrder;

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean isKeyProp() {
		return this.keyProp;
	}

	public void setKeyProp(Boolean isKeyProp) {
		this.keyProp = isKeyProp;
	}

	public Boolean isSaleProp() {
		return this.saleProp;
	}

	public void setSaleProp(Boolean isSaleProp) {
		this.saleProp = isSaleProp;
	}

	public Boolean isColorProp() {
		return this.colorProp;
	}

	public void setColorProp(Boolean isColorProp) {
		this.colorProp = isColorProp;
	}

	public Boolean isEnumProp() {
		return this.enumProp;
	}

	public void setEnumProp(Boolean isEnumProp) {
		this.enumProp = isEnumProp;
	}

	public String isInputProp() {
		return this.inputProp;
	}

	public void setInputProp(String isInputProp) {
		this.inputProp = isInputProp;
	}

	public String isItemProp() {
		return this.itemProp;
	}

	public void setItemProp(String isItemProp) {
		this.itemProp = isItemProp;
	}

	public String getChildPropTemplate() {
		return this.childPropTemplate;
	}

	public void setChildPropTemplate(String childPropTemplate) {
		this.childPropTemplate = childPropTemplate;
	}

	public Boolean isMust() {
		return this.must;
	}

	public void setMust(Boolean isMust) {
		this.must = isMust;
	}

	public Boolean isMulti() {
		return this.multi;
	}

	public void setMulti(Boolean isMulti) {
		this.multi = isMulti;
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

	public List<PropValue> getPropValues() {
		return this.propValues;
	}

	public void setPropValues(List<PropValue> propValues) {
		this.propValues = propValues;
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

}
