package com.taobao.top.domain;

import java.util.Date;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 类目统计。
 * 
 * @author carver.gu
 * @since 1.0, Oct 10, 2009
 */
@JsonClass("cat_stats")
public class CatStat extends BaseObject {

	/** 类目编号 */
	@JsonProperty("cid")
	private Long cid;

	/** 类目名称 */
	@JsonProperty("cat_name")
	private String cname;

	/** 类目所占销售额比率 */
	@JsonProperty("percent")
	private String percent;

	/** 销售量 */
	@JsonProperty("item_num")
	private Long saleNum;

	/** 销售额 */
	@JsonProperty("volume")
	private Long saleVolume;

	/** 统计时间 */
	@JsonProperty("created")
	private Date date;

	public Long getCid() {
		return this.cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getPercent() {
		return this.percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
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

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
