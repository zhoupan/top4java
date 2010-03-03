package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 商家授权品牌和类目。
 * 
 * @author carver.gu
 * @since 1.0, Nov 16, 2009
 */
@JsonClass("authorizes")
public class AuthorizeCats extends BaseObject {

	private static final long serialVersionUID = -3663119779869534880L;

	/** 品牌列表 */
	@JsonProperty("brands")
	private List<Brand> brands;

	/** 类目列表 */
	@JsonProperty("item_cats")
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
