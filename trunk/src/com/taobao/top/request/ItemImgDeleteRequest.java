package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.img.delete
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemImgDeleteRequest implements TopRequest {

	/** 商品图片编号 */
	private Long imgId;

	/** 商品编号 */
	private String iid;

	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getApiName() {
		return "taobao.item.img.delete";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("itemimg_id", this.imgId);
		params.put("iid", this.iid);

		return params;
	}

}
