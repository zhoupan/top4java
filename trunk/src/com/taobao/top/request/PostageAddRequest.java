package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.postage.add
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class PostageAddRequest implements TopRequest {

	/** 邮费模板名称 */
	private String name;

	/** 邮费模板备注 */
	private String memo;

	/** 平邮费用 */
	private String postPrice;

	/** 平邮加件费用 */
	private String postIncrease;

	/** 快递费用 */
	private String expressPrice;

	/** 快递加件费用 */
	private String expressIncrease;

	/** EMS费用 */
	private String emsPrice;

	/** EMS加件费用 */
	private String emsIncrease;

	/** 运费方式 */
	private String postageModeType;

	/** 目的地值 */
	private String postageModeDest;

	/** 运费方式单价数量串 */
	private String postageModePrice;

	/** 运费方式加件费用数量串 */
	private String postageModeIncrease;

	public void setName(String name) {
		this.name = name;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public void setPostPrice(String postPrice) {
		this.postPrice = postPrice;
	}

	public void setPostIncrease(String postIncrease) {
		this.postIncrease = postIncrease;
	}

	public void setExpressPrice(String expressPrice) {
		this.expressPrice = expressPrice;
	}

	public void setExpressIncrease(String expressIncrease) {
		this.expressIncrease = expressIncrease;
	}

	public void setEmsPrice(String emsPrice) {
		this.emsPrice = emsPrice;
	}

	public void setEmsIncrease(String emsIncrease) {
		this.emsIncrease = emsIncrease;
	}

	public void setPostageModeType(String postageModeType) {
		this.postageModeType = postageModeType;
	}

	public void setPostageModeDest(String postageModeDest) {
		this.postageModeDest = postageModeDest;
	}

	public void setPostageModePrice(String postageModePrice) {
		this.postageModePrice = postageModePrice;
	}

	public void setPostageModeIncrease(String postageModeIncrease) {
		this.postageModeIncrease = postageModeIncrease;
	}

	public String getApiName() {
		return "taobao.postage.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("name", this.name);
		params.put("memo", this.memo);
		params.put("post_price", this.postPrice);
		params.put("post_increase", this.postIncrease);
		params.put("express_price", this.expressPrice);
		params.put("express_increase", this.expressIncrease);
		params.put("ems_price", this.emsPrice);
		params.put("ems_increase", this.emsIncrease);
		params.put("postage_mode.type", this.postageModeType);
		params.put("postage_mode.dest", this.postageModeDest);
		params.put("postage_mode.price", this.postageModePrice);
		params.put("postage_mode.increase", this.postageModeIncrease);

		return params;
	}

}
