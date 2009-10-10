package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ItemCat;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class ItemCatListJsonParser implements TopParser<ResponseList<ItemCat>> {

	public ResponseList<ItemCat> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, ItemCat.class);
	}

}
