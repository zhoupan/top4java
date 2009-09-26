package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.Item;
import com.taobao.top.mapping.Converter;

public class ItemJsonParser implements TopParser<Item> {

	public Item parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, Item.class);
	}

}
