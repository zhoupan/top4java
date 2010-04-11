package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * ShippingAddress Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ShippingAddress extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("address_id")
	private Integer addressId;

	@JsonProperty("is_default")
	private Boolean isDefault;

	@JsonProperty("mobile")
	private String mobile;

	@JsonProperty("receiver_name")
	private String receiverName;

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	public Integer getAddressId() {
		return this.addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Boolean getIsDefault() {
		return this.isDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

}
