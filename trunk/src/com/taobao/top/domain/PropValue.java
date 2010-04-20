package com.taobao.top.domain;

import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListClass;

/**
 * PropValue Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("prop_value")
@ApiListClass("prop_values")
public class PropValue extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("cid")
	private Long cid;

	@ApiField("is_parent")
	private Boolean isParent;

	@ApiField("name")
	private String name;

	@ApiField("name_alias")
	private String nameAlias;

	@ApiField("pid")
	private Long pid;

	@ApiField("prop_name")
	private String propName;

	@ApiField("sort_order")
	private Integer sortOrder;

	@ApiField("status")
	private String status;

	@ApiField("vid")
	private Long vid;

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Boolean getIsParent() {
		return this.isParent;
	}
	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNameAlias() {
		return this.nameAlias;
	}
	public void setNameAlias(String nameAlias) {
		this.nameAlias = nameAlias;
	}

	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPropName() {
		return this.propName;
	}
	public void setPropName(String propName) {
		this.propName = propName;
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

	public Long getVid() {
		return this.vid;
	}
	public void setVid(Long vid) {
		this.vid = vid;
	}

}
