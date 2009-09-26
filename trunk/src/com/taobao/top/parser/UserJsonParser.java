package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.User;
import com.taobao.top.mapping.Converter;

public class UserJsonParser implements TopParser<User> {

	public User parse(String rsp) throws TopException {
		return Converter.toResponse(rsp, User.class);
	}

}
