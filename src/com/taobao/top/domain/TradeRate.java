package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 交易评价。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class TradeRate extends BaseObject {

	/** 交易编号 */
	@JsonProperty("tid")
	private Long tid;

	/** 子订单编号 */
	@JsonProperty("order_id")
	private Long orderId;

	/** 评价者角色 */
	@JsonProperty("role")
	private String role;

	/** 评价者昵称 */
	@JsonProperty("nick")
	private String raterNick;

	/** 被评价者昵称 */
	@JsonProperty("rated_nick")
	private String ratedNick;

	/** 评价结果 */
	@JsonProperty("result")
	private String result;

	/** 商品标题 */
	@JsonProperty("item_title")
	private String itemTitle;

	/** 商品价格 */
	@JsonProperty("item_price")
	private String itemPrice;

	/** 评价内容 */
	@JsonProperty("content")
	private String content;

	/** 评价解释 */
	@JsonProperty("reply")
	private String reply;

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRaterNick() {
		return this.raterNick;
	}

	public void setRaterNick(String raterNick) {
		this.raterNick = raterNick;
	}

	public String getRatedNick() {
		return this.ratedNick;
	}

	public void setRatedNick(String ratedNick) {
		this.ratedNick = ratedNick;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}

	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getReply() {
		return this.reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

}
