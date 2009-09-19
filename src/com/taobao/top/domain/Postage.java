package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonProperty;

/**
 * 运费模板。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class Postage extends BaseObject {

	/** 运费模板编号 */
	@JsonProperty("postage_id")
	private Long id;

	/** 运费模板名称 */
	@JsonProperty("name")
	private String name;

	/** 备注 */
	@JsonProperty("memo")
	private String memo;

	/** 平邮收费 */
	@JsonProperty("post_price")
	private String postPrice;

	/** 平邮加件收费 */
	@JsonProperty("post_increase")
	private String postIncrease;

	/** 快递收费 */
	@JsonProperty("express_price")
	private String expressPrice;

	/** 快递加件费用 */
	@JsonProperty("express_increase")
	private String expressIncrease;

	/** EMS收费 */
	@JsonProperty("ems_price")
	private String emsPrice;

	/** EMS加件费用 */
	@JsonProperty("ems_increase")
	private String emsIncrease;

	/** 运费方式模板收费方式 */
	@JsonProperty("postage_mode_list")
	private List<PostageMode> postageModes;

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

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPostPrice() {
		return this.postPrice;
	}

	public void setPostPrice(String postPrice) {
		this.postPrice = postPrice;
	}

	public String getPostIncrease() {
		return this.postIncrease;
	}

	public void setPostIncrease(String postIncrease) {
		this.postIncrease = postIncrease;
	}

	public String getExpressPrice() {
		return this.expressPrice;
	}

	public void setExpressPrice(String expressPrice) {
		this.expressPrice = expressPrice;
	}

	public String getExpressIncrease() {
		return this.expressIncrease;
	}

	public void setExpressIncrease(String expressIncrease) {
		this.expressIncrease = expressIncrease;
	}

	public String getEmsPrice() {
		return this.emsPrice;
	}

	public void setEmsPrice(String emsPrice) {
		this.emsPrice = emsPrice;
	}

	public String getEmsIncrease() {
		return this.emsIncrease;
	}

	public void setEmsIncrease(String emsIncrease) {
		this.emsIncrease = emsIncrease;
	}

	public List<PostageMode> getPostageModes() {
		return this.postageModes;
	}

	public void setPostageModes(List<PostageMode> postageModes) {
		this.postageModes = postageModes;
	}

}
