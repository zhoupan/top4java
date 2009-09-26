package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ItemProp;
import com.taobao.top.mapping.Converter;

public class ItemPropJsonParser implements TopParser<ItemProp> {

	public ItemProp parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, ItemProp.class);
	}

}
