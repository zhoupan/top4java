package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemprop.list.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemPropListRequest implements TopRequest {

	/** 叶子类目编号 */
	private String cid;

	/** 类目属性编号 */
	private String pid;

	/** 类目子属性路径 */
	private String childPropPath;

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public void setChildPropPath(String childPropPath) {
		this.childPropPath = childPropPath;
	}

	public String getApiName() {
		return "taobao.itemprop.list.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("cid", this.cid);
		params.put("pid", this.pid);
		params.put("child_path", this.childPropPath);

		return params;
	}

}
