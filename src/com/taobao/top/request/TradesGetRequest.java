package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trades.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TradesGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 商品编号 */
	private String iid;

	/** 卖家昵称 */
	private String sellerNick;

	/** 交易类型 */
	private String type;

	/** 页码 */
	private Integer pageNo;

	/** 每页条数 */
	private Integer pageSize;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getApiName() {
		return "taobao.trades.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("iid", this.iid);
		params.put("seller_nick", this.sellerNick);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("type", this.type);

		return params;
	}

}
