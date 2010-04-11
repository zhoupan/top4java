package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonProperty;

/**
 * TradeRate Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradeRate extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("created")
	private Date created;

	@JsonProperty("oid")
	private Long oid;

	@JsonProperty("tid")
	private Long tid;

	@JsonProperty("content")
	private String content;

	@JsonProperty("result")
	private String result;

	@JsonProperty("item_price")
	private String itemPrice;

	@JsonProperty("nick")
	private String nick;

	@JsonProperty("item_title")
	private String itemTitle;

	@JsonProperty("rated_nick")
	private String ratedNick;

	@JsonProperty("reply")
	private String reply;

	@JsonProperty("role")
	private String role;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getRatedNick() {
		return this.ratedNick;
	}
	public void setRatedNick(String ratedNick) {
		this.ratedNick = ratedNick;
	}

	public String getReply() {
		return this.reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
