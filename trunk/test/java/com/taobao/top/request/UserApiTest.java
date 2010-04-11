package com.taobao.top.request;

import org.junit.Test;

import com.taobao.top.TopClient;
import com.taobao.top.domain.User;
import com.taobao.top.parser.json.ObjectJsonParser;
import com.taobao.top.util.TestUtils;

public class UserApiTest {

	@Test
	public void getUser() {
		UserGetRequest req = new UserGetRequest();
		req.setFields("nick,location,seller_credit,buyer_credit,last_visit");
		req.setNick("hz0799");
		TopClient client = TestUtils.getOnlineClient();
		User user = client.execute(req, new ObjectJsonParser<User>(User.class));
		System.out.println(user.getNick());
	}

}
