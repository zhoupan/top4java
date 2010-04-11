package com.taobao.top.domain;

import java.util.List;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListField;

/**
 * TaobaokeReport Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("taobaoke_report")
public class TaobaokeReport extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("taobaoke_report_member")
	@JsonListField("taobaoke_report_members")
	private List<TaobaokeReportMember> taobaokeReportMembers;

	public List<TaobaokeReportMember> getTaobaokeReportMembers() {
		return this.taobaokeReportMembers;
	}
	public void setTaobaokeReportMembers(List<TaobaokeReportMember> taobaokeReportMembers) {
		this.taobaokeReportMembers = taobaokeReportMembers;
	}

}
