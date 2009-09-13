package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.taobaoke.listurl.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TaobaokeListUrlGetRequest implements TopRequest {

	/** 关键词 */
	private String query;

	/** 推广者的淘宝会员昵称 */
	private String nick;

	/** 用户自定义输入串 */
	private String outerCode;

	public void setQuery(String query) {
		this.query = query;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}

	public String getApiName() {
		return "taobao.taobaoke.listurl.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("q", this.query);
		params.put("nick", this.nick);
		params.put("outerCode", this.outerCode);

		return params;
	}

}
