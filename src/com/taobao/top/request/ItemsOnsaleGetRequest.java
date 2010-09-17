package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.items.onsale.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemsOnsaleGetRequest implements TopRequest {

	private Long cid;
	private Date endModified;
	private String fields;
	private Boolean hasDiscount;
	private Boolean hasShowcase;
	private Boolean isEx;
	private Boolean isTaobao;
	private String orderBy;
	private Integer pageNo;
	private Integer pageSize;
	private String q;
	private String sellerCids;
	private Date startModified;

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public void setEndModified(Date endModified) {
		this.endModified = endModified;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setHasDiscount(Boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}
	public void setHasShowcase(Boolean hasShowcase) {
		this.hasShowcase = hasShowcase;
	}
	public void setIsEx(Boolean isEx) {
		this.isEx = isEx;
	}
	public void setIsTaobao(Boolean isTaobao) {
		this.isTaobao = isTaobao;
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
	public void setQ(String q) {
		this.q = q;
	}
	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}
	public void setStartModified(Date startModified) {
		this.startModified = startModified;
	}

	public String getApiName() {
		return "taobao.items.onsale.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("cid", this.cid);
		params.put("end_modified", this.endModified);
		params.put("fields", this.fields);
		params.put("has_discount", this.hasDiscount);
		params.put("has_showcase", this.hasShowcase);
		params.put("is_ex", this.isEx);
		params.put("is_taobao", this.isTaobao);
		params.put("order_by", this.orderBy);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("q", this.q);
		params.put("seller_cids", this.sellerCids);
		params.put("start_modified", this.startModified);
		return params;
	}

}
