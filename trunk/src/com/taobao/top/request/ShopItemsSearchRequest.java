package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.shopitem.search
 * 
 * @author carver.gu
 * @since 1.0, Dec 12, 2009
 */
public class ShopItemsSearchRequest implements TopRequest {

	/** 店铺编号 */
	private Long shopId;

	/** 类目编号 */
	private Long catId;

	/** 收藏人数下限 */
	private Integer lowerCollect;

	/** 收藏人数上限 */
	private Integer higerCollect;

	/** 评价人数下限 */
	private Integer lowerRate;

	/** 评价人数上限 */
	private Integer higerRate;

	/** 30天内销售量下限 */
	private Integer lowerSold;

	/** 30天内销售量上限 */
	private Integer higerSold;

	/** 页码 */
	private Integer pageNo;

	/** 每页大小 */
	private Integer pageSize;

	/** 排序方式 */
	private String sortType;

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public void setLowerCollect(Integer lowerCollect) {
		this.lowerCollect = lowerCollect;
	}

	public void setHigerCollect(Integer higerCollect) {
		this.higerCollect = higerCollect;
	}

	public void setLowerRate(Integer lowerRate) {
		this.lowerRate = lowerRate;
	}

	public void setHigerRate(Integer higerRate) {
		this.higerRate = higerRate;
	}

	public void setLowerSold(Integer lowerSold) {
		this.lowerSold = lowerSold;
	}

	public void setHigerSold(Integer higerSold) {
		this.higerSold = higerSold;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	@Override
	public String getApiName() {
		return "taobao.item.shopitem.search";
	}

	@Override
	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("shop_id", this.shopId);
		params.put("cate_id", this.catId);
		params.put("lower_collect", this.lowerCollect);
		params.put("higer_collect", this.higerCollect);
		params.put("lower_rate", this.lowerRate);
		params.put("higer_rate", this.higerRate);
		params.put("lower_sold", this.lowerSold);
		params.put("higher_sold", this.higerSold);
		params.put("page_index", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("sortType", this.sortType);
		return params;
	}

}
