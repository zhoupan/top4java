package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.joint.img
 * 
 * @author fengsheng
 * @since 1.0, Sep 28, 2009
 */
public class ItemImgJointRequest implements TopRequest {

	/** 商品图片编号 */
	private Long imgId;

	/** 商品编号 */
	private String iid;

	/** 商品图片位置 */
	private Integer position;

	/** 商品图片地址 */
	private String url;

	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getApiName() {
		return "taobao.item.joint.img";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("itemimg_id", this.imgId);
		params.put("iid", this.iid);
		params.put("position", this.position);
		params.put("url", this.url);

		return params;
	}

}
