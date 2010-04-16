package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.icp.submit
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class IcpSubmitRequest implements TopRequest {

	private String companyAddress;
	private String companyCertNo;
	private Integer companyCertType;
	private Integer companyCity;
	private Integer companyDistrict;
	private Integer companyKind;
	private String companyMasterCertNo;
	private Integer companyMasterCertType;
	private String companyMasterEmail;
	private String companyMasterMobile;
	private String companyMasterName;
	private String companyMasterPhone;
	private String companyMasterUnicom;
	private String companyName;
	private Integer companyState;
	private String companySuperior;
	private String siteDomain;
	private String siteHomePage;
	private String siteIp;
	private String siteMasterCertNo;
	private Integer siteMasterCertType;
	private String siteMasterEmail;
	private String siteMasterMobile;
	private String siteMasterName;
	private String siteMasterPhone;
	private String siteMasterUnicom;
	private String siteName;

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public void setCompanyCertNo(String companyCertNo) {
		this.companyCertNo = companyCertNo;
	}
	public void setCompanyCertType(Integer companyCertType) {
		this.companyCertType = companyCertType;
	}
	public void setCompanyCity(Integer companyCity) {
		this.companyCity = companyCity;
	}
	public void setCompanyDistrict(Integer companyDistrict) {
		this.companyDistrict = companyDistrict;
	}
	public void setCompanyKind(Integer companyKind) {
		this.companyKind = companyKind;
	}
	public void setCompanyMasterCertNo(String companyMasterCertNo) {
		this.companyMasterCertNo = companyMasterCertNo;
	}
	public void setCompanyMasterCertType(Integer companyMasterCertType) {
		this.companyMasterCertType = companyMasterCertType;
	}
	public void setCompanyMasterEmail(String companyMasterEmail) {
		this.companyMasterEmail = companyMasterEmail;
	}
	public void setCompanyMasterMobile(String companyMasterMobile) {
		this.companyMasterMobile = companyMasterMobile;
	}
	public void setCompanyMasterName(String companyMasterName) {
		this.companyMasterName = companyMasterName;
	}
	public void setCompanyMasterPhone(String companyMasterPhone) {
		this.companyMasterPhone = companyMasterPhone;
	}
	public void setCompanyMasterUnicom(String companyMasterUnicom) {
		this.companyMasterUnicom = companyMasterUnicom;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setCompanyState(Integer companyState) {
		this.companyState = companyState;
	}
	public void setCompanySuperior(String companySuperior) {
		this.companySuperior = companySuperior;
	}
	public void setSiteDomain(String siteDomain) {
		this.siteDomain = siteDomain;
	}
	public void setSiteHomePage(String siteHomePage) {
		this.siteHomePage = siteHomePage;
	}
	public void setSiteIp(String siteIp) {
		this.siteIp = siteIp;
	}
	public void setSiteMasterCertNo(String siteMasterCertNo) {
		this.siteMasterCertNo = siteMasterCertNo;
	}
	public void setSiteMasterCertType(Integer siteMasterCertType) {
		this.siteMasterCertType = siteMasterCertType;
	}
	public void setSiteMasterEmail(String siteMasterEmail) {
		this.siteMasterEmail = siteMasterEmail;
	}
	public void setSiteMasterMobile(String siteMasterMobile) {
		this.siteMasterMobile = siteMasterMobile;
	}
	public void setSiteMasterName(String siteMasterName) {
		this.siteMasterName = siteMasterName;
	}
	public void setSiteMasterPhone(String siteMasterPhone) {
		this.siteMasterPhone = siteMasterPhone;
	}
	public void setSiteMasterUnicom(String siteMasterUnicom) {
		this.siteMasterUnicom = siteMasterUnicom;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getApiName() {
		return "taobao.icp.submit";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("company_address", this.companyAddress);
		params.put("company_cert_no", this.companyCertNo);
		params.put("company_cert_type", this.companyCertType);
		params.put("company_city", this.companyCity);
		params.put("company_district", this.companyDistrict);
		params.put("company_kind", this.companyKind);
		params.put("company_master_cert_no", this.companyMasterCertNo);
		params.put("company_master_cert_type", this.companyMasterCertType);
		params.put("company_master_email", this.companyMasterEmail);
		params.put("company_master_mobile", this.companyMasterMobile);
		params.put("company_master_name", this.companyMasterName);
		params.put("company_master_phone", this.companyMasterPhone);
		params.put("company_master_unicom", this.companyMasterUnicom);
		params.put("company_name", this.companyName);
		params.put("company_state", this.companyState);
		params.put("company_superior", this.companySuperior);
		params.put("site_domain", this.siteDomain);
		params.put("site_home_page", this.siteHomePage);
		params.put("site_ip", this.siteIp);
		params.put("site_master_cert_no", this.siteMasterCertNo);
		params.put("site_master_cert_type", this.siteMasterCertType);
		params.put("site_master_email", this.siteMasterEmail);
		params.put("site_master_mobile", this.siteMasterMobile);
		params.put("site_master_name", this.siteMasterName);
		params.put("site_master_phone", this.siteMasterPhone);
		params.put("site_master_unicom", this.siteMasterUnicom);
		params.put("site_name", this.siteName);
		return params;
	}

}
