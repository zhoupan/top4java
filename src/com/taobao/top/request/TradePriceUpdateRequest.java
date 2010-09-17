package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.price.update
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradePriceUpdateRequest implements TopRequest {

	private Boolean $isAts;
	private String adjustFees;
	private String certSign;
	private String logisticsFee;
	private String oids;
	private String originFees;
	private Long tid;

	public void set$isAts(Boolean $isAts) {
		this.$isAts = $isAts;
	}
	public void setAdjustFees(String adjustFees) {
		this.adjustFees = adjustFees;
	}
	public void setCertSign(String certSign) {
		this.certSign = certSign;
	}
	public void setLogisticsFee(String logisticsFee) {
		this.logisticsFee = logisticsFee;
	}
	public void setOids(String oids) {
		this.oids = oids;
	}
	public void setOriginFees(String originFees) {
		this.originFees = originFees;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getApiName() {
		return "taobao.trade.price.update";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("$is_ats", this.$isAts);
		params.put("adjust_fees", this.adjustFees);
		params.put("cert_sign", this.certSign);
		params.put("logistics_fee", this.logisticsFee);
		params.put("oids", this.oids);
		params.put("origin_fees", this.originFees);
		params.put("tid", this.tid);
		return params;
	}

}
