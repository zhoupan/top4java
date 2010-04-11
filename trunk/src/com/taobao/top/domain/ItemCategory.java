package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * ItemCategory Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemCategory extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("category_id")
	private Long categoryId;

	@JsonProperty("count")
	private Integer count;

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getCount() {
		return this.count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}

}
