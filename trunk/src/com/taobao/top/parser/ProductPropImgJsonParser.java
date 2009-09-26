package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ProductPropImg;
import com.taobao.top.mapping.Converter;

public class ProductPropImgJsonParser implements TopParser<ProductPropImg> {

	public ProductPropImg parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, ProductPropImg.class);
	}

}
