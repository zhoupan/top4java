package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.Shop;
import com.taobao.top.mapping.Converter;

public class ShopJsonParser implements TopParser<Shop> {

	public Shop parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, Shop.class);
	}

}
