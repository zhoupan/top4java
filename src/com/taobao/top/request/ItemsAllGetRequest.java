package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.items.all.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemsAllGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 查询条件 */
	private String query;

	/** 商品类目编号 */
	private Long cid;

	/** 卖家自定义的商品类目编号列表 */
	private String sellerCids;

	/** 页码 */
	private Integer pageNo;

	/** 每页大小 */
	private Integer pageSize;

	/** 排序方式 */
	private String orderBy;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getApiName() {
		return "taobao.items.all.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("q", this.query);
		params.put("cid", this.cid);
		params.put("seller_cids", this.sellerCids);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("order_by", this.orderBy);

		return params;
	}

}
