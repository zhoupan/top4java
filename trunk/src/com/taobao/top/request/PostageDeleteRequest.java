package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.postage.delete
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class PostageDeleteRequest implements TopRequest {

	/** 邮费模板编号 */
	private String postageId;

	public void setPostageId(String postageId) {
		this.postageId = postageId;
	}

	public String getApiName() {
		return "taobao.postage.delete";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("postage_id", this.postageId);
		return params;
	}

}
