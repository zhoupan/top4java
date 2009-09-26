package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.LogisticsCompany;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class LogisticsCompanyListJsonParser implements TopParser<ResponseList<LogisticsCompany>> {

	public ResponseList<LogisticsCompany> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, LogisticsCompany.class);
	}

}
