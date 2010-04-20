package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.picture.category.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class PictureCategoryGetRequest implements TopRequest {

	private Long pictureCategoryId;
	private String pictureCategoryName;
	private String type;

	public void setPictureCategoryId(Long pictureCategoryId) {
		this.pictureCategoryId = pictureCategoryId;
	}
	public void setPictureCategoryName(String pictureCategoryName) {
		this.pictureCategoryName = pictureCategoryName;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getApiName() {
		return "taobao.picture.category.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("picture_category_id", this.pictureCategoryId);
		params.put("picture_category_name", this.pictureCategoryName);
		params.put("type", this.type);
		return params;
	}

}
