package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;

/**
 * Refund Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("refund")
@JsonListClass("refunds")
public class Refund extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("address")
	private String address;

	@JsonField("alipay_no")
	private String alipayNo;

	@JsonField("buyer_nick")
	private String buyerNick;

	@JsonField("company_name")
	private String companyName;

	@JsonField("created")
	private Date created;

	@JsonField("desc")
	private String desc;

	@JsonField("good_return_time")
	private String goodReturnTime;

	@JsonField("good_status")
	private String goodStatus;

	@JsonField("has_good_return")
	private Boolean hasGoodReturn;

	@JsonField("iid")
	private String iid;

	@JsonField("modified")
	private Date modified;

	@JsonField("num")
	private Integer num;

	@JsonField("oid")
	private Long oid;

	@JsonField("order_status")
	private String orderStatus;

	@JsonField("payment")
	private String payment;

	@JsonField("price")
	private String price;

	@JsonField("reason")
	private String reason;

	@JsonField("refund_fee")
	private String refundFee;

	@JsonField("refund_id")
	private Long refundId;

	@JsonField("refund_remind_timeout")
	private RefundRemindTimeout refundRemindTimeout;

	@JsonField("seller_nick")
	private String sellerNick;

	@JsonField("shipping_type")
	private String shippingType;

	@JsonField("sid")
	private String sid;

	@JsonField("status")
	private String status;

	@JsonField("tid")
	private Long tid;

	@JsonField("title")
	private String title;

	@JsonField("total_fee")
	private String totalFee;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlipayNo() {
		return this.alipayNo;
	}
	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getGoodReturnTime() {
		return this.goodReturnTime;
	}
	public void setGoodReturnTime(String goodReturnTime) {
		this.goodReturnTime = goodReturnTime;
	}

	public String getGoodStatus() {
		return this.goodStatus;
	}
	public void setGoodStatus(String goodStatus) {
		this.goodStatus = goodStatus;
	}

	public Boolean getHasGoodReturn() {
		return this.hasGoodReturn;
	}
	public void setHasGoodReturn(Boolean hasGoodReturn) {
		this.hasGoodReturn = hasGoodReturn;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Integer getNum() {
		return this.num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public Long getRefundId() {
		return this.refundId;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public RefundRemindTimeout getRefundRemindTimeout() {
		return this.refundRemindTimeout;
	}
	public void setRefundRemindTimeout(RefundRemindTimeout refundRemindTimeout) {
		this.refundRemindTimeout = refundRemindTimeout;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getShippingType() {
		return this.shippingType;
	}
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public String getSid() {
		return this.sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
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

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

}
