package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itempropvalues.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemPropValuesGetRequest implements TopRequest {

	/** 需要返回的字段 */
	private String fields;

	/** 叶子类目编号 */
	private Long cid;

	/** 属性和属性值编号串 */
	private String pvs;

	/** 增量时间戳 */
	private Date dateTime;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public void setPvs(String pvs) {
		this.pvs = pvs;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getApiName() {
		return "taobao.itempropvalues.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("cid", this.cid);
		params.put("pvs", this.pvs);
		params.put("datetime", this.dateTime);

		return params;
	}

}
