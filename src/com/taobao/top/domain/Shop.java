package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;

/**
 * Shop Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("shop")
public class Shop extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("bulletin")
	private String bulletin;

	@JsonField("cid")
	private String cid;

	@JsonField("created")
	private Date created;

	@JsonField("desc")
	private String desc;

	@JsonField("modified")
	private Date modified;

	@JsonField("nick")
	private String nick;

	@JsonField("pic_path")
	private String picPath;

	@JsonField("remain_count")
	private Integer remainCount;

	@JsonField("shop_score")
	private ShopScore shopScore;

	@JsonField("sid")
	private String sid;

	@JsonField("title")
	private String title;

	public String getBulletin() {
		return this.bulletin;
	}
	public void setBulletin(String bulletin) {
		this.bulletin = bulletin;
	}

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPicPath() {
		return this.picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public Integer getRemainCount() {
		return this.remainCount;
	}
	public void setRemainCount(Integer remainCount) {
		this.remainCount = remainCount;
	}

	public ShopScore getShopScore() {
		return this.shopScore;
	}
	public void setShopScore(ShopScore shopScore) {
		this.shopScore = shopScore;
	}

	public String getSid() {
		return this.sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
