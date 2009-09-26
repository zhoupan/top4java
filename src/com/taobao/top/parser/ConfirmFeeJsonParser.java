package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ConfirmFee;
import com.taobao.top.mapping.Converter;

public class ConfirmFeeJsonParser implements TopParser<ConfirmFee> {

	public ConfirmFee parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, ConfirmFee.class);
	}

}
