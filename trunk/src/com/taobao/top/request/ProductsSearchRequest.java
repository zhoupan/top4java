package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.products.search
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ProductsSearchRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 搜索的关键词 */
	private String query;

	/** 类目编号 */
	private String cid;

	/** 关键属性串 */
	private String props;

	/** 每页显示条数 */
	private Integer pageNo;

	/** 页码 */
	private Integer pageSize;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setProps(String props) {
		this.props = props;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getApiName() {
		return "taobao.products.search";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("q", this.query);
		params.put("cid", this.cid);
		params.put("props", this.props);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);

		return params;
	}

}
