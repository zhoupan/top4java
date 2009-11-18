package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.delivery.send
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class DeliverySendRequest implements TopRequest {

	/** 交易编号 */
	private Long tid;

	/** 物流运单号 */
	private String sid;

	/** 发货类型 */
	private String orderType;

	/** 物流公司代码 */
	private String companyCode;

	/** 卖家联系人姓名 */
	private String sellerName;

	/** 卖家区域县级行政区编号 */
	private Long sellerAreaId;

	/** 卖家地址 */
	private String sellerAddress;

	/** 卖家邮编 */
	private String sellerZip;

	/** 卖家固定电话 */
	private String sellerPhone;

	/** 卖家手机号码 */
	private String sellerMobile;

	/** 卖家备注 */
	private String sellerMemo;

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public void setSellerAreaId(Long sellerAreaId) {
		this.sellerAreaId = sellerAreaId;
	}

	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}

	public void setSellerZip(String sellerZip) {
		this.sellerZip = sellerZip;
	}

	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}

	public void setSellerMobile(String sellerMobile) {
		this.sellerMobile = sellerMobile;
	}

	public void setSellerMemo(String sellerMemo) {
		this.sellerMemo = sellerMemo;
	}

	public String getApiName() {
		return "taobao.delivery.send";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("tid", this.tid);
		params.put("out_sid", this.sid);
		params.put("order_type", this.orderType);
		params.put("company_code", this.companyCode);
		params.put("seller_name", this.sellerName);
		params.put("seller_area_id", this.sellerAreaId);
		params.put("seller_address", this.sellerAddress);
		params.put("seller_zip", this.sellerZip);
		params.put("seller_phone", this.sellerPhone);
		params.put("seller_mobile", this.sellerMobile);
		params.put("memo", this.sellerMemo);

		return params;
	}

}
