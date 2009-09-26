package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.TaobaokeItem;
import com.taobao.top.mapping.Converter;

public class TaobaokeListUrlJsonParser implements TopParser<String> {

	public String parse(String rsp) throws TopException {
		TaobaokeItem item = Converter.toResponse(rsp, TaobaokeItem.class);
		return item.getPromotionUrl();
	}

}
