package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.update.listing
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemEnlistRequest implements TopRequest {

	/** 需要上架的商品编号 */
	private String iid;

	/** 需要上架的商品的数量 */
	private Integer num;

	public void setIid(String iid) {
		this.iid = iid;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getApiName() {
		return "taobao.item.update.listing";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("iid", this.iid);
		params.put("num", this.num);

		return params;
	}

}
