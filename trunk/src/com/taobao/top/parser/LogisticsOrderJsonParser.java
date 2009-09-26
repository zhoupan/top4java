package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.LogisticsOrder;
import com.taobao.top.mapping.Converter;

public class LogisticsOrderJsonParser implements TopParser<LogisticsOrder> {

	public LogisticsOrder parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, LogisticsOrder.class);
	}

}
