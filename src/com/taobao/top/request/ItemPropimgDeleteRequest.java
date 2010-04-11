package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.propimg.delete
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemPropimgDeleteRequest implements TopRequest {

	private Long id;
	private String iid;
	private Long numIid;
	private Long propimgId;
	private String v;

	public void setId(Long id) {
		this.id = id;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public void setPropimgId(Long propimgId) {
		this.propimgId = propimgId;
	}
	public void setV(String v) {
		this.v = v;
	}

	public String getApiName() {
		return "taobao.item.propimg.delete";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("id", this.id);
		params.put("iid", this.iid);
		params.put("num_iid", this.numIid);
		params.put("propimg_id", this.propimgId);
		params.put("v", this.v);
		return params;
	}

}
