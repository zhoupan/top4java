package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.DeliveryAddress;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class DeliveryAddressListJsonParser implements TopParser<ResponseList<DeliveryAddress>> {

	public ResponseList<DeliveryAddress> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, DeliveryAddress.class);
	}

}
