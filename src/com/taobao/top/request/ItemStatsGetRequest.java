package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemstats.get
 * 
 * @author carver.gu
 * @since 1.0, Oct 10, 2009
 */
public class ItemStatsGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 卖家昵称 */
	private String sellerNick;

	/** 查询开始时间 */
	private Date startCreated;

	/** 查询结束时间 */
	private Date endCreated;

	/** 统计排序方式 */
	private String orderBy;

	/** 页码 */
	private Integer pageNo;

	/** 每页条数 */
	private Integer pageSize;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public void setStartCreated(Date startCreated) {
		this.startCreated = startCreated;
	}

	public void setEndCreated(Date endCreated) {
		this.endCreated = endCreated;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getApiName() {
		return "taobao.itemstats.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("nick", this.sellerNick);
		params.put("start_created", this.startCreated);
		params.put("end_created", this.endCreated);
		params.put("order_by", this.orderBy);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		return params;
	}

}
