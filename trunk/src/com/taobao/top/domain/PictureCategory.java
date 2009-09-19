package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 图片分类。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class PictureCategory extends BaseObject {

	/** 图片分类编号 */
	@JsonProperty("picture_category_id")
	private Long id;

	/** 图片分类名 */
	@JsonProperty("picture_category_name")
	private String name;

	/** 卖家编号 */
	@JsonProperty("uid")
	private Long uid;

	/** 图片分类排序 */
	@JsonProperty("sorts")
	private Long sort;

	/** 图片分类型别 */
	@JsonProperty("type")
	private Long type;

	/** 分类下的图片数 */
	@JsonProperty("total")
	private Long total;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Long getSort() {
		return this.sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	}

	public Long getType() {
		return this.type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

}
