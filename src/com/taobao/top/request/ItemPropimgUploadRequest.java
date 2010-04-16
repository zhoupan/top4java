package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.propimg.upload
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemPropimgUploadRequest implements TopRequest {

	private Long id;
	private String iid;
	private FileItem image;
	private Long numIid;
	private Integer position;
	private String properties;

	public void setId(Long id) {
		this.id = id;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}
	public void setImage(FileItem image) {
		this.image = image;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getApiName() {
		return "taobao.item.propimg.upload";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("id", this.id);
		params.put("iid", this.iid);
		params.put("num_iid", this.numIid);
		params.put("position", this.position);
		params.put("properties", this.properties);
		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

}
