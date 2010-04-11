package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.product.img.upload
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ProductImgUploadRequest implements TopRequest {

	private Long id;
	private FileItem image;
	private String isMajor;
	private Long picId;
	private String position;
	private String productId;

	public void setId(Long id) {
		this.id = id;
	}
	public void setImage(FileItem image) {
		this.image = image;
	}
	public void setIsMajor(String isMajor) {
		this.isMajor = isMajor;
	}
	public void setPicId(Long picId) {
		this.picId = picId;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getApiName() {
		return "taobao.product.img.upload";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("id", this.id);
		params.put("is_major", this.isMajor);
		params.put("pic_id", this.picId);
		params.put("position", this.position);
		params.put("product_id", this.productId);
		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

}
