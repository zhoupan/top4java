package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * TaobaokeItemDetail Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TaobaokeItemDetail extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("click_url")
	private String clickUrl;

	@JsonProperty("item_detail")
	private ItemDetail itemDetail;

	@JsonProperty("shop_click_url")
	private String shopClickUrl;

	@JsonProperty("seller_credit_score")
	private Long sellerCreditScore;

	public String getClickUrl() {
		return this.clickUrl;
	}
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}

	public ItemDetail getItemDetail() {
		return this.itemDetail;
	}
	public void setItemDetail(ItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}

	public String getShopClickUrl() {
		return this.shopClickUrl;
	}
	public void setShopClickUrl(String shopClickUrl) {
		this.shopClickUrl = shopClickUrl;
	}

	public Long getSellerCreditScore() {
		return this.sellerCreditScore;
	}
	public void setSellerCreditScore(Long sellerCreditScore) {
		this.sellerCreditScore = sellerCreditScore;
	}

}
