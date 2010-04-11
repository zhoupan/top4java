package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * Location Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class Location extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("state")
	private String state;

	@JsonProperty("city")
	private String city;

	@JsonProperty("zip")
	private String zip;

	@JsonProperty("address")
	private String address;

	@JsonProperty("district")
	private String district;

	@JsonProperty("country")
	private String country;

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

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
