package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonProperty;

/**
 * NotifyTrade Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class NotifyTrade extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("buyer_nick")
	private String buyerNick;

	@JsonProperty("payment")
	private String payment;

	@JsonProperty("status")
	private String status;

	@JsonProperty("is_3D")
	private Boolean is3D;

	@JsonProperty("tid")
	private Long tid;

	@JsonProperty("type")
	private String type;

	@JsonProperty("seller_nick")
	private String sellerNick;

	@JsonProperty("modified")
	private Date modified;

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIs3D() {
		return this.is3D;
	}
	public void setIs3D(Boolean is3D) {
		this.is3D = is3D;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

}
