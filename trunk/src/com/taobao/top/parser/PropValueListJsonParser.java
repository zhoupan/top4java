package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.PropValue;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class PropValueListJsonParser implements TopParser<ResponseList<PropValue>> {

	public ResponseList<PropValue> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, PropValue.class);
	}

}
