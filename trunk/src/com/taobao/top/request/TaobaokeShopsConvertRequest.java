package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.taobaoke.shops.convert
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TaobaokeShopsConvertRequest implements TopRequest {

	private String fields;
	private String nick;
	private String outerCode;
	private String sids;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}
	public void setSids(String sids) {
		this.sids = sids;
	}

	public String getApiName() {
		return "taobao.taobaoke.shops.convert";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("nick", this.nick);
		params.put("outer_code", this.outerCode);
		params.put("sids", this.sids);
		return params;
	}

}
