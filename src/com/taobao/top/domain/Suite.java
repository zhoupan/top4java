package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * Suite Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class Suite extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private Long id;

	@JsonProperty("end_date")
	private String endDate;

	@JsonProperty("nick")
	private String nick;

	@JsonProperty("suite_name")
	private String suiteName;

	@JsonProperty("start_date")
	private String startDate;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getSuiteName() {
		return this.suiteName;
	}
	public void setSuiteName(String suiteName) {
		this.suiteName = suiteName;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
