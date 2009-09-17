package com.taobao.top.domain;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 买家收货地址。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class DeliveryAddress extends BaseObject {

	/** 收货地址编号 */
	@JsonProperty("address_id")
	private Long addressId;

	/** 收货人姓名 */
	@JsonProperty("receiver_name")
	private String receiverName;

	/** 收货人固定电话号码 */
	@JsonProperty("phone")
	private String phone;

	/** 收货人移动电话号码 */
	@JsonProperty("mobile")
	private String mobile;

	/** 是否作为默认收货地址 */
	@JsonProperty("is_default")
	private Boolean isDefault;

	/** 收货人地址信息 */
	@JsonProperty("location")
	private Location location;

	public Long getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Boolean isDefault() {
		return this.isDefault;
	}

	public void setDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
