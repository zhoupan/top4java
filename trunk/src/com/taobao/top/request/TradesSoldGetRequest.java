package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trades.sold.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TradesSoldGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 查询交易创建时间开始 */
	private Date startCreated;

	/** 查询交易创建时间结束 */
	private Date endCreated;

	/** 页码 */
	private Integer pageNo;

	/** 每页条数 */
	private Integer pageSize;

	/** 商品名称 */
	private String title;

	/** 交易状态 */
	private String status;

	/** 交易类型 */
	private String type;

	/** 评价状态 */
	private String rateStatus;

	/** 买家昵称 */
	private String buyerNick;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setStartCreated(Date startCreated) {
		this.startCreated = startCreated;
	}

	public void setEndCreated(Date endCreated) {
		this.endCreated = endCreated;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setRateStatus(String rateStatus) {
		this.rateStatus = rateStatus;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getApiName() {
		return "taobao.trades.sold.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("start_created", this.startCreated);
		params.put("end_created", this.endCreated);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("title", this.title);
		params.put("status", this.status);
		params.put("buyer_nick", this.buyerNick);
		params.put("type", this.type);
		params.put("rate_status", this.rateStatus);

		return params;
	}

}