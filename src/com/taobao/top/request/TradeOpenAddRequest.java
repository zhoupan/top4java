package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.open.add
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradeOpenAddRequest implements TopRequest {

	private String buyerMessage;
	private Boolean decreaseStock;
	private String discountFees;
	private String logisticsFee;
	private String logisticsType;
	private String numIids;
	private String nums;
	private String payTitle;
	private String promotion;
	private String receiverAddress;
	private String receiverCity;
	private String receiverDistrict;
	private String receiverMobile;
	private String receiverName;
	private String receiverPhone;
	private String receiverState;
	private String receiverZip;
	private String skuIds;
	private String tradeMemo;
	private String type;

	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}
	public void setDecreaseStock(Boolean decreaseStock) {
		this.decreaseStock = decreaseStock;
	}
	public void setDiscountFees(String discountFees) {
		this.discountFees = discountFees;
	}
	public void setLogisticsFee(String logisticsFee) {
		this.logisticsFee = logisticsFee;
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
	public void setPayTitle(String payTitle) {
		this.payTitle = payTitle;
	}
	public void setPromotion(String promotion) {
		this.promotion = promotion;
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
	public void setSkuIds(String skuIds) {
		this.skuIds = skuIds;
	}
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getApiName() {
		return "taobao.trade.open.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("buyer_message", this.buyerMessage);
		params.put("decrease_stock", this.decreaseStock);
		params.put("discount_fees", this.discountFees);
		params.put("logistics_fee", this.logisticsFee);
		params.put("logistics_type", this.logisticsType);
		params.put("num_iids", this.numIids);
		params.put("nums", this.nums);
		params.put("pay_title", this.payTitle);
		params.put("promotion", this.promotion);
		params.put("receiver_address", this.receiverAddress);
		params.put("receiver_city", this.receiverCity);
		params.put("receiver_district", this.receiverDistrict);
		params.put("receiver_mobile", this.receiverMobile);
		params.put("receiver_name", this.receiverName);
		params.put("receiver_phone", this.receiverPhone);
		params.put("receiver_state", this.receiverState);
		params.put("receiver_zip", this.receiverZip);
		params.put("sku_ids", this.skuIds);
		params.put("trade_memo", this.tradeMemo);
		params.put("type", this.type);
		return params;
	}

}
