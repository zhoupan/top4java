package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.SellerItemCategory;
import com.taobao.top.mapping.Converter;

public class SellerItemCategoryListJsonParser implements TopParser<ResponseList<SellerItemCategory>> {

	public ResponseList<SellerItemCategory> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, SellerItemCategory.class);
	}

}
