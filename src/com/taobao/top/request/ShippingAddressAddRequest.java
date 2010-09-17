package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.shipping.address.add
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ShippingAddressAddRequest implements TopRequest {

	private Boolean isDefault;
	private String receiverAddress;
	private String receiverCity;
	private String receiverDistrict;
	private String receiverMobile;
	private String receiverName;
	private String receiverPhone;
	private String receiverState;
	private String receiverZip;

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}
	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}
	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}

	public String getApiName() {
		return "taobao.shipping.address.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("is_default", this.isDefault);
		params.put("receiver_address", this.receiverAddress);
		params.put("receiver_city", this.receiverCity);
		params.put("receiver_district", this.receiverDistrict);
		params.put("receiver_mobile", this.receiverMobile);
		params.put("receiver_name", this.receiverName);
		params.put("receiver_phone", this.receiverPhone);
		params.put("receiver_state", this.receiverState);
		params.put("receiver_zip", this.receiverZip);
		return params;
	}

}
