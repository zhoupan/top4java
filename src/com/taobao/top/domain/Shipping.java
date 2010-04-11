package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonProperty;

/**
 * Shipping Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class Shipping extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("is_success")
	private Boolean isSuccess;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("status")
	private String status;

	@JsonProperty("item_title")
	private String itemTitle;

	@JsonProperty("type")
	private String type;

	@JsonProperty("seller_confirm")
	private String sellerConfirm;

	@JsonProperty("freight_payer")
	private String freightPayer;

	@JsonProperty("receiver_mobile")
	private String receiverMobile;

	@JsonProperty("receiver_phone")
	private String receiverPhone;

	@JsonProperty("receiver_name")
	private String receiverName;

	@JsonProperty("buyer_nick")
	private String buyerNick;

	@JsonProperty("delivery_start")
	private String deliveryStart;

	@JsonProperty("company_name")
	private String companyName;

	@JsonProperty("delivery_end")
	private String deliveryEnd;

	@JsonProperty("out_sid")
	private String outSid;

	@JsonProperty("tid")
	private Long tid;

	@JsonProperty("seller_nick")
	private String sellerNick;

	@JsonProperty("modified")
	private Date modified;

	@JsonProperty("created")
	private Date created;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getSellerConfirm() {
		return this.sellerConfirm;
	}
	public void setSellerConfirm(String sellerConfirm) {
		this.sellerConfirm = sellerConfirm;
	}

	public String getFreightPayer() {
		return this.freightPayer;
	}
	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getDeliveryStart() {
		return this.deliveryStart;
	}
	public void setDeliveryStart(String deliveryStart) {
		this.deliveryStart = deliveryStart;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDeliveryEnd() {
		return this.deliveryEnd;
	}
	public void setDeliveryEnd(String deliveryEnd) {
		this.deliveryEnd = deliveryEnd;
	}

	public String getOutSid() {
		return this.outSid;
	}
	public void setOutSid(String outSid) {
		this.outSid = outSid;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
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

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

}
