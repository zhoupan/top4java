package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.items.instock.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemsInstockGetRequest implements TopRequest {

	/** 需要返回的商品对象字段 */
	private String fields;

	/** 搜索字段 */
	private String query;

	/** 分类字段 */
	private String banner;

	/** 页码 */
	private Integer pageNo;

	/** 每页条数 */
	private Integer pageSize;

	/** 排序方式 */
	private String orderBy;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public void setBanner(String banner) {
		this.banner = banner;
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
		return "taobao.items.instock.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("q", this.query);
		params.put("banner", this.banner);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("order_by", this.orderBy);

		return params;
	}

}
