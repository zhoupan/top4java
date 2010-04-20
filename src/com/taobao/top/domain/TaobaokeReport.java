package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListField;

/**
 * TaobaokeReport Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("taobaoke_report")
public class TaobaokeReport extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("taobaoke_report_member")
	@ApiListField("taobaoke_report_members")
	private List<TaobaokeReportMember> taobaokeReportMembers;

	public List<TaobaokeReportMember> getTaobaokeReportMembers() {
		return this.taobaokeReportMembers;
	}
	public void setTaobaokeReportMembers(List<TaobaokeReportMember> taobaokeReportMembers) {
		this.taobaokeReportMembers = taobaokeReportMembers;
	}

}
