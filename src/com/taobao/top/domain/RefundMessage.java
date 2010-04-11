package com.taobao.top.domain;

import java.util.Date;
import java.util.List;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;
import com.taobao.top.mapping.JsonListField;

/**
 * RefundMessage Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("refund_message")
@JsonListClass("refund_messages")
public class RefundMessage extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("content")
	private String content;

	@JsonField("created")
	private Date created;

	@JsonField("id")
	private Long id;

	@JsonField("message_type")
	private String messageType;

	@JsonField("owner_id")
	private Long ownerId;

	@JsonField("owner_nick")
	private String ownerNick;

	@JsonField("owner_role")
	private String ownerRole;

	@JsonField("pic_url")
	@JsonListField("pic_urls")
	private List<PicUrl> picUrls;

	@JsonField("refund_id")
	private Long refundId;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getMessageType() {
		return this.messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
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

}
