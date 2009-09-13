package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trades.sold.increment.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TradesSoldIncrementGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 交易状态 */
	private String status;

	/** 交易类型 */
	private String type;

	/** 查询修改时间开始 */
	private Date startModified;

	/** 查询修改时间结束 */
	private Date endModified;

	/** 页码 */
	private Integer pageNo;

	/** 每页条数 */
	private Integer pageSize;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setStartModified(Date startModified) {
		this.startModified = startModified;
	}

	public void setEndModified(Date endModified) {
		this.endModified = endModified;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getApiName() {
		return "taobao.trades.sold.increment.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("status", this.status);
		params.put("type", this.type);
		params.put("start_modified", this.startModified);
		params.put("end_modified", this.endModified);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);

		return params;
	}

}
