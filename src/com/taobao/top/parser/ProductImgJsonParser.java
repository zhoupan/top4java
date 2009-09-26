package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ProductImg;
import com.taobao.top.mapping.Converter;

public class ProductImgJsonParser implements TopParser<ProductImg> {

	public ProductImg parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, ProductImg.class);
	}

}
