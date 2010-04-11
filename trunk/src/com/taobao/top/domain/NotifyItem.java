package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;

/**
 * NotifyItem Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("notify_item")
@JsonListClass("notify_items")
public class NotifyItem extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("changed_fields")
	private String changedFields;

	@JsonField("iid")
	private String iid;

	@JsonField("modified")
	private Date modified;

	@JsonField("nick")
	private String nick;

	@JsonField("num")
	private Integer num;

	@JsonField("num_iid")
	private Long numIid;

	@JsonField("price")
	private String price;

	@JsonField("status")
	private String status;

	@JsonField("title")
	private String title;

	public String getChangedFields() {
		return this.changedFields;
	}
	public void setChangedFields(String changedFields) {
		this.changedFields = changedFields;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
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

	public Integer getNum() {
		return this.num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
