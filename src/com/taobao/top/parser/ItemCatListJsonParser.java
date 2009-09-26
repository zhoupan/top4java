package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ItemCategory;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class ItemCatListJsonParser implements TopParser<ResponseList<ItemCategory>> {

	public ResponseList<ItemCategory> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, ItemCategory.class);
	}

}
