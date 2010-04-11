package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;

/**
 * ShippingAddress Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("shipping_address")
@JsonListClass("shipping_addresss")
public class ShippingAddress extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("address_id")
	private Integer addressId;

	@JsonField("is_default")
	private Boolean isDefault;

	@JsonField("location")
	private Location location;

	@JsonField("mobile")
	private String mobile;

	@JsonField("phone")
	private String phone;

	@JsonField("receiver_name")
	private String receiverName;

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

	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

}
