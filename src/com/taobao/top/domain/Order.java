package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonProperty;

/**
 * Order Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class Order extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("adjust_fee")
	private String adjustFee;

	@JsonProperty("buyer_rate")
	private String buyerRate;

	@JsonProperty("discount_fee")
	private String discountFee;

	@JsonProperty("iid")
	private String iid;

	@JsonProperty("item_meal_id")
	private Long itemMealId;

	@JsonProperty("item_meal_name")
	private String itemMealName;

	@JsonProperty("item_memo")
	private String itemMemo;

	@JsonProperty("modified")
	private Date modified;

	@JsonProperty("num")
	private Integer num;

	@JsonProperty("oid")
	private Long oid;

	@JsonProperty("outer_iid")
	private String outerIid;

	@JsonProperty("outer_sku_id")
	private String outerSkuId;

	@JsonProperty("payment")
	private String payment;

	@JsonProperty("pic_path")
	private String picPath;

	@JsonProperty("price")
	private String price;

	@JsonProperty("refund_id")
	private Long refundId;

	@JsonProperty("refund_status")
	private String refundStatus;

	@JsonProperty("seller_rate")
	private String sellerRate;

	@JsonProperty("seller_type")
	private String sellerType;

	@JsonProperty("sku_id")
	private String skuId;

	@JsonProperty("sku_properties_name")
	private String skuPropertiesName;

	@JsonProperty("snapshot")
	private String snapshot;

	@JsonProperty("snapshot_url")
	private String snapshotUrl;

	@JsonProperty("status")
	private String status;

	@JsonProperty("timeout_action_time")
	private String timeoutActionTime;

	@JsonProperty("title")
	private String title;

	@JsonProperty("total_fee")
	private String totalFee;

	public String getAdjustFee() {
		return this.adjustFee;
	}
	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}

	public String getBuyerRate() {
		return this.buyerRate;
	}
	public void setBuyerRate(String buyerRate) {
		this.buyerRate = buyerRate;
	}

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public Long getItemMealId() {
		return this.itemMealId;
	}
	public void setItemMealId(Long itemMealId) {
		this.itemMealId = itemMealId;
	}

	public String getItemMealName() {
		return this.itemMealName;
	}
	public void setItemMealName(String itemMealName) {
		this.itemMealName = itemMealName;
	}

	public String getItemMemo() {
		return this.itemMemo;
	}
	public void setItemMemo(String itemMemo) {
		this.itemMemo = itemMemo;
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

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPicPath() {
		return this.picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getRefundId() {
		return this.refundId;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getSellerRate() {
		return this.sellerRate;
	}
	public void setSellerRate(String sellerRate) {
		this.sellerRate = sellerRate;
	}

	public String getSellerType() {
		return this.sellerType;
	}
	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuPropertiesName() {
		return this.skuPropertiesName;
	}
	public void setSkuPropertiesName(String skuPropertiesName) {
		this.skuPropertiesName = skuPropertiesName;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTimeoutActionTime() {
		return this.timeoutActionTime;
	}
	public void setTimeoutActionTime(String timeoutActionTime) {
		this.timeoutActionTime = timeoutActionTime;
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
