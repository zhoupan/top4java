package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * TradeConfirmFee Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradeConfirmFee extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("confirm_fee")
	private String confirmFee;

	@JsonProperty("is_last_order")
	private Boolean isLastOrder;

	@JsonProperty("confirm_post_fee")
	private String confirmPostFee;

	public String getConfirmFee() {
		return this.confirmFee;
	}
	public void setConfirmFee(String confirmFee) {
		this.confirmFee = confirmFee;
	}

	public Boolean getIsLastOrder() {
		return this.isLastOrder;
	}
	public void setIsLastOrder(Boolean isLastOrder) {
		this.isLastOrder = isLastOrder;
	}

	public String getConfirmPostFee() {
		return this.confirmPostFee;
	}
	public void setConfirmPostFee(String confirmPostFee) {
		this.confirmPostFee = confirmPostFee;
	}

}
