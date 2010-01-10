package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 淘宝应用。
 * 
 * @author carver.gu
 * @since 1.0, Oct 19, 2009
 */
@JsonClass("tadgets")
public class Tadget extends BaseObject {

	private static final long serialVersionUID = -4461405693501985919L;

	/** 应用编号 */
	@JsonProperty("app_key")
	private String appKey;

	/** 应用密钥 */
	@JsonProperty("app_secret")
	private String appSecret;

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getAppSecret() {
		return this.appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

}
