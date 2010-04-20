package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListClass;

/**
 * Picture Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("picture")
@ApiListClass("pictures")
public class Picture extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("created")
	private Date created;

	@ApiField("deleted")
	private String deleted;

	@ApiField("modified")
	private Date modified;

	@ApiField("picture_category_id")
	private Long pictureCategoryId;

	@ApiField("picture_id")
	private Long pictureId;

	@ApiField("picture_path")
	private String picturePath;

	@ApiField("pixel")
	private String pixel;

	@ApiField("sizes")
	private Long sizes;

	@ApiField("status")
	private String status;

	@ApiField("title")
	private String title;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDeleted() {
		return this.deleted;
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getPictureCategoryId() {
		return this.pictureCategoryId;
	}
	public void setPictureCategoryId(Long pictureCategoryId) {
		this.pictureCategoryId = pictureCategoryId;
	}

	public Long getPictureId() {
		return this.pictureId;
	}
	public void setPictureId(Long pictureId) {
		this.pictureId = pictureId;
	}

	public String getPicturePath() {
		return this.picturePath;
	}
	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public String getPixel() {
		return this.pixel;
	}
	public void setPixel(String pixel) {
		this.pixel = pixel;
	}

	public Long getSizes() {
		return this.sizes;
	}
	public void setSizes(Long sizes) {
		this.sizes = sizes;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
