package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.icp.id.submit
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class IcpIdSubmitRequest implements TopRequest {

	private String icpId;
	private String icpState;
	private String siteDomain;

	public void setIcpId(String icpId) {
		this.icpId = icpId;
	}
	public void setIcpState(String icpState) {
		this.icpState = icpState;
	}
	public void setSiteDomain(String siteDomain) {
		this.siteDomain = siteDomain;
	}

	public String getApiName() {
		return "taobao.icp.id.submit";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("icp_id", this.icpId);
		params.put("icp_state", this.icpState);
		params.put("site_domain", this.siteDomain);
		return params;
	}

}
