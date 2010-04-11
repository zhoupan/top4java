package com.taobao.top.domain;

import java.util.Date;
import java.util.List;

import com.taobao.top.mapping.JsonList;
import com.taobao.top.mapping.JsonProperty;

/**
 * RefundMessage Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class RefundMessage extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("content")
	private String content;

	@JsonProperty("created")
	private Date created;

	@JsonProperty("id")
	private Long id;

	@JsonProperty("message_type")
	private String messageType;

	@JsonProperty("owner_id")
	private Long ownerId;

	@JsonProperty("owner_nick")
	private String ownerNick;

	@JsonProperty("owner_role")
	private String ownerRole;

	@JsonList(list="pic_urls", name="pic_url")
	private List<PicUrl> picUrls;

	@JsonProperty("refund_id")
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
