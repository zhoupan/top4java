package com.taobao.top.domain;

import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListClass;

/**
 * TaobaokeItemDetail Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("taobaoke_item_detail")
@ApiListClass("taobaoke_item_details")
public class TaobaokeItemDetail extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("click_url")
	private String clickUrl;

	@ApiField("item")
	private Item item;

	@ApiField("seller_credit_score")
	private Long sellerCreditScore;

	@ApiField("shop_click_url")
	private String shopClickUrl;

	public String getClickUrl() {
		return this.clickUrl;
	}
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}

	public Item getItem() {
		return this.item;
	}
	public void setItem(Item item) {
		this.item = item;
	}

	public Long getSellerCreditScore() {
		return this.sellerCreditScore;
	}
	public void setSellerCreditScore(Long sellerCreditScore) {
		this.sellerCreditScore = sellerCreditScore;
	}

	public String getShopClickUrl() {
		return this.shopClickUrl;
	}
	public void setShopClickUrl(String shopClickUrl) {
		this.shopClickUrl = shopClickUrl;
	}

}
