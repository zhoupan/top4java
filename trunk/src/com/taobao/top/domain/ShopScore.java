package com.taobao.top.domain;

import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;

/**
 * ShopScore Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("shop_score")
public class ShopScore extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("delivery_score")
	private String deliveryScore;

	@ApiField("item_score")
	private String itemScore;

	@ApiField("service_score")
	private String serviceScore;

	public String getDeliveryScore() {
		return this.deliveryScore;
	}
	public void setDeliveryScore(String deliveryScore) {
		this.deliveryScore = deliveryScore;
	}

	public String getItemScore() {
		return this.itemScore;
	}
	public void setItemScore(String itemScore) {
		this.itemScore = itemScore;
	}

	public String getServiceScore() {
		return this.serviceScore;
	}
	public void setServiceScore(String serviceScore) {
		this.serviceScore = serviceScore;
	}

}
