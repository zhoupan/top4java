package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 商品搜索结果。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("itemsearchs")
public class ItemSearch extends BaseObject {

	/** 商品列表 */
	@JsonProperty("item_list")
	private List<Item> items;

	/** 商品分类列表 */
	@JsonProperty("category_list")
	private List<ItemCat> itemCats;

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<ItemCat> getItemCats() {
		return this.itemCats;
	}

	public void setItemCats(List<ItemCat> itemCats) {
		this.itemCats = itemCats;
	}

}
