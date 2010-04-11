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

	@JsonProperty("cid")
	private String cid;

	@JsonProperty("created")
	private Date created;

	@JsonProperty("modified")
	private Date modified;

	@JsonProperty("name")
	private String name;

	@JsonProperty("parent_cid")
	private String parentCid;

	@JsonProperty("pic_url")
	private String picUrl;

	@JsonProperty("sort_order")
	private Integer sortOrder;

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
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

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}
