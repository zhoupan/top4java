package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.user.detail.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class UserDetailGetRequest implements TopRequest {

	private String alipayNo;
	private String fields;
	private String nick;

	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getApiName() {
		return "taobao.user.detail.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("alipay_no", this.alipayNo);
		params.put("fields", this.fields);
		params.put("nick", this.nick);
		return params;
	}

}
