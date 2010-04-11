package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemcat.features.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemcatFeaturesGetRequest implements TopRequest {

	private String attrKeys;
	private Long cid;

	public void setAttrKeys(String attrKeys) {
		this.attrKeys = attrKeys;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getApiName() {
		return "taobao.itemcat.features.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("attr_keys", this.attrKeys);
		params.put("cid", this.cid);
		return params;
	}

}
