package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.refund.message.add
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class RefundMessageAddRequest implements TopUploadRequest {

	/** 退款编号 */
	private Long rid;

	/** 退款留言内容 */
	private String content;

	/** 用户昵称 */
	private String ownerNick;

	/** 留言凭证 */
	public FileItem image;

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setOwnerNick(String ownerNick) {
		this.ownerNick = ownerNick;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}

	public String getApiName() {
		return "taobao.refund.message.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("refund_id", this.rid);
		params.put("owner_nick", this.ownerNick);
		params.put("content", this.content);

		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

}
