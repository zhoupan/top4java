package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.img.upload
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemImgUploadRequest implements TopUploadRequest {

	/** 商品图片编号 */
	private Long imgId;

	/** 商品编号 */
	private String iid;

	/** 商品图片位置 */
	private Integer position;

	/** 商品图片内容 */
	public FileItem image;

	/** 是否将该图片设为主图 */
	private Boolean primary;

	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}

	public void setPrimary(Boolean primary) {
		this.primary = primary;
	}

	public String getApiName() {
		return "taobao.item.img.upload";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("itemimg_id", this.imgId);
		params.put("iid", this.iid);
		params.put("position", this.position);
		params.put("is_major", this.primary);

		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

}
