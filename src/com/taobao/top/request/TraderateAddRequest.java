package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.traderate.add
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TraderateAddRequest implements TopRequest {

	private String anony;
	private String content;
	private String oid;
	private String result;
	private String role;
	private String tid;

	public void setAnony(String anony) {
		this.anony = anony;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getApiName() {
		return "taobao.traderate.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("anony", this.anony);
		params.put("content", this.content);
		params.put("oid", this.oid);
		params.put("result", this.result);
		params.put("role", this.role);
		params.put("tid", this.tid);
		return params;
	}

}
