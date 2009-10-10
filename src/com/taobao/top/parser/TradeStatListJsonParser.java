package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.TradeStat;
import com.taobao.top.mapping.Converter;

public class TradeStatListJsonParser implements TopParser<ResponseList<TradeStat>> {

	public ResponseList<TradeStat> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, TradeStat.class);
	}

}
