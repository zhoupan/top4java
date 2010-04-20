package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.picture.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class PictureGetRequest implements TopRequest {

	private String deleted;
	private Date endDate;
	private String orderBy;
	private Integer pageNo;
	private Integer pageSize;
	private Long pictureCategoryId;
	private Long pictureId;
	private Date startDate;
	private String title;

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public void setPictureCategoryId(Long pictureCategoryId) {
		this.pictureCategoryId = pictureCategoryId;
	}
	public void setPictureId(Long pictureId) {
		this.pictureId = pictureId;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getApiName() {
		return "taobao.picture.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("deleted", this.deleted);
		params.put("end_date", this.endDate);
		params.put("order_by", this.orderBy);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("picture_category_id", this.pictureCategoryId);
		params.put("picture_id", this.pictureId);
		params.put("start_date", this.startDate);
		params.put("title", this.title);
		return params;
	}

}
