package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 订单。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("orders")
public class Order extends BaseObject {

	private static final long serialVersionUID = 8390770640216030615L;

	/** 商品编号 */
	@JsonProperty("iid")
	private String iid;

	/** 子订单编号 */
	@JsonProperty("tid")
	private Long oid;

	/** 商品的最小属性单元SKU的编号 */
	@JsonProperty("sku_id ")
	private Long skuId;

	/** SKU的值 */
	@JsonProperty("sku_properties_name")
	private String skuProps;

	/** 商品套餐 */
	@JsonProperty("item_meal_name")
	private String itemCombo;

	/** 购买数量 */
	@JsonProperty("num")
	private Integer itemNum;

	/** 商品标题 */
	@JsonProperty("title")
	private String itemTitle;

	/** 商品价格 */
	@JsonProperty("price")
	private String itemPrice;

	/** 商品图片的绝对路径 */
	@JsonProperty("pic_path")
	private String itemImgUrl;

	/** 商品备注 */
	@JsonProperty("item_memo")
	private String itemMemo;

	/** 卖家昵称 */
	@JsonProperty("seller_nick")
	private String sellerNick;

	/** 买家昵称 */
	@JsonProperty("buyer_nick")
	private String buyerNick;

	/** 退款状态 */
	@JsonProperty("refund_status")
	private String refundStatus;

	/** 商家外部编码 */
	@JsonProperty("outer_iid")
	private String outerIid;

	/** 外部网店自己定义的SKU编码 */
	@JsonProperty("outer_sku_id")
	private String outerSkuId;

	/** 交易类型 */
	@JsonProperty("type")
	private String orderType;

	/** 订单状态 */
	@JsonProperty("status")
	private String orderStatus;

	/** 订单超时到期时间 */
	@JsonProperty("timeout_action_time")
	private String timeout;

	/** 订单快照信息 */
	@JsonProperty("snapshot")
	private String snapshot;

	/** 订单快照地址 */
	@JsonProperty("snapshot_url")
	private String snapshotUrl;

	/** 应付金额 */
	@JsonProperty("total_fee")
	private String totalFee;

	/** 实付金额 */
	@JsonProperty("payment")
	private String payment;

	/** 系统优惠金额 */
	@JsonProperty("discount_fee")
	private String discountFee;

	/** 卖家优惠金额 */
	@JsonProperty("adjust_fee")
	private String adjustFee;

	public String getIid() {
		return this.iid;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	public Long getSkuId() {
		return this.skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getSkuProps() {
		return this.skuProps;
	}

	public void setSkuProps(String skuProps) {
		this.skuProps = skuProps;
	}

	public String getItemCombo() {
		return this.itemCombo;
	}

	public void setItemCombo(String itemCombo) {
		this.itemCombo = itemCombo;
	}

	public Integer getItemNum() {
		return this.itemNum;
	}

	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
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

	public String getItemImgUrl() {
		return this.itemImgUrl;
	}

	public void setItemImgUrl(String itemImgUrl) {
		this.itemImgUrl = itemImgUrl;
	}

	public String getItemMemo() {
		return this.itemMemo;
	}

	public void setItemMemo(String itemMemo) {
		this.itemMemo = itemMemo;
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

	public String getRefundStatus() {
		return this.refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Long getOid() {
		return this.oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getOuterIid() {
		return this.outerIid;
	}

	public void setOuterIid(String outerIid) {
		this.outerIid = outerIid;
	}

	public String getOuterSkuId() {
		return this.outerSkuId;
	}

	public void setOuterSkuId(String outerSkuId) {
		this.outerSkuId = outerSkuId;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getTimeout() {
		return this.timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public String getSnapshot() {
		return this.snapshot;
	}

	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getSnapshotUrl() {
		return this.snapshotUrl;
	}

	public void setSnapshotUrl(String snapshotUrl) {
		this.snapshotUrl = snapshotUrl;
	}

	public String getTotalFee() {
		return this.totalFee;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
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

}
