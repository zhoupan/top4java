package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemprops.list.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemPropsListRequest implements TopRequest {

	/** 叶子类目编号 */
	private String cid;

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getApiName() {
		return "taobao.itemprops.list.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("cid", this.cid);
		return params;
	}

}
