package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 商品统计。
 * 
 * @author carver.gu
 * @since 1.0, Oct 10, 2009
 */
@JsonClass("item_stats")
public class ItemStat extends BaseObject {

	private static final long serialVersionUID = 8272902864865271522L;

	/** 商品编号 */
	@JsonProperty("iid")
	private Long itemId;

	/** 商品标题 */
	@JsonProperty("item_title")
	private String itemTitle;

	/** 商品图片地址 */
	@JsonProperty("item_pic_path")
	private String itemImgUrl;

	/** 商品销售数量 */
	@JsonProperty("item_num")
	private Long saleNum;

	/** 商品销售额 */
	@JsonProperty("volume")
	private Long saleVolume;

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}

	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getItemImgUrl() {
		return this.itemImgUrl;
	}

	public void setItemImgUrl(String itemImgUrl) {
		this.itemImgUrl = itemImgUrl;
	}

	public Long getSaleNum() {
		return this.saleNum;
	}

	public void setSaleNum(Long saleNum) {
		this.saleNum = saleNum;
	}

	public Long getSaleVolume() {
		return this.saleVolume;
	}

	public void setSaleVolume(Long saleVolume) {
		this.saleVolume = saleVolume;
	}

}
