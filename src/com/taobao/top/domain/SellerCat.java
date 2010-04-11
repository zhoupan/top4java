package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonProperty;

/**
 * SellerCat Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class SellerCat extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("created")
	private Date created;

	@JsonProperty("cid")
	private String cid;

	@JsonProperty("name")
	private String name;

	@JsonProperty("parent_cid")
	private String parentCid;

	@JsonProperty("sort_order")
	private Integer sortOrder;

	@JsonProperty("pic_url")
	private String picUrl;

	@JsonProperty("modified")
	private Date modified;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getParentCid() {
		return this.parentCid;
	}
	public void setParentCid(String parentCid) {
		this.parentCid = parentCid;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

}
