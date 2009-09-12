package com.taobao.top.domain;

/**
 * 基础对象。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public abstract class BaseObject {

	private String created;
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
