package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.picture.category.add
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class PictureCategoryAddRequest implements TopRequest {

	private String pictureCategoryName;

	public void setPictureCategoryName(String pictureCategoryName) {
		this.pictureCategoryName = pictureCategoryName;
	}

	public String getApiName() {
		return "taobao.picture.category.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("picture_category_name", this.pictureCategoryName);
		return params;
	}

}
