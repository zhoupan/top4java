package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.SellerItemCat;
import com.taobao.top.mapping.Converter;

public class SellerItemCatListJsonParser implements TopParser<ResponseList<SellerItemCat>> {

	public ResponseList<SellerItemCat> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, SellerItemCat.class);
	}

}
