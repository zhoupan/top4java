package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 图片地址。
 * 
 * @author carver.gu
 * @since 1.0, Nov 16, 2009
 */
public class PicUrl extends BaseObject {

	private static final long serialVersionUID = -5338320202369196055L;

	/** 图片地址 */
	@JsonProperty("url")
	private String url;

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
