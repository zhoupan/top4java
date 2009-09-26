package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.TradeRate;
import com.taobao.top.mapping.Converter;

public class TradeRateJsonParser implements TopParser<TradeRate> {

	public TradeRate parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, TradeRate.class);
	}

}
