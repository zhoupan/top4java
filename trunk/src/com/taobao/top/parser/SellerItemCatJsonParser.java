package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.SellerItemCat;
import com.taobao.top.mapping.Converter;

public class SellerItemCatJsonParser implements TopParser<SellerItemCat> {

	public SellerItemCat parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, SellerItemCat.class);
	}

}
