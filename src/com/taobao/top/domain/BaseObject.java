package com.taobao.top.domain;

import java.util.Date;

import com.taobao.top.mapping.JsonProperty;

/**
 * 基础对象。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public abstract class BaseObject {

	/** 对象创建时间 */
	@JsonProperty("created")
	private Date created;

	/** 对象修改时间 */
	@JsonProperty("modified")
	private Date modified;

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
}
