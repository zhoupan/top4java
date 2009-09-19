package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 相册。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class Album extends BaseObject {

	/** 相册编号 */
	@JsonProperty("id")
	private Long id;

	/** 用户编号 */
	@JsonProperty("uid")
	private Long uid;

	/** 用户昵称 */
	@JsonProperty("nick")
	private String nick;

	/** 相册名称 */
	@JsonProperty("name")
	private String name;

	/** 相册描述 */
	@JsonProperty("memo")
	private String memo;

	/** 封面地址 */
	@JsonProperty("cover_url")
	private String coverUrl;

	/** 照片总数 */
	@JsonProperty("pic_count")
	private Long picCount;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getCoverUrl() {
		return this.coverUrl;
	}

	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	public Long getPicCount() {
		return this.picCount;
	}

	public void setPicCount(Long picCount) {
		this.picCount = picCount;
	}

}