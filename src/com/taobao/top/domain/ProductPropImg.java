package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 产品属性图片。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class ProductPropImg extends BaseObject {

	/** 产品属性图片编号 */
	@JsonProperty("pic_id")
	private Long imgId;

	/** 图片绝对地址 */
	@JsonProperty("url")
	private String imgUrl;

	/** 图片所属产品的编号 */
	@JsonProperty("product_id")
	private Long productId;

	/** 属性串 */
	@JsonProperty("props")
	private String props;

	/** 图片序号 */
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

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProps() {
		return this.props;
	}

	public void setProps(String props) {
		this.props = props;
	}

	public Integer getPosition() {
		return this.position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

}
