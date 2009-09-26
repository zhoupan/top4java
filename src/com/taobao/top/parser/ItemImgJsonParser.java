package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ItemImg;
import com.taobao.top.mapping.Converter;

public class ItemImgJsonParser implements TopParser<ItemImg> {

	public ItemImg parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, ItemImg.class);
	}

}
