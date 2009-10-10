package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.ShopCat;
import com.taobao.top.mapping.Converter;

public class ShopCatListJsonParser implements TopParser<ResponseList<ShopCat>> {

	public ResponseList<ShopCat> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, ShopCat.class);
	}

}
