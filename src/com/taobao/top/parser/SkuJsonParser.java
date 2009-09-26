package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.Sku;
import com.taobao.top.mapping.Converter;

public class SkuJsonParser implements TopParser<Sku> {

	public Sku parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, Sku.class);
	}

}
