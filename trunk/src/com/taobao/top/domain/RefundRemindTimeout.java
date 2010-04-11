package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;

/**
 * RefundRemindTimeout Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("refund_remind_timeout")
public class RefundRemindTimeout extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("exist_timeout")
	private Boolean existTimeout;

	@JsonField("remind_type")
	private Integer remindType;

	@JsonField("timeout")
	private String timeout;

	public Boolean getExistTimeout() {
		return this.existTimeout;
	}
	public void setExistTimeout(Boolean existTimeout) {
		this.existTimeout = existTimeout;
	}

	public Integer getRemindType() {
		return this.remindType;
	}
	public void setRemindType(Integer remindType) {
		this.remindType = remindType;
	}

	public String getTimeout() {
		return this.timeout;
	}
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

}
