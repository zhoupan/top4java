package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.Postage;
import com.taobao.top.mapping.Converter;

public class PostageJsonParser implements TopParser<Postage> {

	public Postage parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, Postage.class);
	}

}
