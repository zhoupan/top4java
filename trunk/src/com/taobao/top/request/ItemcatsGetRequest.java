package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemcats.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemcatsGetRequest implements TopRequest {

	private String cids;
	private Date datetime;
	private String fields;
	private Long parentCid;

	public void setCids(String cids) {
		this.cids = cids;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setParentCid(Long parentCid) {
		this.parentCid = parentCid;
	}

	public String getApiName() {
		return "taobao.itemcats.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("cids", this.cids);
		params.put("datetime", this.datetime);
		params.put("fields", this.fields);
		params.put("parent_cid", this.parentCid);
		return params;
	}

}
