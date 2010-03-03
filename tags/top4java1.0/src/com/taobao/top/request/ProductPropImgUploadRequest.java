package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.product.propimg.upload
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ProductPropImgUploadRequest implements TopUploadRequest {

	/** 产品属性图片编号 */
	private Long imgId;

	/** 产品编号 */
	private Long productId;

	/** 属性串 */
	private String props;

	/** 子图片文件 */
	public FileItem image;

	/** 图片序号 */
	private Integer position;

	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public void setProps(String props) {
		this.props = props;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getApiName() {
		return "taobao.product.propimg.upload";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("pic_id", this.imgId);
		params.put("product_id", this.productId);
		params.put("props", this.props);
		params.put("position", this.position);

		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

}
