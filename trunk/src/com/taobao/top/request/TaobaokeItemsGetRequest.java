package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.taobaoke.items.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TaobaokeItemsGetRequest implements TopRequest {

	private String area;
	private String autoSend;
	private String cid;
	private String endCommissionNum;
	private String endCommissionRate;
	private String endCredit;
	private String endPrice;
	private String fields;
	private String guarantee;
	private String keyword;
	private String nick;
	private String outerCode;
	private Integer pageNo;
	private Integer pageSize;
	private String pid;
	private String sort;
	private String startCommissionNum;
	private String startCommissionRate;
	private String startCredit;
	private String startPrice;

	public void setArea(String area) {
		this.area = area;
	}
	public void setAutoSend(String autoSend) {
		this.autoSend = autoSend;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public void setEndCommissionNum(String endCommissionNum) {
		this.endCommissionNum = endCommissionNum;
	}
	public void setEndCommissionRate(String endCommissionRate) {
		this.endCommissionRate = endCommissionRate;
	}
	public void setEndCredit(String endCredit) {
		this.endCredit = endCredit;
	}
	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public void setStartCommissionNum(String startCommissionNum) {
		this.startCommissionNum = startCommissionNum;
	}
	public void setStartCommissionRate(String startCommissionRate) {
		this.startCommissionRate = startCommissionRate;
	}
	public void setStartCredit(String startCredit) {
		this.startCredit = startCredit;
	}
	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}

	public String getApiName() {
		return "taobao.taobaoke.items.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("area", this.area);
		params.put("auto_send", this.autoSend);
		params.put("cid", this.cid);
		params.put("end_commissionNum", this.endCommissionNum);
		params.put("end_commissionRate", this.endCommissionRate);
		params.put("end_credit", this.endCredit);
		params.put("end_price", this.endPrice);
		params.put("fields", this.fields);
		params.put("guarantee", this.guarantee);
		params.put("keyword", this.keyword);
		params.put("nick", this.nick);
		params.put("outer_code", this.outerCode);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("pid", this.pid);
		params.put("sort", this.sort);
		params.put("start_commissionNum", this.startCommissionNum);
		params.put("start_commissionRate", this.startCommissionRate);
		params.put("start_credit", this.startCredit);
		params.put("start_price", this.startPrice);
		return params;
	}

}
