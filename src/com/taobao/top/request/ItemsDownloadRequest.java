package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.items.download
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemsDownloadRequest implements TopRequest {

	private String approveStatus;
	private Long cid;
	private Date endDate;
	private Long pageNo;
	private Long pageSize;
	private String q;
	private String sellerCids;
	private Date startDate;

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public void setQ(String q) {
		this.q = q;
	}
	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getApiName() {
		return "taobao.items.download";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("approve_status", this.approveStatus);
		params.put("cid", this.cid);
		params.put("end_date", this.endDate);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("q", this.q);
		params.put("seller_cids", this.sellerCids);
		params.put("start_date", this.startDate);
		return params;
	}

}
