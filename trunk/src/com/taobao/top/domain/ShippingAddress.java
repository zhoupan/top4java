package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListClass;

/**
 * ShippingAddress Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("shipping_address")
@ApiListClass("shipping_addresss")
public class ShippingAddress extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("address_id")
	private Long addressId;

	@ApiField("created")
	private Date created;

	@ApiField("is_default")
	private Boolean isDefault;

	@ApiField("location")
	private Location location;

	@ApiField("mobile")
	private String mobile;

	@ApiField("phone")
	private String phone;

	@ApiField("receiver_name")
	private String receiverName;

	public Long getAddressId() {
		return this.addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
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
