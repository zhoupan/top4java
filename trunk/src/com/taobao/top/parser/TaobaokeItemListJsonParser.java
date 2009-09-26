package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.TaobaokeItem;
import com.taobao.top.mapping.Converter;

public class TaobaokeItemListJsonParser implements TopParser<ResponseList<TaobaokeItem>> {

	public ResponseList<TaobaokeItem> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, TaobaokeItem.class);
	}

}
