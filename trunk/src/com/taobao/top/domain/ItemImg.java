package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 商品图片。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("itemImgs")
public class ItemImg extends BaseObject {

	private static final long serialVersionUID = 1187037974768271197L;

	/** 商品图片的编号 */
	@JsonProperty("itemimg_id")
	private Long imgId;

	/** 商品图片链接地址 */
	@JsonProperty("url")
	private String imgUrl;

	/** 图片放在第几张(多图时可设置) */
	@JsonProperty("position")
	private Integer position;

	public Long getImgId() {
		return this.imgId;
	}

	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Integer getPosition() {
		return this.position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

}
