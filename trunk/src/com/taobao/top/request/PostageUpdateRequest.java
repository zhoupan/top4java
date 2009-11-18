package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.domain.PostageMode;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.postage.update
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class PostageUpdateRequest implements TopRequest {

	/** 邮费模板名称 */
	private String name;

	/** 邮费模板备注 */
	private String memo;

	/** 邮费模板编号 */
	private Long postageId;

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
	private PostageMode postageMode;

	public void setName(String name) {
		this.name = name;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public void setPostageId(Long postageId) {
		this.postageId = postageId;
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

	public void setPostageMode(PostageMode postageMode) {
		this.postageMode = postageMode;
	}

	public String getApiName() {
		return "taobao.postage.update";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("name", this.name);
		params.put("memo", this.memo);
		params.put("postage_id", this.postageId);
		params.put("post_price", this.postPrice);
		params.put("post_increase", this.postIncrease);
		params.put("express_price", this.expressPrice);
		params.put("express_increase", this.expressIncrease);
		params.put("ems_price", this.emsPrice);
		params.put("ems_increase", this.emsIncrease);
		if (this.postageMode != null) {
			params.put("postage_mode.id", this.postageMode.getId());
			params.put("postage_mode.type", this.postageMode.getType());
			params.put("postage_mode.dest", this.postageMode.getDests());
			params.put("postage_mode.price", this.postageMode.getPrice());
			params.put("postage_mode.increase", this.postageMode.getIncrease());
		}

		return params;
	}

}
