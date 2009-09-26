package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.Area;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class AreaListJsonParser implements TopParser<ResponseList<Area>> {

	public ResponseList<Area> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, Area.class);
	}

}
