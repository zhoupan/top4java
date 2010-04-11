package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * TaobaokeItem Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TaobaokeItem extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("taobaoke_cat_click_url")
	private String taobaokeCatClickUrl;

	@JsonProperty("iid")
	private String iid;

	@JsonProperty("commission_rate")
	private String commissionRate;

	@JsonProperty("pic_url")
	private String picUrl;

	@JsonProperty("item_location")
	private String itemLocation;

	@JsonProperty("click_url")
	private String clickUrl;

	@JsonProperty("title")
	private String title;

	@JsonProperty("price")
	private String price;

	@JsonProperty("nick")
	private String nick;

	@JsonProperty("volume")
	private Long volume;

	@JsonProperty("num_iid")
	private Long numIid;

	@JsonProperty("commission_volume")
	private String commissionVolume;

	@JsonProperty("commission")
	private String commission;

	@JsonProperty("commission_num")
	private String commissionNum;

	@JsonProperty("shop_click_url")
	private String shopClickUrl;

	@JsonProperty("seller_credit_score")
	private Long sellerCreditScore;

	@JsonProperty("keyword_click_url")
	private String keywordClickUrl;

	public String getTaobaokeCatClickUrl() {
		return this.taobaokeCatClickUrl;
	}
	public void setTaobaokeCatClickUrl(String taobaokeCatClickUrl) {
		this.taobaokeCatClickUrl = taobaokeCatClickUrl;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getCommissionRate() {
		return this.commissionRate;
	}
	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getItemLocation() {
		return this.itemLocation;
	}
	public void setItemLocation(String itemLocation) {
		this.itemLocation = itemLocation;
	}

	public String getClickUrl() {
		return this.clickUrl;
	}
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getVolume() {
		return this.volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getCommissionVolume() {
		return this.commissionVolume;
	}
	public void setCommissionVolume(String commissionVolume) {
		this.commissionVolume = commissionVolume;
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

	public String getKeywordClickUrl() {
		return this.keywordClickUrl;
	}
	public void setKeywordClickUrl(String keywordClickUrl) {
		this.keywordClickUrl = keywordClickUrl;
	}

}
