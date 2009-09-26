package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.TradeRate;
import com.taobao.top.mapping.Converter;

public class TradeRateListJsonParser implements TopParser<ResponseList<TradeRate>> {

	public ResponseList<TradeRate> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, TradeRate.class);
	}

}
