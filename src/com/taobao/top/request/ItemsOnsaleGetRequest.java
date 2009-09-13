package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.items.onsale.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemsOnsaleGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 搜索字段 */
	private String query;

	/** 类目编号 */
	private String cid;

	/** 卖家店铺内自定义类目编号 */
	private String sellerCids;

	/** 页码 */
	private Integer pageNo;

	/** 每页条数 */
	private Integer pageSize;

	/** 是否参与会员折扣 */
	private Boolean hasDiscount;

	/** 是否橱窗推荐 */
	private Boolean hasShowcase;

	/** 排序方式 */
	private String orderBy;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public void setCid(String cid) {
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

	public void setHasDiscount(Boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}

	public void setHasShowcase(Boolean hasShowcase) {
		this.hasShowcase = hasShowcase;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getApiName() {
		return "taobao.items.onsale.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("q", this.query);
		params.put("cid", this.cid);
		params.put("seller_cids", this.sellerCids);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("has_discount", this.hasDiscount);
		params.put("has_showcase", this.hasShowcase);
		params.put("order_by", this.orderBy);

		return params;
	}

}
