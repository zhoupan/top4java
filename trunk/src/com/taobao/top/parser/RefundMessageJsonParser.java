package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.RefundMessage;
import com.taobao.top.mapping.Converter;

public class RefundMessageJsonParser implements TopParser<RefundMessage> {

	public RefundMessage parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, RefundMessage.class);
	}

}
