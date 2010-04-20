package com.taobao.top.domain;

import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListClass;

/**
 * Suite Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("suite")
@ApiListClass("suites")
public class Suite extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("end_date")
	private String endDate;

	@ApiField("id")
	private Long id;

	@ApiField("nick")
	private String nick;

	@ApiField("start_date")
	private String startDate;

	@ApiField("suite_name")
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
