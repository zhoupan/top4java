package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trades.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradesGetRequest implements TopRequest {

	private String fields;
	private String iid;
	private Long pageNo;
	private Long pageSize;
	private String sellerNick;
	private String type;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getApiName() {
		return "taobao.trades.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("iid", this.iid);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("seller_nick", this.sellerNick);
		params.put("type", this.type);
		return params;
	}

}
