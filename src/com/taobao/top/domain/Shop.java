package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 店铺。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("shops")
public class Shop extends BaseObject {

	/** 店铺编号 */
	@JsonProperty("sid")
	private Long sid;

	/** 店铺所属的类目编号 */
	@JsonProperty("cid")
	private Long cid;

	/** 卖家昵称 */
	@JsonProperty("nick")
	private String sellerNick;

	/** 店铺标题 */
	@JsonProperty("title")
	private String title;

	/** 店铺描述 */
	@JsonProperty("desc")
	private String description;

	/** 店铺公告 */
	@JsonProperty("bulletin")
	private String bulletin;

	/** 店标地址 */
	@JsonProperty("pic_path")
	private String logoUrl;

	/** 剩余橱窗推荐数 */
	@JsonProperty("remain_count")
	private Integer remainShowcase;

	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public Long getCid() {
		return this.cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBulletin() {
		return this.bulletin;
	}

	public void setBulletin(String bulletin) {
		this.bulletin = bulletin;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public Integer getRemainShowcase() {
		return this.remainShowcase;
	}

	public void setRemainShowcase(Integer remainShowcase) {
		this.remainShowcase = remainShowcase;
	}

}
