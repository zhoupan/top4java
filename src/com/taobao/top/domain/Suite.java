package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;

/**
 * Suite Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("suite")
@JsonListClass("suites")
public class Suite extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("end_date")
	private String endDate;

	@JsonField("id")
	private Long id;

	@JsonField("nick")
	private String nick;

	@JsonField("start_date")
	private String startDate;

	@JsonField("suite_name")
	private String suiteName;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getSuiteName() {
		return this.suiteName;
	}
	public void setSuiteName(String suiteName) {
		this.suiteName = suiteName;
	}

}
