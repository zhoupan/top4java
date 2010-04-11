package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * TaobaokeReportMember Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TaobaokeReportMember extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("item_num")
	private Long itemNum;

	@JsonProperty("iid")
	private String iid;

	@JsonProperty("item_title")
	private String itemTitle;

	@JsonProperty("category_id")
	private Long categoryId;

	@JsonProperty("app_key")
	private String appKey;

	@JsonProperty("pay_time")
	private String payTime;

	@JsonProperty("commission_rate")
	private String commissionRate;

	@JsonProperty("category_name")
	private String categoryName;

	@JsonProperty("trade_id")
	private Long tradeId;

	@JsonProperty("outer_code")
	private String outerCode;

	@JsonProperty("num_iid")
	private Long numIid;

	@JsonProperty("shop_title")
	private String shopTitle;

	@JsonProperty("commission")
	private String commission;

	@JsonProperty("seller_nick")
	private String sellerNick;

	@JsonProperty("pay_price")
	private String payPrice;

	public Long getItemNum() {
		return this.itemNum;
	}
	public void setItemNum(Long itemNum) {
		this.itemNum = itemNum;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getCommissionRate() {
		return this.commissionRate;
	}
	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Long getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}

	public String getOuterCode() {
		return this.outerCode;
	}
	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getShopTitle() {
		return this.shopTitle;
	}
	public void setShopTitle(String shopTitle) {
		this.shopTitle = shopTitle;
	}

	public String getCommission() {
		return this.commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getPayPrice() {
		return this.payPrice;
	}
	public void setPayPrice(String payPrice) {
		this.payPrice = payPrice;
	}

}
