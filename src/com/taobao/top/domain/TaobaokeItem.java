package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 淘宝客商品。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("taobaokeItems")
public class TaobaokeItem extends BaseObject {

	/** 淘宝客商品编号 */
	@JsonProperty("id")
	private String iid;

	/** 宝贝名称 */
	@JsonProperty("title")
	private String title;

	/** 卖家昵称 */
	@JsonProperty("nick")
	private String nick;

	/** 图片地址 */
	@JsonProperty("pict_url")
	private String picUrl;

	/** 商品价格 */
	@JsonProperty("price")
	private String price;

	/** 推广点击网址 */
	@JsonProperty("click_url")
	private String clickUrl;

	/** 淘宝客佣金 */
	@JsonProperty("commission")
	private String commission;

	/** 淘宝客佣金比率 */
	@JsonProperty("commission_rate")
	private String commissionRate;

	/** 累计成交量 */
	@JsonProperty("commission_num")
	private String commissionNum;

	/** 累计总支出佣金量 */
	@JsonProperty("commission_volume")
	private String commissionVolume;

	public String getIid() {
		return this.iid;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
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

	public String getCommissionRate() {
		return this.commissionRate;
	}

	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String getCommissionNum() {
		return this.commissionNum;
	}

	public void setCommissionNum(String commissionNum) {
		this.commissionNum = commissionNum;
	}

	public String getCommissionVolume() {
		return this.commissionVolume;
	}

	public void setCommissionVolume(String commissionVolume) {
		this.commissionVolume = commissionVolume;
	}

}
