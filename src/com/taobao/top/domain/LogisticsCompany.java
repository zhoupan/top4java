package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * LogisticsCompany Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class LogisticsCompany extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("code")
	private String code;

	@JsonProperty("id")
	private Long id;

	@JsonProperty("name")
	private String name;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
