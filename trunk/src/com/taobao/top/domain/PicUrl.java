package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * PicUrl Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class PicUrl extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("url")
	private String url;

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
