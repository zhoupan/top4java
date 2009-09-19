package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 地址信息。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class Location extends BaseObject {

	/** 邮政编码 */
	@JsonProperty("zip")
	private String zip;

	/** 详细地址 */
	@JsonProperty("address")
	private String address;

	/** 所在城市 */
	@JsonProperty("city")
	private String city;

	/** 所在省份 */
	@JsonProperty("state")
	private String state;

	/** 国家名称 */
	@JsonProperty("country")
	private String country;

	/** 区/县 */
	@JsonProperty("district")
	private String district;

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

}
