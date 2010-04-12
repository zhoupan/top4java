package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemextras.search
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemextrasSearchRequest implements TopRequest {

	private String endPrice;
	private String fields;
	private String nick;
	private String numIids;
	private Long options;
	private String orderBy;
	private Integer pageNo;
	private Integer pageSize;
	private String q;
	private String sellerCids;
	private Long shopId;
	private String startPrice;
	private String type;

	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setNumIids(String numIids) {
		this.numIids = numIids;
	}
	public void setOptions(Long options) {
		this.options = options;
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
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getApiName() {
		return "taobao.itemextras.search";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("end_price", this.endPrice);
		params.put("fields", this.fields);
		params.put("nick", this.nick);
		params.put("num_iids", this.numIids);
		params.put("options", this.options);
		params.put("order_by", this.orderBy);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("q", this.q);
		params.put("seller_cids", this.sellerCids);
		params.put("shop_id", this.shopId);
		params.put("start_price", this.startPrice);
		params.put("type", this.type);
		return params;
	}

}
