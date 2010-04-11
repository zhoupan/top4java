package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonList;

/**
 * TaobaokeReport Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TaobaokeReport extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonList(list="taobaoke_report_members", name="taobaoke_report_member")
	private List<TaobaokeReportMember> taobaokeReportMembers;

	public List<TaobaokeReportMember> getTaobaokeReportMembers() {
		return this.taobaokeReportMembers;
	}
	public void setTaobaokeReportMembers(List<TaobaokeReportMember> taobaokeReportMembers) {
		this.taobaokeReportMembers = taobaokeReportMembers;
	}

}
