package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.taobaoke.items.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TaobaokeItemsGetRequest implements TopRequest {

	/** 需要返回的字段 */
	private String fields;

	/** 输入格式：mm_会员id_网站id_广告位id */
	private String pid;

	/** 商品标题中包含的关键字 */
	private String keyword;

	/** 商品所属分类编号 */
	private String cid;

	/** 起始价格 */
	private String startPrice;

	/** 最高价格 */
	private String endPrice;

	/** 是否自动发货 */
	private Boolean autoSend;

	/** 商品所在地 */
	private String area;

	/** 卖家信用 */
	private String startCredit;

	/** 卖家信用 */
	private String endCredit;

	/** 默认排序 */
	private String orderBy;

	/** 是否查询消保卖家 */
	private Boolean isGuarantee;

	/** 起始佣金选项 */
	private String startCommission;

	/** 最高佣金选项 */
	private String endCommission;

	/** 起始佣金比率选项 */
	private String startCommissionRate;

	/** 最高佣金比率选项 */
	private String endCommissionRate;

	/** 起始累计推广量选项 */
	private String startCommissionNum;

	/** 最高累计推广量选项 */
	private String endCommissionNum;

	/** 页码 */
	private Integer pageNo;

	/** 每页返回结果数 */
	private Integer pageSize;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}

	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}

	public void setAutoSend(Boolean autoSend) {
		this.autoSend = autoSend;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setStartCredit(String startCredit) {
		this.startCredit = startCredit;
	}

	public void setEndCredit(String endCredit) {
		this.endCredit = endCredit;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public void setIsGuarantee(Boolean isGuarantee) {
		this.isGuarantee = isGuarantee;
	}

	public void setStartCommission(String startCommission) {
		this.startCommission = startCommission;
	}

	public void setEndCommission(String endCommission) {
		this.endCommission = endCommission;
	}

	public void setStartCommissionRate(String startCommissionRate) {
		this.startCommissionRate = startCommissionRate;
	}

	public void setEndCommissionRate(String endCommissionRate) {
		this.endCommissionRate = endCommissionRate;
	}

	public void setStartCommissionNum(String startCommissionNum) {
		this.startCommissionNum = startCommissionNum;
	}

	public void setEndCommissionNum(String endCommissionNum) {
		this.endCommissionNum = endCommissionNum;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getApiName() {
		return "taobao.taobaoke.items.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("pid", this.pid);
		params.put("keyword", this.keyword);
		params.put("cid", this.cid);
		params.put("start_price", this.startPrice);
		params.put("end_price", this.endPrice);
		params.put("auto_send", this.autoSend);
		params.put("area", this.area);
		params.put("start_credit", this.startCredit);
		params.put("end_credit", this.endCredit);
		params.put("sort", this.orderBy);
		params.put("is_guarantee", this.isGuarantee);
		params.put("start_commission", this.startCommission);
		params.put("end_commission", this.endCommission);
		params.put("start_commissionRate", this.startCommissionRate);
		params.put("end_commissionRate", this.endCommissionRate);
		params.put("start_commissionNum", this.startCommissionNum);
		params.put("end_commissionNum", this.endCommissionNum);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);

		return params;
	}

}
