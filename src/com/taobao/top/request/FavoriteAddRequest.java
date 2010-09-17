package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.favorite.add
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class FavoriteAddRequest implements TopRequest {

	private Integer collectType;
	private Long itemNumid;
	private Boolean shared;

	public void setCollectType(Integer collectType) {
		this.collectType = collectType;
	}
	public void setItemNumid(Long itemNumid) {
		this.itemNumid = itemNumid;
	}
	public void setShared(Boolean shared) {
		this.shared = shared;
	}

	public String getApiName() {
		return "taobao.favorite.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("collect_type", this.collectType);
		params.put("item_numid", this.itemNumid);
		params.put("shared", this.shared);
		return params;
	}

}
