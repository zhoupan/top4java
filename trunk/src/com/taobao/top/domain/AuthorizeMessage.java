package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListClass;

/**
 * AuthorizeMessage Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("authorize_message")
@ApiListClass("authorize_messages")
public class AuthorizeMessage extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("app_key")
	private String appKey;

	@ApiField("created")
	private Date created;

	@ApiField("end_date")
	private String endDate;

	@ApiField("modified")
	private Date modified;

	@ApiField("nick")
	private String nick;

	@ApiField("start_date")
	private String startDate;

	@ApiField("status")
	private String status;

	@ApiField("valid")
	private Boolean valid;

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getValid() {
		return this.valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

}
