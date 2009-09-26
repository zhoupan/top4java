package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.PropImg;
import com.taobao.top.mapping.Converter;

public class PropImgJsonParser implements TopParser<PropImg> {

	public PropImg parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, PropImg.class);
	}

}
