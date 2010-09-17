package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.products.search
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ProductsSearchRequest implements TopRequest {

	private Long cid;
	private String fields;
	private Integer pageNo;
	private Integer pageSize;
	private String props;
	private String q;
	private String status;
	private Long verticalMarket;

	public void setCid(Long cid) {
		this.cid = cid;
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
	public void setProps(String props) {
		this.props = props;
	}
	public void setQ(String q) {
		this.q = q;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setVerticalMarket(Long verticalMarket) {
		this.verticalMarket = verticalMarket;
	}

	public String getApiName() {
		return "taobao.products.search";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("cid", this.cid);
		params.put("fields", this.fields);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("props", this.props);
		params.put("q", this.q);
		params.put("status", this.status);
		params.put("vertical_market", this.verticalMarket);
		return params;
	}

}
