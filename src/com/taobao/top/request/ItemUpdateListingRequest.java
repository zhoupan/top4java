package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.update.listing
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemUpdateListingRequest implements TopRequest {

	private String iid;
	private Long num;
	private Long numIid;

	public void setIid(String iid) {
		this.iid = iid;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getApiName() {
		return "taobao.item.update.listing";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("iid", this.iid);
		params.put("num", this.num);
		params.put("num_iid", this.numIid);
		return params;
	}

}
