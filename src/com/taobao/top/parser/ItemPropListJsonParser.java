package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ItemProp;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class ItemPropListJsonParser implements TopParser<ResponseList<ItemProp>> {

	public ResponseList<ItemProp> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, ItemProp.class);
	}

}
