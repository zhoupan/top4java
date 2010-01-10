package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 属性值。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("prop_values")
public class PropValue extends BaseObject {

	private static final long serialVersionUID = 6376141493101433282L;

	/** 类目编号 */
	@JsonProperty("cid")
	private Long cid;

	/** 属性编号 */
	@JsonProperty("pid")
	private Long propId;

	/** 属性名 */
	@JsonProperty("prop_name")
	private String propName;

	/** 属性值编号 */
	@JsonProperty("vid")
	private Long valueId;

	/** 属性值名称 */
	@JsonProperty("name")
	private String valueName;

	/** 属性值别名 */
	@JsonProperty("name_alias")
	private String valueAlias;

	/** 属性值状态 */
	@JsonProperty("status")
	private String status;

	/** 排列序号 */
	@JsonProperty("sort_order")
	private Integer sortOrder;

	/** 是否为父类目属性 */
	@JsonProperty("is_parent")
	private Boolean parent;

	public Long getCid() {
		return this.cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getPropId() {
		return this.propId;
	}

	public void setPropId(Long propId) {
		this.propId = propId;
	}

	public String getPropName() {
		return this.propName;
	}

	public void setPropName(String propName) {
		this.propName = propName;
	}

	public Long getValueId() {
		return this.valueId;
	}

	public void setValueId(Long valueId) {
		this.valueId = valueId;
	}

	public String getValueName() {
		return this.valueName;
	}

	public void setValueName(String valueName) {
		this.valueName = valueName;
	}

	public String getValueAlias() {
		return this.valueAlias;
	}

	public void setValueAlias(String valueAlias) {
		this.valueAlias = valueAlias;
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

	public Boolean isParent() {
		return this.parent;
	}

	public void setParent(Boolean isParent) {
		this.parent = isParent;
	}

}
