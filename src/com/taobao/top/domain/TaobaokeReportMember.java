package com.taobao.top.domain;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 淘宝客报表成员。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class TaobaokeReportMember extends BaseObject {

	/** 应用授权码 */
	@JsonProperty("app_key")
	private String appKey;

	/** 推广渠道 */
	@JsonProperty("outer_code")
	private String outerCode;

	/** 淘宝交易号 */
	@JsonProperty("trade_id")
	private Long tradeId;

	/** 成交时间 */
	@JsonProperty("pay_time")
	private String payTime;

	/** 成交价格 */
	@JsonProperty("pay_price")
	private Double payPrice;

	/** 商品编号 */
	@JsonProperty("auction_id")
	private Long auctionId;

	/** 商品标题 */
	@JsonProperty("auction_title")
	private String auctionTitle;

	/** 商品成交数量 */
	@JsonProperty("auction_number")
	private Long auctionNumber;

	/** 所购买商品的类目编号 */
	@JsonProperty("category_id")
	private Long categoryId;

	/** 所购买商品的类目名称 */
	@JsonProperty("category_name")
	private String categoryName;

	/** 店铺名称 */
	@JsonProperty("shop_title")
	private String shopTitle;

	/** 佣金比例 */
	@JsonProperty("discount")
	private Double discount;

	/** 用户获得的佣金 */
	@JsonProperty("taoke_amount")
	private Double taokeAmount;

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getOuterCode() {
		return this.outerCode;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}

	public Long getTradeId() {
		return this.tradeId;
	}

	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}

	public String getPayTime() {
		return this.payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public Double getPayPrice() {
		return this.payPrice;
	}

	public void setPayPrice(Double payPrice) {
		this.payPrice = payPrice;
	}

	public Long getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(Long auctionId) {
		this.auctionId = auctionId;
	}

	public String getAuctionTitle() {
		return this.auctionTitle;
	}

	public void setAuctionTitle(String auctionTitle) {
		this.auctionTitle = auctionTitle;
	}

	public Long getAuctionNumber() {
		return this.auctionNumber;
	}

	public void setAuctionNumber(Long auctionNumber) {
		this.auctionNumber = auctionNumber;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getShopTitle() {
		return this.shopTitle;
	}

	public void setShopTitle(String shopTitle) {
		this.shopTitle = shopTitle;
	}

	public Double getDiscount() {
		return this.discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getTaokeAmount() {
		return this.taokeAmount;
	}

	public void setTaokeAmount(Double taokeAmount) {
		this.taokeAmount = taokeAmount;
	}

}