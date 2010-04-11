package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;

/**
 * TradeConfirmFee Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("trade_confirm_fee")
public class TradeConfirmFee extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("confirm_fee")
	private String confirmFee;

	@JsonField("confirm_post_fee")
	private String confirmPostFee;

	@JsonField("is_last_order")
	private Boolean isLastOrder;

	public String getConfirmFee() {
		return this.confirmFee;
	}
	public void setConfirmFee(String confirmFee) {
		this.confirmFee = confirmFee;
	}

	public String getConfirmPostFee() {
		return this.confirmPostFee;
	}
	public void setConfirmPostFee(String confirmPostFee) {
		this.confirmPostFee = confirmPostFee;
	}

	public Boolean getIsLastOrder() {
		return this.isLastOrder;
	}
	public void setIsLastOrder(Boolean isLastOrder) {
		this.isLastOrder = isLastOrder;
	}

}
