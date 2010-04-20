package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;

/**
 * Shop Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("shop")
public class Shop extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("bulletin")
	private String bulletin;

	@ApiField("cid")
	private String cid;

	@ApiField("created")
	private Date created;

	@ApiField("desc")
	private String desc;

	@ApiField("modified")
	private Date modified;

	@ApiField("nick")
	private String nick;

	@ApiField("pic_path")
	private String picPath;

	@ApiField("remain_count")
	private Integer remainCount;

	@ApiField("shop_score")
	private ShopScore shopScore;

	@ApiField("sid")
	private String sid;

	@ApiField("title")
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
