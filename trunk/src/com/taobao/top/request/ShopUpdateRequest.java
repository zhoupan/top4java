package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.shop.update
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ShopUpdateRequest implements TopRequest {

	private String bulletin;
	private String desc;
	private String title;

	public void setBulletin(String bulletin) {
		this.bulletin = bulletin;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getApiName() {
		return "taobao.shop.update";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("bulletin", this.bulletin);
		params.put("desc", this.desc);
		params.put("title", this.title);
		return params;
	}

}
