package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.sellercats.list.update
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class SellerCatUpdateRequest implements TopRequest {

	/** 卖家自定义类目名称 */
	private String name;

	/** 卖家自定义类目编号 */
	private String cid;

	/** 该类目的链接图片地址 */
	private String picUrl;

	/** 该类目在页面上的排序位置 */
	private Integer position;

	public void setName(String name) {
		this.name = name;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getApiName() {
		return "taobao.sellercats.list.update";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("name", this.name);
		params.put("cid", this.cid);
		params.put("pict_url", this.picUrl);
		params.put("sort_order", this.position);

		return params;
	}

}
