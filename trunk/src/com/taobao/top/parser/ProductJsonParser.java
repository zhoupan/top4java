package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.Product;
import com.taobao.top.mapping.Converter;

public class ProductJsonParser implements TopParser<Product> {

	public Product parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, Product.class);
	}

}
