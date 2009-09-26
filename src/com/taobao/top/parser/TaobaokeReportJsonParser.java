package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.TaobaokeReport;
import com.taobao.top.mapping.Converter;

public class TaobaokeReportJsonParser implements TopParser<TaobaokeReport> {

	public TaobaokeReport parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, TaobaokeReport.class);
	}

}
