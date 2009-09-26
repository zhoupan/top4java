package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ItemSearch;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class ItemSearchListJsonParser implements TopParser<ResponseList<ItemSearch>> {

	public ResponseList<ItemSearch> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, ItemSearch.class);
	}

}
