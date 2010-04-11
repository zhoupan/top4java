package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.logistics.orders.detail.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class LogisticsOrdersDetailGetRequest implements TopRequest {

	private String buyerNick;
	private Date endCreated;
	private String fields;
	private String freightPayer;
	private Integer pageNo;
	private Integer pageSize;
	private String receiverName;
	private String sellerConfirm;
	private Date startCreated;
	private String status;
	private Long tid;
	private String type;

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	public void setEndCreated(Date endCreated) {
		this.endCreated = endCreated;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public void setSellerConfirm(String sellerConfirm) {
		this.sellerConfirm = sellerConfirm;
	}
	public void setStartCreated(Date startCreated) {
		this.startCreated = startCreated;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getApiName() {
		return "taobao.logistics.orders.detail.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("buyer_nick", this.buyerNick);
		params.put("end_created", this.endCreated);
		params.put("fields", this.fields);
		params.put("freight_payer", this.freightPayer);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("receiver_name", this.receiverName);
		params.put("seller_confirm", this.sellerConfirm);
		params.put("start_created", this.startCreated);
		params.put("status", this.status);
		params.put("tid", this.tid);
		params.put("type", this.type);
		return params;
	}

}
