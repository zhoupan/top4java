package com.taobao.top.domain;

/**
 * 用户地址。
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class Location extends BaseObject {

	/** 详细地址 */
	private String address;

	/** 国家名称 */
	private String country;

	/** 所在省份 */
	private String state;

	/** 所在城市 */
	private String city;

	/** 区/县 */
	private String district;

	/** 邮政编码 */
	private String zip;

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
