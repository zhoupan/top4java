package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonProperty;

/**
 * 交易。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class Trade extends BaseObject {

	/** 淘宝交易编号（父订单的交易编号） */
	@JsonProperty("tid")
	private Long tid;

	/** 交易标题 */
	@JsonProperty("title")
	private String title;

	/** 交易类型 */
	@JsonProperty("type")
	private String type;

	/** 卖家昵称 */
	@JsonProperty("seller_nick")
	private String sellerNick;

	/** 买家昵称 */
	@JsonProperty("buyer_nick")
	private String buyerNick;

	/** 买家留言 */
	@JsonProperty("buyer_message")
	private String buyerMessage;

	/** 商品的编号 */
	@JsonProperty("iid")
	private String iid;

	/** 商品价格 */
	@JsonProperty("price")
	private String itemPrice;

	/** 商品图片绝对地址 */
	@JsonProperty("pic_path")
	private String itemPicUrl;

	/** 商品购买数量 */
	@JsonProperty("num")
	private Integer itemNum;

	/** 物流编号 */
	@JsonProperty("sid")
	private Long sid;

	/** 创建交易时的物流方式 */
	@JsonProperty("shipping_type")
	private String shippingType;

	/** 支付宝交易号 */
	@JsonProperty("alipay_no")
	private String alipayNo;

	/** 买家实付金额（包含物流费用） */
	@JsonProperty("payment")
	private String payment;

	/** 系统优惠金额 */
	@JsonProperty("discount_fee")
	private String discountFee;

	/** 卖家优惠金额 */
	@JsonProperty("adjust_fee")
	private String adjustFee;

	/** 交易快照地址 */
	@JsonProperty("snapshot_url")
	private String snapshotUrl;

	/** 交易状态 */
	@JsonProperty("status")
	private String status;

	/** 卖家是否已评价 */
	@JsonProperty("seller_rate")
	private Boolean sellerRated;

	/** 买家是否已评价 */
	@JsonProperty("buyer_rate")
	private Boolean buyerRated;

	/** 买家备注 */
	@JsonProperty("buyer_memo")
	private String buyerMemo;

	/** 卖家备注 */
	@JsonProperty("seller_memo")
	private String sellerMemo;

	/** 付款时间 */
	@JsonProperty("pay_time")
	private String payTime;

	/** 交易成功时间 */
	@JsonProperty("end_time")
	private String endTime;

	/** 买家获得积分，返点的积分 */
	@JsonProperty("buyer_obtain_point_fee")
	private String buyerObtainPointFee;

	/** 买家使用积分 */
	@JsonProperty("point_fee")
	private String buyerUsePointFee;

	/** 买家实际使用积分 */
	@JsonProperty("real_point_fee")
	private String buyerRealPointFee;

	/** 金额 */
	@JsonProperty("total_fee")
	private String totalFee;

	/** 邮费 */
	@JsonProperty("post_fee")
	private String postFee;

	/** 买家支付宝账号 */
	@JsonProperty("buyer_alipay_no")
	private String buyerAlipayNo;

	/** 收货人的姓名 */
	@JsonProperty("receiver_name")
	private String receiverName;

	/** 收货人的所在省份 */
	@JsonProperty("receiver_state")
	private String receiverState;

	/** 收货人的所在城市 */
	@JsonProperty("receiver_city")
	private String receiverCity;

	/** 收货人的所在地区 */
	@JsonProperty("receiver_district")
	private String receiverDistrict;

	/** 收货人的详细地址 */
	@JsonProperty("receiver_address")
	private String receiverAddress;

	/** 收货人的邮编 */
	@JsonProperty("receiver_zip")
	private String receiverZip;

	/** 收货人的手机号码 */
	@JsonProperty("receiver_mobile")
	private String receiverMobile;

	/** 收货人的电话号码 */
	@JsonProperty("receiver_phone")
	private String receiverPhone;

	/** 卖家发货时间 */
	@JsonProperty("consign_time")
	private String consignTime;

	/** 买家邮箱 */
	@JsonProperty("buyer_email")
	private String buyerEmail;

	/** 交易佣金 */
	@JsonProperty("commission_fee")
	private String commissionFee;

	/** 卖家支付宝账号 */
	@JsonProperty("seller_alipay_no")
	private String sellerAlipayNo;

	/** 卖家手机 */
	@JsonProperty("seller_mobile")
	private String sellerMobile;

	/** 卖家电话 */
	@JsonProperty("seller_phone")
	private String sellerPhone;

	/** 卖家姓名 */
	@JsonProperty("seller_name")
	private String sellerName;

	/** 卖家Email */
	@JsonProperty("seller_email")
	private String sellerEmail;

	/** 能够确认收货的实付款 */
	@JsonProperty("available_confirm_fee")
	private String availableConfirmFee;

	/** 是否包含邮费 */
	@JsonProperty("has_postFee")
	private String hasPostFee;

	/** 卖家实际收到的支付宝打款金额 */
	@JsonProperty("received_payment")
	private String receivedPayment;

	/** 货到付款服务费 */
	@JsonProperty("cod_fee")
	private String codFee;

	/** 超时到期时间 */
	@JsonProperty("timeout_action_time")
	private String timeoutActionTime;

	/** 订单列表 */
	@JsonProperty("orders")
	private List<Order> orders;

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

	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getBuyerMessage() {
		return this.buyerMessage;
	}

	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}

	public String getIid() {
		return this.iid;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemPicUrl() {
		return this.itemPicUrl;
	}

	public void setItemPicUrl(String itemPicUrl) {
		this.itemPicUrl = itemPicUrl;
	}

	public Integer getItemNum() {
		return this.itemNum;
	}

	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}

	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getShippingType() {
		return this.shippingType;
	}

	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public String getAlipayNo() {
		return this.alipayNo;
	}

	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getDiscountFee() {
		return this.discountFee;
	}

	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public String getAdjustFee() {
		return this.adjustFee;
	}

	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}

	public String getSnapshotUrl() {
		return this.snapshotUrl;
	}

	public void setSnapshotUrl(String snapshotUrl) {
		this.snapshotUrl = snapshotUrl;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getSellerRated() {
		return this.sellerRated;
	}

	public void setSellerRated(Boolean sellerRated) {
		this.sellerRated = sellerRated;
	}

	public Boolean getBuyerRated() {
		return this.buyerRated;
	}

	public void setBuyerRated(Boolean buyerRated) {
		this.buyerRated = buyerRated;
	}

	public String getBuyerMemo() {
		return this.buyerMemo;
	}

	public void setBuyerMemo(String buyerMemo) {
		this.buyerMemo = buyerMemo;
	}

	public String getSellerMemo() {
		return this.sellerMemo;
	}

	public void setSellerMemo(String sellerMemo) {
		this.sellerMemo = sellerMemo;
	}

	public String getPayTime() {
		return this.payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getBuyerObtainPointFee() {
		return this.buyerObtainPointFee;
	}

	public void setBuyerObtainPointFee(String buyerObtainPointFee) {
		this.buyerObtainPointFee = buyerObtainPointFee;
	}

	public String getBuyerUsePointFee() {
		return this.buyerUsePointFee;
	}

	public void setBuyerUsePointFee(String buyerUsePointFee) {
		this.buyerUsePointFee = buyerUsePointFee;
	}

	public String getBuyerRealPointFee() {
		return this.buyerRealPointFee;
	}

	public void setBuyerRealPointFee(String buyerRealPointFee) {
		this.buyerRealPointFee = buyerRealPointFee;
	}

	public String getTotalFee() {
		return this.totalFee;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getPostFee() {
		return this.postFee;
	}

	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public String getBuyerAlipayNo() {
		return this.buyerAlipayNo;
	}

	public void setBuyerAlipayNo(String buyerAlipayNo) {
		this.buyerAlipayNo = buyerAlipayNo;
	}

	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverState() {
		return this.receiverState;
	}

	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}

	public String getReceiverCity() {
		return this.receiverCity;
	}

	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getReceiverDistrict() {
		return this.receiverDistrict;
	}

	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverZip() {
		return this.receiverZip;
	}

	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
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

	public String getConsignTime() {
		return this.consignTime;
	}

	public void setConsignTime(String consignTime) {
		this.consignTime = consignTime;
	}

	public String getBuyerEmail() {
		return this.buyerEmail;
	}

	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public String getCommissionFee() {
		return this.commissionFee;
	}

	public void setCommissionFee(String commissionFee) {
		this.commissionFee = commissionFee;
	}

	public String getSellerAlipayNo() {
		return this.sellerAlipayNo;
	}

	public void setSellerAlipayNo(String sellerAlipayNo) {
		this.sellerAlipayNo = sellerAlipayNo;
	}

	public String getSellerMobile() {
		return this.sellerMobile;
	}

	public void setSellerMobile(String sellerMobile) {
		this.sellerMobile = sellerMobile;
	}

	public String getSellerPhone() {
		return this.sellerPhone;
	}

	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}

	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerEmail() {
		return this.sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getAvailableConfirmFee() {
		return this.availableConfirmFee;
	}

	public void setAvailableConfirmFee(String availableConfirmFee) {
		this.availableConfirmFee = availableConfirmFee;
	}

	public String getHasPostFee() {
		return this.hasPostFee;
	}

	public void setHasPostFee(String hasPostFee) {
		this.hasPostFee = hasPostFee;
	}

	public String getReceivedPayment() {
		return this.receivedPayment;
	}

	public void setReceivedPayment(String receivedPayment) {
		this.receivedPayment = receivedPayment;
	}

	public String getCodFee() {
		return this.codFee;
	}

	public void setCodFee(String codFee) {
		this.codFee = codFee;
	}

	public String getTimeoutActionTime() {
		return this.timeoutActionTime;
	}

	public void setTimeoutActionTime(String timeoutActionTime) {
		this.timeoutActionTime = timeoutActionTime;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
