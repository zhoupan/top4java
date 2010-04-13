package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;

/**
 * TaobaokeItemDetail Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("taobaoke_item_detail")
@JsonListClass("taobaoke_items")
public class TaobaokeItemDetail extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("click_url")
	private String clickUrl;

	@JsonField("item_detail")
	private Item itemDetail;

	@JsonField("seller_credit_score")
	private Long sellerCreditScore;

	@JsonField("shop_click_url")
	private String shopClickUrl;

	public String getClickUrl() {
		return this.clickUrl;
	}
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}

	public Item getItemDetail() {
		return this.itemDetail;
	}
	public void setItemDetail(Item itemDetail) {
		this.itemDetail = itemDetail;
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
