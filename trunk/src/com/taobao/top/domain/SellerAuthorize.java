package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListField;

/**
 * SellerAuthorize Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("seller_authorize")
public class SellerAuthorize extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("brand")
	@JsonListField("brands")
	private List<Brand> brands;

	@JsonField("item_cat")
	@JsonListField("item_cats")
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
