package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.forum.add
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradeForumAddRequest implements TopRequest {

	private Long areaCode;
	private String buyerMessage;
	private Boolean decreaseStock;
	private String logisticsFee;
	private String logisticsType;
	private String numIids;
	private String nums;
	private String orderDiscountFees;
	private String payTitle;
	private String prices;
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
	private String taobaokeNick;
	private String titles;
	private String tradeDiscountFee;
	private String tradeMemo;

	public void setAreaCode(Long areaCode) {
		this.areaCode = areaCode;
	}
	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}
	public void setDecreaseStock(Boolean decreaseStock) {
		this.decreaseStock = decreaseStock;
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
	public void setOrderDiscountFees(String orderDiscountFees) {
		this.orderDiscountFees = orderDiscountFees;
	}
	public void setPayTitle(String payTitle) {
		this.payTitle = payTitle;
	}
	public void setPrices(String prices) {
		this.prices = prices;
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
	public void setTaobaokeNick(String taobaokeNick) {
		this.taobaokeNick = taobaokeNick;
	}
	public void setTitles(String titles) {
		this.titles = titles;
	}
	public void setTradeDiscountFee(String tradeDiscountFee) {
		this.tradeDiscountFee = tradeDiscountFee;
	}
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}

	public String getApiName() {
		return "taobao.trade.forum.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("area_code", this.areaCode);
		params.put("buyer_message", this.buyerMessage);
		params.put("decrease_stock", this.decreaseStock);
		params.put("logistics_fee", this.logisticsFee);
		params.put("logistics_type", this.logisticsType);
		params.put("num_iids", this.numIids);
		params.put("nums", this.nums);
		params.put("order_discount_fees", this.orderDiscountFees);
		params.put("pay_title", this.payTitle);
		params.put("prices", this.prices);
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
		params.put("taobaoke_nick", this.taobaokeNick);
		params.put("titles", this.titles);
		params.put("trade_discount_fee", this.tradeDiscountFee);
		params.put("trade_memo", this.tradeMemo);
		return params;
	}

}
