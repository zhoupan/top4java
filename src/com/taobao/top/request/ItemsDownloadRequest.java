package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.items.download
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemsDownloadRequest implements TopRequest {

	/** 商品所属的店铺内卖家自定义类目 */
	private String sellerCids;

	/** 商品所属的类目编号 */
	private String cid;

	/** 匹配关键词 */
	private String query;

	/** 在售(onsale)、仓库中(instock)、违规(irregular) */
	private String approveStatus;

	/** 开始时间最小值 */
	private Date startDate;

	/** 开始时间最大值 */
	private Date endDate;

	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getApiName() {
		return "taobao.items.download";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("seller_cids", this.sellerCids);
		params.put("cid", this.cid);
		params.put("q", this.query);
		params.put("approve_status", this.approveStatus);
		params.put("start_date", this.startDate);
		params.put("end_date", this.endDate);

		return params;
	}

}
