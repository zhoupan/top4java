package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemcats.list.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemCatsListRequest implements TopRequest {

	/** 父商品类目编号 */
	private String parentCid;

	/** 类目编号列表 */
	private String cids;

	public void setParentCid(String parentCid) {
		this.parentCid = parentCid;
	}

	public void setCids(String cids) {
		this.cids = cids;
	}

	public String getApiName() {
		return "taobao.itemcats.list.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("parent_cid", this.parentCid);
		params.put("cids", this.cids);

		return params;
	}

}
