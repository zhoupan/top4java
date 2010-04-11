package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListField;

/**
 * ItemSearch Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("item_search")
public class ItemSearch extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("item_category")
	@JsonListField("item_categories")
	private List<ItemCategory> itemCategories;

	@JsonField("item")
	@JsonListField("items")
	private List<Item> items;

	public List<ItemCategory> getItemCategories() {
		return this.itemCategories;
	}
	public void setItemCategories(List<ItemCategory> itemCategories) {
		this.itemCategories = itemCategories;
	}

	public List<Item> getItems() {
		return this.items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}

}
