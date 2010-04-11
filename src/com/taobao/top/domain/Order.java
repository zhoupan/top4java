package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;

/**
 * Order Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("order")
@JsonListClass("orders")
public class Order extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("adjust_fee")
	private String adjustFee;

	@JsonField("buyer_rate")
	private String buyerRate;

	@JsonField("discount_fee")
	private String discountFee;

	@JsonField("iid")
	private String iid;

	@JsonField("item_meal_id")
	private Long itemMealId;

	@JsonField("item_meal_name")
	private String itemMealName;

	@JsonField("item_memo")
	private String itemMemo;

	@JsonField("modified")
	private Date modified;

	@JsonField("num")
	private Integer num;

	@JsonField("oid")
	private Long oid;

	@JsonField("outer_iid")
	private String outerIid;

	@JsonField("outer_sku_id")
	private String outerSkuId;

	@JsonField("payment")
	private String payment;

	@JsonField("pic_path")
	private String picPath;

	@JsonField("price")
	private String price;

	@JsonField("refund_id")
	private Long refundId;

	@JsonField("refund_status")
	private String refundStatus;

	@JsonField("seller_rate")
	private String sellerRate;

	@JsonField("seller_type")
	private String sellerType;

	@JsonField("sku_id")
	private String skuId;

	@JsonField("sku_properties_name")
	private String skuPropertiesName;

	@JsonField("snapshot")
	private String snapshot;

	@JsonField("snapshot_url")
	private String snapshotUrl;

	@JsonField("status")
	private String status;

	@JsonField("timeout_action_time")
	private String timeoutActionTime;

	@JsonField("title")
	private String title;

	@JsonField("total_fee")
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
