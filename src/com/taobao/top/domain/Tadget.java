package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * Tadget Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class Tadget extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("app_secret")
	private String appSecret;

	@JsonProperty("app_key")
	private String appKey;

	public String getAppSecret() {
		return this.appSecret;
	}
	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

}
