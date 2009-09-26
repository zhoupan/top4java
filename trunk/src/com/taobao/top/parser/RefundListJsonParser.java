package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.Refund;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class RefundListJsonParser implements TopParser<ResponseList<Refund>> {

	public ResponseList<Refund> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, Refund.class);
	}

}
