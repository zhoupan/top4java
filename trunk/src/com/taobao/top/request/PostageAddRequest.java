package com.taobao.top.request;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.taobao.top.domain.PostageMode;
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
	private List<PostageMode> postageModes;

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

	public void setPostageModes(List<PostageMode> postageModes) {
		this.postageModes = postageModes;
	}

	public void addPostageMode(PostageMode postageMode) {
		if (this.postageModes == null) {
			this.postageModes = new ArrayList<PostageMode>();
		}
		this.postageModes.add(postageMode);
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

		if (this.postageModes != null) {
			StringBuilder types = new StringBuilder();
			StringBuilder dests = new StringBuilder();
			StringBuilder prices = new StringBuilder();
			StringBuilder increases = new StringBuilder();

			boolean hasPostageMode = false;
			for (PostageMode postageMode : postageModes) {
				if (hasPostageMode) {
					types.append(";");
					dests.append(";");
					prices.append(";");
					increases.append(";");
				} else {
					hasPostageMode = true;
				}
				types.append(postageMode.getType());
				dests.append(postageMode.getDests());
				prices.append(postageMode.getPrice());
				increases.append(postageMode.getIncrease());
			}

			params.put("postage_mode_types", types);
			params.put("postage_mode_dests", dests);
			params.put("postage_mode_prices", prices);
			params.put("postage_mode_increases", increases);
		}

		return params;
	}

}
