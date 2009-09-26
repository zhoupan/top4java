package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.RefundMessage;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class RefundMessageListJsonParser implements TopParser<ResponseList<RefundMessage>> {

	public ResponseList<RefundMessage> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, RefundMessage.class);
	}

}
