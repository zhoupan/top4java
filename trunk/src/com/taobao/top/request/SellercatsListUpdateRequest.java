package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.sellercats.list.update
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class SellercatsListUpdateRequest implements TopRequest {

	private Integer cid;
	private String name;
	private String pictUrl;
	private Integer sortOrder;

	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPictUrl(String pictUrl) {
		this.pictUrl = pictUrl;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getApiName() {
		return "taobao.sellercats.list.update";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("cid", this.cid);
		params.put("name", this.name);
		params.put("pict_url", this.pictUrl);
		params.put("sort_order", this.sortOrder);
		return params;
	}

}
