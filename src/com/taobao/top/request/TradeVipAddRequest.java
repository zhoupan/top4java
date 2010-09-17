package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.vip.add
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradeVipAddRequest implements TopRequest {

	private Long areaCode;
	private String buyerMessage;
	private String logisticsType;
	private String numIids;
	private String nums;
	private String receiverAddress;
	private String receiverCity;
	private String receiverDistrict;
	private String receiverMobile;
	private String receiverName;
	private String receiverPhone;
	private String receiverState;
	private String receiverZip;
	private String sellerNick;
	private String skuIds;
	private String tradeSource;

	public void setAreaCode(Long areaCode) {
		this.areaCode = areaCode;
	}
	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}
	public void setLogisticsType(String logisticsType) {
		this.logisticsType = logisticsType;
	}
	public void setNumIids(String numIids) {
		this.numIids = numIids;
	}
	public void setNums(String nums) {
		this.nums = nums;
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
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}
	public void setSkuIds(String skuIds) {
		this.skuIds = skuIds;
	}
	public void setTradeSource(String tradeSource) {
		this.tradeSource = tradeSource;
	}

	public String getApiName() {
		return "taobao.trade.vip.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("area_code", this.areaCode);
		params.put("buyer_message", this.buyerMessage);
		params.put("logistics_type", this.logisticsType);
		params.put("num_iids", this.numIids);
		params.put("nums", this.nums);
		params.put("receiver_address", this.receiverAddress);
		params.put("receiver_city", this.receiverCity);
		params.put("receiver_district", this.receiverDistrict);
		params.put("receiver_mobile", this.receiverMobile);
		params.put("receiver_name", this.receiverName);
		params.put("receiver_phone", this.receiverPhone);
		params.put("receiver_state", this.receiverState);
		params.put("receiver_zip", this.receiverZip);
		params.put("seller_nick", this.sellerNick);
		params.put("sku_ids", this.skuIds);
		params.put("trade_source", this.tradeSource);
		return params;
	}

}
