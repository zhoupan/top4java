package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemcats.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemCatsGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 类目编号列表 */
	private String cids;

	/** 父商品类目编号 */
	private Long parentCid;

	/** 时间戳 */
	private Date dateTime;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setCids(String cids) {
		this.cids = cids;
	}

	public void setParentCid(Long parentCid) {
		this.parentCid = parentCid;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getApiName() {
		return "taobao.itemcats.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("parent_cid", this.parentCid);
		params.put("cids", this.cids);
		params.put("datetime", this.dateTime);

		return params;
	}

}
