package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.taobaoke.shops.convert
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TaobaokeShopsConvertRequest implements TopRequest {

	/** 需返回的字段列表 */
	private String fields;

	/** 店铺编号串 */
	private String sids;

	/** 推广者的淘宝会员昵称 */
	private String nick;

	/** 用户自定义输入串 */
	private String outerCode;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setSids(String sids) {
		this.sids = sids;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}

	public String getApiName() {
		return "taobao.taobaoke.shops.convert";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("sids", this.sids);
		params.put("nick", this.nick);
		params.put("outer_code", this.outerCode);

		return params;
	}

}
