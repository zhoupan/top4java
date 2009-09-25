package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 属性图片。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("propImgs")
public class PropImg extends BaseObject {

	/** 属性图片的编号 */
	@JsonProperty("propimg_id")
	private Long imgId;

	/** 属性图片链接地址 */
	@JsonProperty("url")
	private String imgUrl;

	/** 属性图片所对应的属性组合的字符串 */
	@JsonProperty("properties")
	private String props;

	/** 属性图片放在第几张（多图时可设置） */
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
