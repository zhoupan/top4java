package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.LogisticsOrder;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class LogisticsOrderListJsonParser implements TopParser<ResponseList<LogisticsOrder>> {

	public ResponseList<LogisticsOrder> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, LogisticsOrder.class);
	}

}
