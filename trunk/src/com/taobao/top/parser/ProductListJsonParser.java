package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.Product;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class ProductListJsonParser implements TopParser<ResponseList<Product>> {

	public ResponseList<Product> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, Product.class);
	}

}
