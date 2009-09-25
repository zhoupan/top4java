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

	/** 类目编号 */
	@JsonProperty("cid")
	private Long cid;

	/** 属性编号 */
	@JsonProperty("pid")
	private Long pid;

	/** 属性名 */
	@JsonProperty("prop_name")
	private String propname;

	/** 属性值编号 */
	@JsonProperty("vid")
	private Long vid;

	/** 属性值名称 */
	@JsonProperty("name")
	private String name;

	/** 属性值别名 */
	@JsonProperty("name_alias")
	private String alias;

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

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPropname() {
		return this.propname;
	}

	public void setPropname(String propname) {
		this.propname = propname;
	}

	public Long getVid() {
		return this.vid;
	}

	public void setVid(Long vid) {
		this.vid = vid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
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
