package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.TaobaokeShop;
import com.taobao.top.mapping.Converter;

public class TaobaokeShopListJsonParser implements TopParser<ResponseList<TaobaokeShop>> {

	public ResponseList<TaobaokeShop> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, TaobaokeShop.class);
	}

}
