package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.Sku;
import com.taobao.top.mapping.Converter;

public class SkuListJsonParser implements TopParser<ResponseList<Sku>> {

	public ResponseList<Sku> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, Sku.class);
	}

}
