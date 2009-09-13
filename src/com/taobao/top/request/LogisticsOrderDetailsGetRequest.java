package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.shippings.send.fullinfo.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class LogisticsOrderDetailsGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 交易编号 */
	private String tid;

	/** 买家昵称 */
	private String buyerNick;

	/** 物流状态 */
	private String status;

	/** 卖家是否发货 */
	private String sellerConfirm;

	/** 收货人姓名 */
	private String receiverName;

	/** 创建时间开始 */
	private Date startCreated;

	/** 创建时间结束 */
	private Date endCreated;

	/** 谁承担运费 */
	private String freightPayer;

	/** 物流方式 */
	private String type;

	/** 页码 */
	private Integer pageNo;

	/** 每页条数 */
	private Integer pageSize;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setSellerConfirm(String sellerConfirm) {
		this.sellerConfirm = sellerConfirm;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public void setStartCreated(Date startCreated) {
		this.startCreated = startCreated;
	}

	public void setEndCreated(Date endCreated) {
		this.endCreated = endCreated;
	}

	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getApiName() {
		return "taobao.shippings.send.fullinfo.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("tid", this.tid);
		params.put("buyer_nick", this.buyerNick);
		params.put("status", this.status);
		params.put("seller_confirm", this.sellerConfirm);
		params.put("receiver_name", this.receiverName);
		params.put("start_created", this.startCreated);
		params.put("end_created", this.endCreated);
		params.put("freight_payer", this.freightPayer);
		params.put("type", this.type);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);

		return params;
	}

}
