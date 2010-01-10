package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 物流订单。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("ship")
public class LogisticsOrder extends BaseObject {

	private static final long serialVersionUID = -4528583832286920840L;

	/** 交易编号 */
	@JsonProperty("tid")
	private Long tid;

	/** 具体一个物流公司的运单号码 */
	@JsonProperty("out_sid")
	private String sid;

	/** 卖家昵称 */
	@JsonProperty("seller_nick")
	private String sellerNick;

	/** 买家昵称 */
	@JsonProperty("buyer_nick")
	private String buyerNick;

	/** 预约取货开始时间 */
	@JsonProperty("delivery_start")
	private String startDelivery;

	/** 预约取货结束时间 */
	@JsonProperty("delivery_end")
	private String endDelivery;

	/** 货物名称 */
	@JsonProperty("item_title")
	private String itemTitle;

	/** 收件人姓名 */
	@JsonProperty("receiver_name")
	private String receiverName;

	/** 收件人电话 */
	@JsonProperty("receiver_phone")
	private String receiverPhone;

	/** 收件人手机号码 */
	@JsonProperty("receiver_mobile")
	private String receiverMobile;

	/** 收件人地址信息 */
	@JsonProperty("receiver_location")
	private Location receiverLocation;

	/** 物流订单状态 */
	@JsonProperty("status")
	private String status;

	/** 物流方式 */
	@JsonProperty("type")
	private String type;

	/** 谁承担运费 */
	@JsonProperty("freight_payer")
	private String freightPayer;

	/** 卖家是否确认发货 */
	@JsonProperty("seller_confirm")
	private String sellerConfirm;

	/** 物流公司名称 */
	@JsonProperty("company_name")
	private String logisticsCompany;

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getStartDelivery() {
		return this.startDelivery;
	}

	public void setStartDelivery(String startDelivery) {
		this.startDelivery = startDelivery;
	}

	public String getEndDelivery() {
		return this.endDelivery;
	}

	public void setEndDelivery(String endDelivery) {
		this.endDelivery = endDelivery;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}

	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public Location getReceiverLocation() {
		return this.receiverLocation;
	}

	public void setReceiverLocation(Location receiverLocation) {
		this.receiverLocation = receiverLocation;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFreightPayer() {
		return this.freightPayer;
	}

	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}

	public String getSellerConfirm() {
		return this.sellerConfirm;
	}

	public void setSellerConfirm(String sellerConfirm) {
		this.sellerConfirm = sellerConfirm;
	}

	public String getLogisticsCompany() {
		return this.logisticsCompany;
	}

	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

}
