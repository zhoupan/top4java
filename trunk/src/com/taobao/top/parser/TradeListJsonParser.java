package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.Trade;
import com.taobao.top.mapping.Converter;

public class TradeListJsonParser implements TopParser<ResponseList<Trade>> {

	public ResponseList<Trade> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, Trade.class);
	}

}
