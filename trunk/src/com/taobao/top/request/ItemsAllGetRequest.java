package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.items.all.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemsAllGetRequest implements TopRequest {

	private Long cid;
	private String fields;
	private String orderBy;
	private Long pageNo;
	private Long pageSize;
	private String q;
	private String sellerCids;

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public void setQ(String q) {
		this.q = q;
	}
	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}

	public String getApiName() {
		return "taobao.items.all.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("cid", this.cid);
		params.put("fields", this.fields);
		params.put("order_by", this.orderBy);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("q", this.q);
		params.put("seller_cids", this.sellerCids);
		return params;
	}

}
