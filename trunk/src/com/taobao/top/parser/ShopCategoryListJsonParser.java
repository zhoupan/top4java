package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.ShopCategory;
import com.taobao.top.mapping.Converter;

public class ShopCategoryListJsonParser implements TopParser<ResponseList<ShopCategory>> {

	public ResponseList<ShopCategory> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, ShopCategory.class);
	}

}
