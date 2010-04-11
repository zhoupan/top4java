package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonProperty;

/**
 * NotifyItem Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class NotifyItem extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("num")
	private Integer num;

	@JsonProperty("title")
	private String title;

	@JsonProperty("price")
	private String price;

	@JsonProperty("nick")
	private String nick;

	@JsonProperty("status")
	private String status;

	@JsonProperty("iid")
	private String iid;

	@JsonProperty("changed_fields")
	private String changedFields;

	@JsonProperty("num_iid")
	private Long numIid;

	@JsonProperty("modified")
	private Date modified;

	public Integer getNum() {
		return this.num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
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

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getChangedFields() {
		return this.changedFields;
	}
	public void setChangedFields(String changedFields) {
		this.changedFields = changedFields;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

}
