package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.update.delisting
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemUpdateDelistingRequest implements TopRequest {

	private String iid;
	private Long numIid;

	public void setIid(String iid) {
		this.iid = iid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getApiName() {
		return "taobao.item.update.delisting";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("iid", this.iid);
		params.put("num_iid", this.numIid);
		return params;
	}

}
