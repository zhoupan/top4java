package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.propimg.upload
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemPropImgUploadRequest implements TopUploadRequest {

	/** 属性图片编号 */
	private Long imgId;

	/** 商品编号 */
	private String iid;

	/** 属性图片属性串 */
	private String props;

	/** 属性图片位置 */
	private Integer position;

	/** 属性图片内容 */
	public FileItem image;

	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	public void setProps(String props) {
		this.props = props;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}

	public String getApiName() {
		return "taobao.item.propimg.upload";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("propimg_id", this.imgId);
		params.put("iid", this.iid);
		params.put("properties", this.props);
		params.put("position", this.position);

		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

}
