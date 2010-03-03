package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 淘宝客报表。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("taobaokeReports")
public class TaobaokeReport extends BaseObject {

	private static final long serialVersionUID = 6051941235416084047L;

	/** 淘宝客报表成员列表 */
	@JsonProperty("members")
	private List<TaobaokeReportMember> members;

	public List<TaobaokeReportMember> getMembers() {
		return this.members;
	}

	public void setMembers(List<TaobaokeReportMember> members) {
		this.members = members;
	}

}
