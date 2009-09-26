package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.Item;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class ItemListJsonParser implements TopParser<ResponseList<Item>> {

	public ResponseList<Item> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, Item.class);
	}

}
