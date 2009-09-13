package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.shop.update
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ShopUpdateRequest implements TopRequest {

	/** 店铺标题 */
	private String title;

	/** 店铺公告 */
	private String bulletin;

	/** 店铺描述 */
	private String description;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setBulletin(String bulletin) {
		this.bulletin = bulletin;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getApiName() {
		return "taobao.shop.update";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("title", this.title);
		params.put("bulletin", this.bulletin);
		params.put("desc", this.description);

		return params;
	}

}
