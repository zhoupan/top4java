package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.tbsupdate
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemTbsupdateRequest implements TopRequest {

	private String iid;
	private String isEx;
	private String isTaobao;
	private Long numIid;

	public void setIid(String iid) {
		this.iid = iid;
	}
	public void setIsEx(String isEx) {
		this.isEx = isEx;
	}
	public void setIsTaobao(String isTaobao) {
		this.isTaobao = isTaobao;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getApiName() {
		return "taobao.item.tbsupdate";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("iid", this.iid);
		params.put("is_ex", this.isEx);
		params.put("is_taobao", this.isTaobao);
		params.put("num_iid", this.numIid);
		return params;
	}

}
