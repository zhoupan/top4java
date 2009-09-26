package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.Refund;
import com.taobao.top.mapping.Converter;

public class RefundJsonParser implements TopParser<Refund> {

	public Refund parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, Refund.class);
	}

}
