package com.taobao.top.domain;

import java.util.Date;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 交易统计。
 * 
 * @author carver.gu
 * @since 1.0, Oct 10, 2009
 */
@JsonClass("trade_stats")
public class TradeStat extends BaseObject {

	/** 商品编号 */
	@JsonProperty("item_num")
	private Long saleNum;

	/** 商品编号 */
	@JsonProperty("volume")
	private Long saleVolume;

	/** 统计时间 */
	@JsonProperty("created")
	private Date date;

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

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
