package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 淘宝客店铺。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class TaobaokeShop extends BaseObject {

	/** 店铺用户名 */
	@JsonProperty("user_id")
	private Long uid;

	/** 店铺名称 */
	@JsonProperty("shop_title")
	private String title;

	/** 店铺推广地址 */
	@JsonProperty("click_url")
	private String clickUrl;

	/** 淘宝客店铺佣金比率 */
	@JsonProperty("shop_commission_rate")
	private String commissionRate;

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getClickUrl() {
		return this.clickUrl;
	}

	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}

	public String getCommissionRate() {
		return this.commissionRate;
	}

	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

}
