package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trades.sold.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradesSoldGetRequest implements TopRequest {

	private String buyerNick;
	private Date endCreated;
	private String fields;
	private Integer pageNo;
	private Integer pageSize;
	private String rateStatus;
	private Date startCreated;
	private String status;
	private String tag;
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
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public void setRateStatus(String rateStatus) {
		this.rateStatus = rateStatus;
	}
	public void setStartCreated(Date startCreated) {
		this.startCreated = startCreated;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getApiName() {
		return "taobao.trades.sold.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("buyer_nick", this.buyerNick);
		params.put("end_created", this.endCreated);
		params.put("fields", this.fields);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("rate_status", this.rateStatus);
		params.put("start_created", this.startCreated);
		params.put("status", this.status);
		params.put("tag", this.tag);
		params.put("type", this.type);
		return params;
	}

}
