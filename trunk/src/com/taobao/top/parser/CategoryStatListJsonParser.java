package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.CategoryStat;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class CategoryStatListJsonParser implements TopParser<ResponseList<CategoryStat>> {

	public ResponseList<CategoryStat> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, CategoryStat.class);
	}

}
