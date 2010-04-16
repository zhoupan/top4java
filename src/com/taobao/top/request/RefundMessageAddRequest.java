package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.refund.message.add
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class RefundMessageAddRequest implements TopRequest {

	private String content;
	private FileItem image;
	private Long refundId;

	public void setContent(String content) {
		this.content = content;
	}
	public void setImage(FileItem image) {
		this.image = image;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public String getApiName() {
		return "taobao.refund.message.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("content", this.content);
		params.put("refund_id", this.refundId);
		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

}
