package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.joint.propimg
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemJointPropimgRequest implements TopRequest {

	private Long id;
	private String iid;
	private Long numIid;
	private String picPath;
	private Integer position;
	private String properties;

	public void setId(Long id) {
		this.id = id;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getApiName() {
		return "taobao.item.joint.propimg";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("id", this.id);
		params.put("iid", this.iid);
		params.put("num_iid", this.numIid);
		params.put("pic_path", this.picPath);
		params.put("position", this.position);
		params.put("properties", this.properties);
		return params;
	}

}
