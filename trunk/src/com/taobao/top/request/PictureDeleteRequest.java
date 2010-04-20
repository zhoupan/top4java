package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.picture.delete
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class PictureDeleteRequest implements TopRequest {

	private String pictureIds;

	public void setPictureIds(String pictureIds) {
		this.pictureIds = pictureIds;
	}

	public String getApiName() {
		return "taobao.picture.delete";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("picture_ids", this.pictureIds);
		return params;
	}

}
