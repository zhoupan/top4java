package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 产品图片。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class ProductImg extends BaseObject {

	/** 产品图片编号 */
	@JsonProperty("pic_id")
	private Long imgId;

	/** 产品图片绝对地址 */
	@JsonProperty("url")
	private String imgUrl;

	/** 产品图片序号 */
	@JsonProperty("position")
	private Integer position;

	/** 图片所属产品的编号 */
	@JsonProperty("product_id")
	private Long productId;

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

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

}
