package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.update.showcase
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemRecommendAddRequest implements TopRequest {

	/** 需要橱窗推荐的商品编号 */
	private String iid;

	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getApiName() {
		return "taobao.item.update.showcase";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("iid", this.iid);

		return params;
	}

}
