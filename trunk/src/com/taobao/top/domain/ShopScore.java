package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * ShopScore Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ShopScore extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("service_score")
	private String serviceScore;

	@JsonProperty("delivery_score")
	private String deliveryScore;

	@JsonProperty("item_score")
	private String itemScore;

	public String getServiceScore() {
		return this.serviceScore;
	}
	public void setServiceScore(String serviceScore) {
		this.serviceScore = serviceScore;
	}

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

}
