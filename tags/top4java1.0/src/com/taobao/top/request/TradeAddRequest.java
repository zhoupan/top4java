package com.taobao.top.request;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.taobao.top.domain.Location;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.nbsadd
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TradeAddRequest implements TopRequest {

	/** 商品编号列表 */
	private String iids;

	/** 商品销售属性列表 */
	private String itemSkuIds;

	/** 商品价格列表 */
	private String itemPrices;

	/** 商品购买数量列表 */
	private String itemNums;

	/** 商品标题列表 */
	private String itemTitles;

	/** 订单备注列表 */
	private String itemMemos;

	/** 商品折扣金额列表 */
	private String itemDiscountFees;

	/** 支付标题 */
	private String payTitle;

	/** 卖家昵称 */
	private String sellerNick;

	/** 买家昵称 */
	private String buyerNick;

	/** 买家留言 */
	private String buyerMessage;

	/** 交易类型 */
	private String type;

	/** 交易快照信息 */
	private String snapshot;

	/** 地区代号 */
	private String areaCode;

	/** 物流方式 */
	private String logisticsType;

	/** 物流费用 */
	private String logisticsFee;

	/** 地址信息 */
	public Location location;

	/** 是否保存收货地址 */
	private Boolean saveDeliverAddress;

	/** 收货人全名 */
	private String receiverName;

	/** 固定电话号码 */
	private String phone;

	/** 移动电话号码 */
	private String mobile;

	/** 店铺促销信息 */
	private String shopPromotion;

	/** 交易备注 */
	private String tradeMemo;

	/** 子订单快照信息 */
	public Map<String, String> orderSnapshots;

	/** 套餐信息 */
	public Map<String, String> itemMeals;

	public void setIids(String iids) {
		this.iids = iids;
	}

	public void setItemSkuIds(String itemSkuIds) {
		this.itemSkuIds = itemSkuIds;
	}

	public void setItemPrices(String itemPrices) {
		this.itemPrices = itemPrices;
	}

	public void setItemNums(String itemNums) {
		this.itemNums = itemNums;
	}

	public void setItemTitles(String itemTitles) {
		this.itemTitles = itemTitles;
	}

	public void setItemMemos(String itemMemos) {
		this.itemMemos = itemMemos;
	}

	public void setItemDiscountFees(String itemDiscountFees) {
		this.itemDiscountFees = itemDiscountFees;
	}

	public void setPayTitle(String payTitle) {
		this.payTitle = payTitle;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public void setLogisticsType(String logisticsType) {
		this.logisticsType = logisticsType;
	}

	public void setLogisticsFee(String logisticsFee) {
		this.logisticsFee = logisticsFee;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setSaveDeliverAddress(Boolean saveDeliverAddress) {
		this.saveDeliverAddress = saveDeliverAddress;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setShopPromotion(String shopPromotion) {
		this.shopPromotion = shopPromotion;
	}

	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}

	public void setOrderSnapshots(Map<String, String> orderSnapshots) {
		this.orderSnapshots = orderSnapshots;
	}

	public void setItemMeals(Map<String, String> itemMeals) {
		this.itemMeals = itemMeals;
	}

	public String getApiName() {
		return "taobao.trade.nbsadd";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("iids", this.iids);
		params.put("prices", this.itemPrices);
		params.put("nums", this.itemNums);
		params.put("sku_ids", this.itemSkuIds);
		params.put("titles", this.itemTitles);
		params.put("order_memos", this.itemMemos);
		params.put("discount_fees", this.itemDiscountFees);
		params.put("pay_title", this.payTitle);
		params.put("seller_nick", this.sellerNick);
		params.put("buyer_nick", this.buyerNick);
		params.put("buyer_message", this.buyerMessage);
		params.put("type", this.type);
		params.put("snapshot", this.snapshot);
		params.put("division_code", this.areaCode);
		params.put("post_fee", this.logisticsFee);
		params.put("logistic.type", this.logisticsType);
		params.put("save_deliver_addr", this.saveDeliverAddress);

		if (this.location != null) {
			params.put("location.state", this.location.getState());
			params.put("location.city", this.location.getCity());
			params.put("location.district", this.location.getDistrict());
			params.put("location.address", this.location.getAddress());
			params.put("location.zip", this.location.getZip());
		}

		params.put("receiver_name", this.receiverName);
		params.put("shop_promotion", this.shopPromotion);
		params.put("trade_memo", this.tradeMemo);
		params.put("phone", this.phone);
		params.put("mobile", this.mobile);

		if (this.orderSnapshots != null) {
			Set<Entry<String, String>> snapshots = this.orderSnapshots.entrySet();
			for (Entry<String, String> entry : snapshots) {
				params.put(entry.getKey(), entry.getValue());
			}
		}

		if (this.itemMeals != null) {
			Set<Entry<String, String>> meals = this.itemMeals.entrySet();
			for (Entry<String, String> entry : meals) {
				params.put(entry.getKey(), entry.getValue());
			}
		}

		return params;
	}

}
