package com.taobao.top.request;

import org.junit.Test;

import com.taobao.top.TopClient;
import com.taobao.top.TopException;
import com.taobao.top.parser.StringParser;
import com.taobao.top.util.TestUtils;

public class UserApiTest {

	@Test
	public void getUserByJson() throws TopException {
		TopClient client = TestUtils.getTestClient("json");
		UserGetRequest req = new UserGetRequest();
		req.setFields("user_id,nick,sex,created,location");
		req.setNick("tbtest520");
		String rsp = client.execute(req, new StringParser());
		System.out.println(rsp);
	}

}
