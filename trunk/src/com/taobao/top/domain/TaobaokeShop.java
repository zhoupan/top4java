package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * TaobaokeShop Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TaobaokeShop extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("click_url")
	private String clickUrl;

	@JsonProperty("shop_title")
	private String shopTitle;

	@JsonProperty("user_id")
	private String userId;

	@JsonProperty("commission_rate")
	private String commissionRate;

	public String getClickUrl() {
		return this.clickUrl;
	}
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}

	public String getShopTitle() {
		return this.shopTitle;
	}
	public void setShopTitle(String shopTitle) {
		this.shopTitle = shopTitle;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCommissionRate() {
		return this.commissionRate;
	}
	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

}
