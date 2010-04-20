package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListField;

/**
 * ItemSearch Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("item_search")
public class ItemSearch extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("item_category")
	@ApiListField("item_categories")
	private List<ItemCategory> itemCategories;

	@ApiField("item")
	@ApiListField("items")
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
