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

	@JsonProperty("outer_iid")
	private String outerIid;

	@JsonProperty("iid")
	private String iid;

	@JsonProperty("pic_path")
	private String picPath;

	@JsonProperty("adjust_fee")
	private String adjustFee;

	@JsonProperty("sku_properties_name")
	private String skuPropertiesName;

	@JsonProperty("outer_sku_id")
	private String outerSkuId;

	@JsonProperty("buyer_rate")
	private String buyerRate;

	@JsonProperty("title")
	private String title;

	@JsonProperty("item_memo")
	private String itemMemo;

	@JsonProperty("total_fee")
	private String totalFee;

	@JsonProperty("oid")
	private Long oid;

	@JsonProperty("refund_status")
	private String refundStatus;

	@JsonProperty("sku_id")
	private String skuId;

	@JsonProperty("refund_id")
	private Long refundId;

	@JsonProperty("discount_fee")
	private String discountFee;

	@JsonProperty("payment")
	private String payment;

	@JsonProperty("status")
	private String status;

	@JsonProperty("timeout_action_time")
	private String timeoutActionTime;

	@JsonProperty("item_meal_name")
	private String itemMealName;

	@JsonProperty("snapshot_url")
	private String snapshotUrl;

	@JsonProperty("seller_rate")
	private String sellerRate;

	@JsonProperty("num")
	private Integer num;

	@JsonProperty("price")
	private String price;

	@JsonProperty("item_meal_id")
	private Long itemMealId;

	@JsonProperty("seller_type")
	private String sellerType;

	@JsonProperty("modified")
	private Date modified;

	@JsonProperty("snapshot")
	private String snapshot;

	public String getOuterIid() {
		return this.outerIid;
	}
	public void setOuterIid(String outerIid) {
		this.outerIid = outerIid;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getPicPath() {
		return this.picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getAdjustFee() {
		return this.adjustFee;
	}
	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}

	public String getSkuPropertiesName() {
		return this.skuPropertiesName;
	}
	public void setSkuPropertiesName(String skuPropertiesName) {
		this.skuPropertiesName = skuPropertiesName;
	}

	public String getOuterSkuId() {
		return this.outerSkuId;
	}
	public void setOuterSkuId(String outerSkuId) {
		this.outerSkuId = outerSkuId;
	}

	public String getBuyerRate() {
		return this.buyerRate;
	}
	public void setBuyerRate(String buyerRate) {
		this.buyerRate = buyerRate;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getItemMemo() {
		return this.itemMemo;
	}
	public void setItemMemo(String itemMemo) {
		this.itemMemo = itemMemo;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Long getRefundId() {
		return this.refundId;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
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

	public String getTimeoutActionTime() {
		return this.timeoutActionTime;
	}
	public void setTimeoutActionTime(String timeoutActionTime) {
		this.timeoutActionTime = timeoutActionTime;
	}

	public String getItemMealName() {
		return this.itemMealName;
	}
	public void setItemMealName(String itemMealName) {
		this.itemMealName = itemMealName;
	}

	public String getSnapshotUrl() {
		return this.snapshotUrl;
	}
	public void setSnapshotUrl(String snapshotUrl) {
		this.snapshotUrl = snapshotUrl;
	}

	public String getSellerRate() {
		return this.sellerRate;
	}
	public void setSellerRate(String sellerRate) {
		this.sellerRate = sellerRate;
	}

	public Integer getNum() {
		return this.num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getItemMealId() {
		return this.itemMealId;
	}
	public void setItemMealId(Long itemMealId) {
		this.itemMealId = itemMealId;
	}

	public String getSellerType() {
		return this.sellerType;
	}
	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getSnapshot() {
		return this.snapshot;
	}
	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

}
