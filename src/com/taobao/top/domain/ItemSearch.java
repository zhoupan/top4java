package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonList;

/**
 * ItemSearch Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemSearch extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonList(list="item_categories", name="item_category")
	private List<ItemCategory> itemCategories;

	@JsonList(list="items", name="item")
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
