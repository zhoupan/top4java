package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 淘宝客店铺。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("taobaokeShops")
public class TaobaokeShop extends BaseObject {

	private static final long serialVersionUID = -5046791339573535264L;

	/** 店铺用户名 */
	@JsonProperty("user_id")
	private Long userId;

	/** 店铺名称 */
	@JsonProperty("shop_title")
	private String shopTitle;

	/** 店铺推广地址 */
	@JsonProperty("click_url")
	private String clickUrl;

	/** 淘宝客店铺佣金比率 */
	@JsonProperty("shop_commission_rate")
	private String commissionRate;

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getShopTitle() {
		return this.shopTitle;
	}

	public void setShopTitle(String shopTitle) {
		this.shopTitle = shopTitle;
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
