package com.taobao.top.request;

import java.io.File;
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
	private String imgId;

	/** 商品编号 */
	private String iid;

	/** 商品图片位置 */
	private Integer position;

	/** 商品图片内容 */
	public File image;

	/** 是否将该图片设为主图 */
	private Boolean isPrimary;

	public String getApiName() {
		return "taobao.item.img.upload";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("itemimg_id", this.imgId);
		params.put("iid", this.iid);
		params.put("position", this.position);
		params.put("is_major", this.isPrimary);

		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", new FileItem(this.image));
		return params;
	}

}
