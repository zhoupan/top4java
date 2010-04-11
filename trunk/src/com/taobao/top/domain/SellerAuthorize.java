package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonList;

/**
 * SellerAuthorize Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class SellerAuthorize extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonList(list="brands", name="brand")
	private List<Brand> brands;

	@JsonList(list="item_cats", name="item_cat")
	private List<ItemCat> itemCats;

	public List<Brand> getBrands() {
		return this.brands;
	}
	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

	public List<ItemCat> getItemCats() {
		return this.itemCats;
	}
	public void setItemCats(List<ItemCat> itemCats) {
		this.itemCats = itemCats;
	}

}
