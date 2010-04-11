package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;

/**
 * TaobaokeItem Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("taobaoke_item")
@JsonListClass("taobaoke_items")
public class TaobaokeItem extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("click_url")
	private String clickUrl;

	@JsonField("commission")
	private String commission;

	@JsonField("commission_num")
	private String commissionNum;

	@JsonField("commission_rate")
	private String commissionRate;

	@JsonField("commission_volume")
	private String commissionVolume;

	@JsonField("iid")
	private String iid;

	@JsonField("item_location")
	private String itemLocation;

	@JsonField("keyword_click_url")
	private String keywordClickUrl;

	@JsonField("nick")
	private String nick;

	@JsonField("num_iid")
	private Long numIid;

	@JsonField("pic_url")
	private String picUrl;

	@JsonField("price")
	private String price;

	@JsonField("seller_credit_score")
	private Long sellerCreditScore;

	@JsonField("shop_click_url")
	private String shopClickUrl;

	@JsonField("taobaoke_cat_click_url")
	private String taobaokeCatClickUrl;

	@JsonField("title")
	private String title;

	@JsonField("volume")
	private Long volume;

	public String getClickUrl() {
		return this.clickUrl;
	}
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}

	public String getCommission() {
		return this.commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getCommissionNum() {
		return this.commissionNum;
	}
	public void setCommissionNum(String commissionNum) {
		this.commissionNum = commissionNum;
	}

	public String getCommissionRate() {
		return this.commissionRate;
	}
	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String getCommissionVolume() {
		return this.commissionVolume;
	}
	public void setCommissionVolume(String commissionVolume) {
		this.commissionVolume = commissionVolume;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getItemLocation() {
		return this.itemLocation;
	}
	public void setItemLocation(String itemLocation) {
		this.itemLocation = itemLocation;
	}

	public String getKeywordClickUrl() {
		return this.keywordClickUrl;
	}
	public void setKeywordClickUrl(String keywordClickUrl) {
		this.keywordClickUrl = keywordClickUrl;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
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

	public String getTaobaokeCatClickUrl() {
		return this.taobaokeCatClickUrl;
	}
	public void setTaobaokeCatClickUrl(String taobaokeCatClickUrl) {
		this.taobaokeCatClickUrl = taobaokeCatClickUrl;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getVolume() {
		return this.volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}

}
