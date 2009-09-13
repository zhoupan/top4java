package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.taobaoke.items.convert
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TaobaokeItemsConvertRequest implements TopRequest {

	/** 需返回的字段列表 */
	private String fields;

	/** 商品编号串 */
	private String iids;

	/** 推广者的淘宝会员昵称 */
	private String nick;

	/** 用户自定义输入串 */
	private String outerCode;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setIids(String iids) {
		this.iids = iids;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}

	public String getApiName() {
		return "taobao.taobaoke.items.convert";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("iids", this.iids);
		params.put("nick", this.nick);
		params.put("outerCode", this.outerCode);

		return params;
	}

}
