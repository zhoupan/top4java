package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonProperty;

/**
 * AuthorizeMessage Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class AuthorizeMessage extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("end_date")
	private String endDate;

	@JsonProperty("nick")
	private String nick;

	@JsonProperty("status")
	private String status;

	@JsonProperty("created")
	private Date created;

	@JsonProperty("app_key")
	private String appKey;

	@JsonProperty("start_date")
	private String startDate;

	@JsonProperty("modified")
	private Date modified;

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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

}
