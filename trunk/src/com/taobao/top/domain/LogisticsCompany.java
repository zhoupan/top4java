package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 物流公司。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("logistic_companies")
public class LogisticsCompany extends BaseObject {

	/** 物流公司标识 */
	@JsonProperty("company_id")
	private Long companyId;

	/** 物流公司代码 */
	@JsonProperty("company_code")
	private String companyCode;

	/** 物流公司简称 */
	@JsonProperty("company_name")
	private String companyName;

	public Long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
