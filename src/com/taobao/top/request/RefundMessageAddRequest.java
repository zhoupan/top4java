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
	private String ownerNick;
	private Long refundId;
	private String v;

	public void setContent(String content) {
		this.content = content;
	}
	public void setImage(FileItem image) {
		this.image = image;
	}
	public void setOwnerNick(String ownerNick) {
		this.ownerNick = ownerNick;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}
	public void setV(String v) {
		this.v = v;
	}

	public String getApiName() {
		return "taobao.refund.message.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("content", this.content);
		params.put("owner_nick", this.ownerNick);
		params.put("refund_id", this.refundId);
		params.put("v", this.v);
		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

}
