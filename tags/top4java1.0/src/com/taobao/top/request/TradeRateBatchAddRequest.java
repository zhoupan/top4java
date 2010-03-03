package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.traderate.list.add
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TradeRateBatchAddRequest implements TopRequest {

	/** 交易编号 */
	private Long tid;

	/** 评价内容 */
	private String content;

	/** 评价结果 */
	private String result;

	/** 是否匿名 */
	private Boolean anonymous;

	/** 评价者角色 */
	private String role;

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setAnonymous(Boolean anonymous) {
		this.anonymous = anonymous;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getApiName() {
		return "taobao.traderate.list.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("tid", this.tid);
		params.put("content", this.content);
		params.put("result", this.result);
		params.put("anony", this.anonymous);
		params.put("role", this.role);

		return params;
	}

}
