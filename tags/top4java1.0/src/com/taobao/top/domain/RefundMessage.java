package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 留言/凭证。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("refundMessages")
public class RefundMessage extends BaseObject {

	private static final long serialVersionUID = 3814583502849124589L;

	/** 留言编号 */
	@JsonProperty("message_id")
	private Long msgId;

	/** 留言内容 */
	@JsonProperty("content")
	private String msgContent;

	/** 留言类型。 */
	@JsonProperty("message_type")
	private String msgType;

	/** 凭证附件地址（图片） */
	@JsonProperty("picture_urls")
	private List<PicUrl> picUrls;

	/** 退款编号 */
	@JsonProperty("refund_id")
	private Long refundId;

	/** 留言者编号 */
	@JsonProperty("owner_id")
	private Long ownerId;

	/** 留言者昵称 */
	@JsonProperty("owner_nick")
	private String ownerNick;

	/** 留言者身份 */
	@JsonProperty("owner_role")
	private String ownerRole;

	public Long getMsgId() {
		return this.msgId;
	}

	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}

	public String getMsgContent() {
		return this.msgContent;
	}

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public String getMsgType() {
		return this.msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public List<PicUrl> getPicUrls() {
		return this.picUrls;
	}

	public void setPicUrls(List<PicUrl> picUrls) {
		this.picUrls = picUrls;
	}

	public Long getRefundId() {
		return this.refundId;
	}

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerNick() {
		return this.ownerNick;
	}

	public void setOwnerNick(String ownerNick) {
		this.ownerNick = ownerNick;
	}

	public String getOwnerRole() {
		return this.ownerRole;
	}

	public void setOwnerRole(String ownerRole) {
		this.ownerRole = ownerRole;
	}

}