package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.joint.img
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemJointImgRequest implements TopRequest {

	private Long id;
	private String iid;
	private Boolean isMajor;
	private Long numIid;
	private String picPath;
	private Integer position;

	public void setId(Long id) {
		this.id = id;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}
	public void setIsMajor(Boolean isMajor) {
		this.isMajor = isMajor;
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

	public String getApiName() {
		return "taobao.item.joint.img";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("id", this.id);
		params.put("iid", this.iid);
		params.put("is_major", this.isMajor);
		params.put("num_iid", this.numIid);
		params.put("pic_path", this.picPath);
		params.put("position", this.position);
		return params;
	}

}
