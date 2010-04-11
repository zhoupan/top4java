package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;

/**
 * ItemCategory Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("item_category")
@JsonListClass("item_categories")
public class ItemCategory extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("category_id")
	private Long categoryId;

	@JsonField("count")
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
