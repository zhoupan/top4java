package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.delivery.send
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class DeliverySendRequest implements TopRequest {

	private String companyCode;
	private String fields;
	private String memo;
	private String orderType;
	private String outSid;
	private String sellerAddress;
	private String sellerAreaId;
	private String sellerMobile;
	private String sellerName;
	private String sellerPhone;
	private String sellerZip;
	private Long tid;

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public void setOutSid(String outSid) {
		this.outSid = outSid;
	}
	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}
	public void setSellerAreaId(String sellerAreaId) {
		this.sellerAreaId = sellerAreaId;
	}
	public void setSellerMobile(String sellerMobile) {
		this.sellerMobile = sellerMobile;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}
	public void setSellerZip(String sellerZip) {
		this.sellerZip = sellerZip;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getApiName() {
		return "taobao.delivery.send";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("company_code", this.companyCode);
		params.put("fields", this.fields);
		params.put("memo", this.memo);
		params.put("order_type", this.orderType);
		params.put("out_sid", this.outSid);
		params.put("seller_address", this.sellerAddress);
		params.put("seller_area_id", this.sellerAreaId);
		params.put("seller_mobile", this.sellerMobile);
		params.put("seller_name", this.sellerName);
		params.put("seller_phone", this.sellerPhone);
		params.put("seller_zip", this.sellerZip);
		params.put("tid", this.tid);
		return params;
	}

}
