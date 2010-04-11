package com.taobao.top.domain;

import java.util.Date;
import java.util.List;

import com.taobao.top.mapping.JsonList;
import com.taobao.top.mapping.JsonProperty;

/**
 * Trade Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class Trade extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("tid")
	private Long tid;

	@JsonProperty("modified")
	private Date modified;

	@JsonProperty("seller_name")
	private String sellerName;

	@JsonList(list="orders", name="order")
	private List<Order> orders;

	@JsonProperty("buyer_obtain_point_fee")
	private Integer buyerObtainPointFee;

	@JsonProperty("buyer_memo")
	private String buyerMemo;

	@JsonProperty("iid")
	private String iid;

	@JsonProperty("seller_memo")
	private String sellerMemo;

	@JsonProperty("receiver_address")
	private String receiverAddress;

	@JsonProperty("seller_alipay_no")
	private String sellerAlipayNo;

	@JsonProperty("adjust_fee")
	private String adjustFee;

	@JsonProperty("type")
	private String type;

	@JsonProperty("receiver_phone")
	private String receiverPhone;

	@JsonProperty("trade_memo")
	private String tradeMemo;

	@JsonProperty("created")
	private Date created;

	@JsonProperty("total_fee")
	private String totalFee;

	@JsonProperty("has_post_fee")
	private Boolean hasPostFee;

	@JsonProperty("is_3D")
	private Boolean is3D;

	@JsonProperty("seller_nick")
	private String sellerNick;

	@JsonProperty("discount_fee")
	private String discountFee;

	@JsonProperty("available_confirm_fee")
	private String availableConfirmFee;

	@JsonProperty("status")
	private String status;

	@JsonProperty("shipping_type")
	private String shippingType;

	@JsonProperty("receiver_city")
	private String receiverCity;

	@JsonProperty("seller_phone")
	private String sellerPhone;

	@JsonProperty("cod_fee")
	private String codFee;

	@JsonProperty("cod_status")
	private String codStatus;

	@JsonProperty("pay_time")
	private String payTime;

	@JsonProperty("receiver_mobile")
	private String receiverMobile;

	@JsonProperty("receiver_name")
	private String receiverName;

	@JsonProperty("buyer_nick")
	private String buyerNick;

	@JsonProperty("snapshot_url")
	private String snapshotUrl;

	@JsonProperty("seller_rate")
	private Boolean sellerRate;

	@JsonProperty("price")
	private String price;

	@JsonProperty("end_time")
	private String endTime;

	@JsonProperty("consign_time")
	private String consignTime;

	@JsonProperty("receiver_zip")
	private String receiverZip;

	@JsonProperty("buyer_message")
	private String buyerMessage;

	@JsonProperty("pic_path")
	private String picPath;

	@JsonProperty("buyer_rate")
	private Boolean buyerRate;

	@JsonProperty("title")
	private String title;

	@JsonProperty("buyer_email")
	private String buyerEmail;

	@JsonProperty("alipay_no")
	private String alipayNo;

	@JsonProperty("buyer_alipay_no")
	private String buyerAlipayNo;

	@JsonProperty("commission_fee")
	private String commissionFee;

	@JsonProperty("receiver_state")
	private String receiverState;

	@JsonProperty("sid")
	private String sid;

	@JsonProperty("payment")
	private String payment;

	@JsonProperty("received_payment")
	private String receivedPayment;

	@JsonProperty("timeout_action_time")
	private String timeoutActionTime;

	@JsonProperty("post_fee")
	private String postFee;

	@JsonProperty("point_fee")
	private Integer pointFee;

	@JsonProperty("receiver_district")
	private String receiverDistrict;

	@JsonProperty("num")
	private Integer num;

	@JsonProperty("real_point_fee")
	private Integer realPointFee;

	@JsonProperty("seller_mobile")
	private String sellerMobile;

	@JsonProperty("seller_email")
	private String sellerEmail;

	@JsonProperty("snapshot")
	private String snapshot;

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public List<Order> getOrders() {
		return this.orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Integer getBuyerObtainPointFee() {
		return this.buyerObtainPointFee;
	}
	public void setBuyerObtainPointFee(Integer buyerObtainPointFee) {
		this.buyerObtainPointFee = buyerObtainPointFee;
	}

	public String getBuyerMemo() {
		return this.buyerMemo;
	}
	public void setBuyerMemo(String buyerMemo) {
		this.buyerMemo = buyerMemo;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getSellerMemo() {
		return this.sellerMemo;
	}
	public void setSellerMemo(String sellerMemo) {
		this.sellerMemo = sellerMemo;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getSellerAlipayNo() {
		return this.sellerAlipayNo;
	}
	public void setSellerAlipayNo(String sellerAlipayNo) {
		this.sellerAlipayNo = sellerAlipayNo;
	}

	public String getAdjustFee() {
		return this.adjustFee;
	}
	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getTradeMemo() {
		return this.tradeMemo;
	}
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public Boolean getHasPostFee() {
		return this.hasPostFee;
	}
	public void setHasPostFee(Boolean hasPostFee) {
		this.hasPostFee = hasPostFee;
	}

	public Boolean getIs3D() {
		return this.is3D;
	}
	public void setIs3D(Boolean is3D) {
		this.is3D = is3D;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public String getAvailableConfirmFee() {
		return this.availableConfirmFee;
	}
	public void setAvailableConfirmFee(String availableConfirmFee) {
		this.availableConfirmFee = availableConfirmFee;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getShippingType() {
		return this.shippingType;
	}
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public String getReceiverCity() {
		return this.receiverCity;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getSellerPhone() {
		return this.sellerPhone;
	}
	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}

	public String getCodFee() {
		return this.codFee;
	}
	public void setCodFee(String codFee) {
		this.codFee = codFee;
	}

	public String getCodStatus() {
		return this.codStatus;
	}
	public void setCodStatus(String codStatus) {
		this.codStatus = codStatus;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
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

	public String getSnapshotUrl() {
		return this.snapshotUrl;
	}
	public void setSnapshotUrl(String snapshotUrl) {
		this.snapshotUrl = snapshotUrl;
	}

	public Boolean getSellerRate() {
		return this.sellerRate;
	}
	public void setSellerRate(Boolean sellerRate) {
		this.sellerRate = sellerRate;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getConsignTime() {
		return this.consignTime;
	}
	public void setConsignTime(String consignTime) {
		this.consignTime = consignTime;
	}

	public String getReceiverZip() {
		return this.receiverZip;
	}
	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}

	public String getBuyerMessage() {
		return this.buyerMessage;
	}
	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}

	public String getPicPath() {
		return this.picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public Boolean getBuyerRate() {
		return this.buyerRate;
	}
	public void setBuyerRate(Boolean buyerRate) {
		this.buyerRate = buyerRate;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getBuyerEmail() {
		return this.buyerEmail;
	}
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public String getAlipayNo() {
		return this.alipayNo;
	}
	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getBuyerAlipayNo() {
		return this.buyerAlipayNo;
	}
	public void setBuyerAlipayNo(String buyerAlipayNo) {
		this.buyerAlipayNo = buyerAlipayNo;
	}

	public String getCommissionFee() {
		return this.commissionFee;
	}
	public void setCommissionFee(String commissionFee) {
		this.commissionFee = commissionFee;
	}

	public String getReceiverState() {
		return this.receiverState;
	}
	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}

	public String getSid() {
		return this.sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getReceivedPayment() {
		return this.receivedPayment;
	}
	public void setReceivedPayment(String receivedPayment) {
		this.receivedPayment = receivedPayment;
	}

	public String getTimeoutActionTime() {
		return this.timeoutActionTime;
	}
	public void setTimeoutActionTime(String timeoutActionTime) {
		this.timeoutActionTime = timeoutActionTime;
	}

	public String getPostFee() {
		return this.postFee;
	}
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public Integer getPointFee() {
		return this.pointFee;
	}
	public void setPointFee(Integer pointFee) {
		this.pointFee = pointFee;
	}

	public String getReceiverDistrict() {
		return this.receiverDistrict;
	}
	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}

	public Integer getNum() {
		return this.num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getRealPointFee() {
		return this.realPointFee;
	}
	public void setRealPointFee(Integer realPointFee) {
		this.realPointFee = realPointFee;
	}

	public String getSellerMobile() {
		return this.sellerMobile;
	}
	public void setSellerMobile(String sellerMobile) {
		this.sellerMobile = sellerMobile;
	}

	public String getSellerEmail() {
		return this.sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getSnapshot() {
		return this.snapshot;
	}
	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

}
