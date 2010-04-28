package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.product.propimg.upload
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ProductPropimgUploadRequest implements TopUploadRequest {

	private Long id;
	private FileItem image;
	private Integer position;
	private Long productId;
	private String props;

	public void setId(Long id) {
		this.id = id;
	}
	public void setImage(FileItem image) {
		this.image = image;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public void setProps(String props) {
		this.props = props;
	}

	public String getApiName() {
		return "taobao.product.propimg.upload";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("id", this.id);
		params.put("position", this.position);
		params.put("product_id", this.productId);
		params.put("props", this.props);
		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

}
