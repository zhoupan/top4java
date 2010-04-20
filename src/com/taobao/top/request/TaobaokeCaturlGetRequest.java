package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.taobaoke.caturl.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TaobaokeCaturlGetRequest implements TopRequest {

	private Integer cid;
	private String nick;
	private String outerCode;
	private String q;

	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}
	public void setQ(String q) {
		this.q = q;
	}

	public String getApiName() {
		return "taobao.taobaoke.caturl.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("cid", this.cid);
		params.put("nick", this.nick);
		params.put("outer_code", this.outerCode);
		params.put("q", this.q);
		return params;
	}

}
