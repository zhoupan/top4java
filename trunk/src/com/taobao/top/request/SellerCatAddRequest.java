package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.sellercats.list.add
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class SellerCatAddRequest implements TopRequest {

	/** 卖家自定义类目名称 */
	private String name;

	/** 该类目的链接图片地址 */
	private String picUrl;

	/** 父类目编号 */
	private Long parentCid;

	/** 该类目在页面上的排序位置 */
	private Integer position;

	public void setName(String name) {
		this.name = name;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public void setParentCid(Long parentCid) {
		this.parentCid = parentCid;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getApiName() {
		return "taobao.sellercats.list.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("name", this.name);
		params.put("pict_url", this.picUrl);
		params.put("parent_cid", this.parentCid);
		params.put("sort_order", this.position);

		return params;
	}

}
