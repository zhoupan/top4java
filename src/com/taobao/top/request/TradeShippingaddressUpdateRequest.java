package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.shippingaddress.update
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradeShippingaddressUpdateRequest implements TopRequest {

	private String receiverAddress;
	private String receiverCity;
	private String receiverDistrict;
	private String receiverMobile;
	private String receiverName;
	private String receiverPhone;
	private String receiverState;
	private String receiverZip;
	private Long tid;

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
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getApiName() {
		return "taobao.trade.shippingaddress.update";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("receiver_address", this.receiverAddress);
		params.put("receiver_city", this.receiverCity);
		params.put("receiver_district", this.receiverDistrict);
		params.put("receiver_mobile", this.receiverMobile);
		params.put("receiver_name", this.receiverName);
		params.put("receiver_phone", this.receiverPhone);
		params.put("receiver_state", this.receiverState);
		params.put("receiver_zip", this.receiverZip);
		params.put("tid", this.tid);
		return params;
	}

}
