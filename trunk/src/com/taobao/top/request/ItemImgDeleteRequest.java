package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.img.delete
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemImgDeleteRequest implements TopRequest {

	private Long id;
	private String iid;
	private Long itemimgId;
	private Long numIid;
	private String v;

	public void setId(Long id) {
		this.id = id;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}
	public void setItemimgId(Long itemimgId) {
		this.itemimgId = itemimgId;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public void setV(String v) {
		this.v = v;
	}

	public String getApiName() {
		return "taobao.item.img.delete";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("id", this.id);
		params.put("iid", this.iid);
		params.put("itemimg_id", this.itemimgId);
		params.put("num_iid", this.numIid);
		params.put("v", this.v);
		return params;
	}

}
