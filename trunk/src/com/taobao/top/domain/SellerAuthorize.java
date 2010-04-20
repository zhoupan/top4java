package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListField;

/**
 * SellerAuthorize Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("seller_authorize")
public class SellerAuthorize extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("brand")
	@ApiListField("brands")
	private List<Brand> brands;

	@ApiField("item_cat")
	@ApiListField("item_cats")
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
