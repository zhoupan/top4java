package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * PropValue Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class PropValue extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("prop_name")
	private String propName;

	@JsonProperty("status")
	private String status;

	@JsonProperty("name")
	private String name;

	@JsonProperty("pid")
	private Long pid;

	@JsonProperty("sort_order")
	private Integer sortOrder;

	@JsonProperty("is_parent")
	private Boolean isParent;

	@JsonProperty("vid")
	private Long vid;

	@JsonProperty("cid")
	private Long cid;

	@JsonProperty("name_alias")
	private String nameAlias;

	public String getPropName() {
		return this.propName;
	}
	public void setPropName(String propName) {
		this.propName = propName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Boolean getIsParent() {
		return this.isParent;
	}
	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	public Long getVid() {
		return this.vid;
	}
	public void setVid(Long vid) {
		this.vid = vid;
	}

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getNameAlias() {
		return this.nameAlias;
	}
	public void setNameAlias(String nameAlias) {
		this.nameAlias = nameAlias;
	}

}
