package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.propimg.delete
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemPropImgDeleteRequest implements TopRequest {

	/** 商品图片编号 */
	private String imgId;

	/** 商品编号 */
	private String iid;

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getApiName() {
		return "taobao.item.propimg.delete";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("propimg_id", this.imgId);
		params.put("iid", this.iid);

		return params;
	}

}
