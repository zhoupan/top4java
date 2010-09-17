package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.taobaoke.items.detail.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TaobaokeItemsDetailGetRequest implements TopRequest {

	private String fields;
	private String nick;
	private String numIids;
	private String outerCode;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setNumIids(String numIids) {
		this.numIids = numIids;
	}
	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}

	public String getApiName() {
		return "taobao.taobaoke.items.detail.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		params.put("nick", this.nick);
		params.put("num_iids", this.numIids);
		params.put("outer_code", this.outerCode);
		return params;
	}

}
