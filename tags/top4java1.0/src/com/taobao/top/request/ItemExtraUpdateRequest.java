package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemextra.update
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemExtraUpdateRequest implements TopRequest {

	/** 商品编号 */
	private String iid;

	/** 商品标题 */
	private String title;

	/** 商品描述 */
	private String description;

	/** 自定义信息 */
	private String feature;

	/** 商品备注 */
	private String memo;

	/** 扩展类型 */
	private String type;

	/** 预订金 */
	private String reservePrice;

	/** SKU的属性串 */
	private String skuProps;

	/** SKU的数量串 */
	private String skuQuantities;

	/** SKU的价格串 */
	private String skuPrices;

	/** SKU的备注串 */
	private String skuMemos;

	/** SKU的编号串 */
	private String skuIds;

	/** SKU的主键串 */
	private String skuExtraIds;

	public void setIid(String iid) {
		this.iid = iid;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setReservePrice(String reservePrice) {
		this.reservePrice = reservePrice;
	}

	public void setSkuProps(String skuProps) {
		this.skuProps = skuProps;
	}

	public void setSkuQuantities(String skuQuantities) {
		this.skuQuantities = skuQuantities;
	}

	public void setSkuPrices(String skuPrices) {
		this.skuPrices = skuPrices;
	}

	public void setSkuMemos(String skuMemos) {
		this.skuMemos = skuMemos;
	}

	public void setSkuIds(String skuIds) {
		this.skuIds = skuIds;
	}

	public void setSkuExtraIds(String skuExtraIds) {
		this.skuExtraIds = skuExtraIds;
	}

	public String getApiName() {
		return "taobao.itemextra.update";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("iid", this.iid);
		params.put("title", this.title);
		params.put("desc", this.description);
		params.put("feature", this.feature);
		params.put("memo", this.memo);
		params.put("type", this.type);
		params.put("reserve_price", this.reservePrice);
		params.put("sku_properties", this.skuProps);
		params.put("sku_quantities", this.skuQuantities);
		params.put("sku_prices", this.skuPrices);
		params.put("sku_memos", this.skuMemos);
		params.put("sku_ids", this.skuIds);
		params.put("sku_extra_ids", this.skuExtraIds);

		return params;
	}

}
