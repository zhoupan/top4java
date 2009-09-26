package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.User;
import com.taobao.top.mapping.Converter;

public class UserListJsonParser implements TopParser<ResponseList<User>> {

	public ResponseList<User> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, User.class);
	}

}
