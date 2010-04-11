package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonProperty;

/**
 * NotifyRefund Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class NotifyRefund extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("buyer_nick")
	private String buyerNick;

	@JsonProperty("modified")
	private Date modified;

	@JsonProperty("refund_fee")
	private String refundFee;

	@JsonProperty("rid")
	private Long rid;

	@JsonProperty("seller_nick")
	private String sellerNick;

	@JsonProperty("status")
	private String status;

	@JsonProperty("tid")
	private Long tid;

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public Long getRid() {
		return this.rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

}
