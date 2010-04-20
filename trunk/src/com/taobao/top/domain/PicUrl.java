package com.taobao.top.domain;

import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListClass;

/**
 * PicUrl Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("pic_url")
@ApiListClass("pic_urls")
public class PicUrl extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("url")
	private String url;

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
