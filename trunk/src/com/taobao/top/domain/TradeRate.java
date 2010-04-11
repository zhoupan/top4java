package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;

/**
 * TradeRate Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("trade_rate")
@JsonListClass("trade_rates")
public class TradeRate extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("content")
	private String content;

	@JsonField("created")
	private Date created;

	@JsonField("item_price")
	private String itemPrice;

	@JsonField("item_title")
	private String itemTitle;

	@JsonField("nick")
	private String nick;

	@JsonField("oid")
	private Long oid;

	@JsonField("rated_nick")
	private String ratedNick;

	@JsonField("reply")
	private String reply;

	@JsonField("result")
	private String result;

	@JsonField("role")
	private String role;

	@JsonField("tid")
	private Long tid;

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

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
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

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

}
