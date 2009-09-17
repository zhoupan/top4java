package com.taobao.top.domain;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 基础对象。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public abstract class BaseObject {

	/** 对象创建时间 */
	@JsonProperty("created")
	private String created;

	/** 对象修改时间 */
	@JsonProperty("modified")
	private String modified;

	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getModified() {
		return this.modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}
}
