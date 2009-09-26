package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.Trade;
import com.taobao.top.mapping.Converter;

public class TradeJsonParser implements TopParser<Trade> {

	public Trade parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, Trade.class);
	}

}
