package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.picture.upload
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class PictureUploadRequest implements TopRequest {

	private String imageInputTitle;
	private FileItem img;
	private Long pictureCategoryId;
	private String title;

	public void setImageInputTitle(String imageInputTitle) {
		this.imageInputTitle = imageInputTitle;
	}
	public void setImg(FileItem img) {
		this.img = img;
	}
	public void setPictureCategoryId(Long pictureCategoryId) {
		this.pictureCategoryId = pictureCategoryId;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getApiName() {
		return "taobao.picture.upload";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("image_input_title", this.imageInputTitle);
		params.put("picture_category_id", this.pictureCategoryId);
		params.put("title", this.title);
		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("img", this.img);
		return params;
	}

}
