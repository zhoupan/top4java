package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.img.upload
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemImgUploadRequest implements TopRequest {

	private Long id;
	private String iid;
	private FileItem image;
	private Boolean isMajor;
	private Long numIid;
	private Integer position;

	public void setId(Long id) {
		this.id = id;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}
	public void setImage(FileItem image) {
		this.image = image;
	}
	public void setIsMajor(Boolean isMajor) {
		this.isMajor = isMajor;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getApiName() {
		return "taobao.item.img.upload";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("id", this.id);
		params.put("iid", this.iid);
		params.put("is_major", this.isMajor);
		params.put("num_iid", this.numIid);
		params.put("position", this.position);
		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

}
