package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 确认收货费用。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class ConfirmFee extends BaseObject {

	/** 确认收货的金额 */
	@JsonProperty("confirm_fee")
	private String fee;

	/** 需确认收货的邮费 */
	@JsonProperty("confirm_post_fee")
	private String postFee;

	/** 是否是最后一笔订单 */
	@JsonProperty("is_last_detail_order")
	private Boolean lastOrder;

	public String getFee() {
		return this.fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getPostFee() {
		return this.postFee;
	}

	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public Boolean isLastOrder() {
		return this.lastOrder;
	}

	public void setLastOrder(Boolean isLastOrder) {
		this.lastOrder = isLastOrder;
	}

}
