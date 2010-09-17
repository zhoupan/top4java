package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.delivery.cod.send
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class DeliveryCodSendRequest implements TopRequest {

	private String companyCode;
	private String fetcherAddress;
	private Long fetcherAreaId;
	private String fetcherMobile;
	private String fetcherName;
	private String fetcherPhone;
	private String fetcherZip;
	private String memo;
	private String orderType;
	private String outSid;
	private String sellerAddress;
	private Long sellerAreaId;
	private String sellerMobile;
	private String sellerName;
	private String sellerPhone;
	private String sellerZip;
	private Long sessionUid;
	private Long tid;

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public void setFetcherAddress(String fetcherAddress) {
		this.fetcherAddress = fetcherAddress;
	}
	public void setFetcherAreaId(Long fetcherAreaId) {
		this.fetcherAreaId = fetcherAreaId;
	}
	public void setFetcherMobile(String fetcherMobile) {
		this.fetcherMobile = fetcherMobile;
	}
	public void setFetcherName(String fetcherName) {
		this.fetcherName = fetcherName;
	}
	public void setFetcherPhone(String fetcherPhone) {
		this.fetcherPhone = fetcherPhone;
	}
	public void setFetcherZip(String fetcherZip) {
		this.fetcherZip = fetcherZip;
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
	public void setSellerAreaId(Long sellerAreaId) {
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
	public void setSessionUid(Long sessionUid) {
		this.sessionUid = sessionUid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getApiName() {
		return "taobao.delivery.cod.send";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("company_code", this.companyCode);
		params.put("fetcher_address", this.fetcherAddress);
		params.put("fetcher_area_id", this.fetcherAreaId);
		params.put("fetcher_mobile", this.fetcherMobile);
		params.put("fetcher_name", this.fetcherName);
		params.put("fetcher_phone", this.fetcherPhone);
		params.put("fetcher_zip", this.fetcherZip);
		params.put("memo", this.memo);
		params.put("order_type", this.orderType);
		params.put("out_sid", this.outSid);
		params.put("seller_address", this.sellerAddress);
		params.put("seller_area_id", this.sellerAreaId);
		params.put("seller_mobile", this.sellerMobile);
		params.put("seller_name", this.sellerName);
		params.put("seller_phone", this.sellerPhone);
		params.put("seller_zip", this.sellerZip);
		params.put("session_uid", this.sessionUid);
		params.put("tid", this.tid);
		return params;
	}

}
