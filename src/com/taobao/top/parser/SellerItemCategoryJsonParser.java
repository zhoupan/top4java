package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.SellerItemCategory;
import com.taobao.top.mapping.Converter;

public class SellerItemCategoryJsonParser implements TopParser<SellerItemCategory> {

	public SellerItemCategory parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, SellerItemCategory.class);
	}

}
