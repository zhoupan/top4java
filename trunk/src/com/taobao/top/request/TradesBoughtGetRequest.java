package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trades.bought.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradesBoughtGetRequest implements TopRequest {

	private Date endCreated;
	private String fields;
	private Integer pageNo;
	private Integer pageSize;
	private String rateStatus;
	private String sellerNick;
	private Date startCreated;
	private String status;
	private String type;

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
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}
	public void setStartCreated(Date startCreated) {
		this.startCreated = startCreated;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getApiName() {
		return "taobao.trades.bought.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("end_created", this.endCreated);
		params.put("fields", this.fields);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("rate_status", this.rateStatus);
		params.put("seller_nick", this.sellerNick);
		params.put("start_created", this.startCreated);
		params.put("status", this.status);
		params.put("type", this.type);
		return params;
	}

}
