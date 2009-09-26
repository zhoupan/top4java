package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.Postage;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class PostageListJsonParser implements TopParser<ResponseList<Postage>> {

	public ResponseList<Postage> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, Postage.class);
	}

}
