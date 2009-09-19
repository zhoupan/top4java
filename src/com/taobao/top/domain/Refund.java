package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 退款。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class Refund extends BaseObject {

	/** 退款单号 */
	@JsonProperty("refund_id")
	private Long rid;

	/** 淘宝交易单号 */
	@JsonProperty("tid")
	private Long tid;

	/** 子订单号 */
	@JsonProperty("oid")
	private Long oid;

	/** 支付宝交易号 */
	@JsonProperty("alipay_no")
	private String alipayNo;

	/** 交易总金额 */
	@JsonProperty("total_fee")
	private String totalFee;

	/** 买家昵称 */
	@JsonProperty("buyer_nick")
	private String buyerNick;

	/** 卖家昵称 */
	@JsonProperty("seller_nick")
	private String sellerNick;

	/** 退款对应的订单交易状态 */
	@JsonProperty("order_status")
	private String orderStatus;

	/** 退款状态 */
	@JsonProperty("status")
	private String refundStatus;

	/** 货物状态 */
	@JsonProperty("good_status")
	private String goodStatus;

	/** 买家是否需要退货 */
	@JsonProperty("has_good_return")
	private Boolean hasGoodReturn;

	/** 退还金额 */
	@JsonProperty("refund_fee")
	private String refundFee;

	/** 支付给卖家的金额 */
	@JsonProperty("payment")
	private String payment;

	/** 退款原因 */
	@JsonProperty("reason")
	private String reason;

	/** 退款说明 */
	@JsonProperty("desc")
	private String description;

	/** 申请退款的商品编号 */
	@JsonProperty("iid")
	private String iid;

	/** 商品标题 */
	@JsonProperty("title")
	private String itemTitle;

	/** 商品价格 */
	@JsonProperty("price")
	private String itemPrice;

	/** 商品购买数量 */
	@JsonProperty("num")
	private Integer itemNum;

	/** 退货时间 */
	@JsonProperty("good_return_time")
	private String goodReturnTime;

	/** 物流公司名称 */
	@JsonProperty("company_name")
	private String logisticsCompany;

	/** 退货运单号 */
	@JsonProperty("sid")
	private String sid;

	/** 卖家收货地址 */
	@JsonProperty("address")
	private String sellerAddress;

	/** 退款超时时间 */
	@JsonProperty("refund_remind_timeout")
	private RefundTimeout timeout;

	public Long getRid() {
		return this.rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getOid() {
		return this.oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getAlipayNo() {
		return this.alipayNo;
	}

	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getTotalFee() {
		return this.totalFee;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
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

	public String getRefundFee() {
		return this.refundFee;
	}

	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIid() {
		return this.iid;
	}

	public void setIid(String iid) {
		this.iid = iid;
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

	public Integer getItemNum() {
		return this.itemNum;
	}

	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}

	public String getGoodReturnTime() {
		return this.goodReturnTime;
	}

	public void setGoodReturnTime(String goodReturnTime) {
		this.goodReturnTime = goodReturnTime;
	}

	public String getLogisticsCompany() {
		return this.logisticsCompany;
	}

	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSellerAddress() {
		return this.sellerAddress;
	}

	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}

	public RefundTimeout getTimeout() {
		return this.timeout;
	}

	public void setTimeout(RefundTimeout timeout) {
		this.timeout = timeout;
	}

}
