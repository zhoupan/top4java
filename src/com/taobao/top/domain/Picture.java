package com.taobao.top.domain;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 图片。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class Picture extends BaseObject {

	/** 图片编号 */
	@JsonProperty("picture_id")
	private Long id;

	/** 图片分类编号 */
	@JsonProperty("picture_category_id")
	private Long cid;

	/** 图片地址 */
	@JsonProperty("picture_path")
	private String url;

	/** 图片大小 */
	@JsonProperty("sizes")
	private Integer size;

	/** 图片像素 */
	@JsonProperty("pixel")
	private String pixel;

	/** 图片状态 */
	@JsonProperty("status")
	private String status;

	/** 图片是否已经被删除 */
	@JsonProperty("deleted")
	private String deleted;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCid() {
		return this.cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getPixel() {
		return this.pixel;
	}

	public void setPixel(String pixel) {
		this.pixel = pixel;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}
