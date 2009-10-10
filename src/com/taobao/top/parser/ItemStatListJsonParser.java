package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ItemStat;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class ItemStatListJsonParser implements TopParser<ResponseList<ItemStat>> {

	public ResponseList<ItemStat> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, ItemStat.class);
	}

}
