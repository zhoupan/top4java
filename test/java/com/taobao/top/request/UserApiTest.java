package com.taobao.top.request;

import junit.framework.Assert;

import org.junit.Test;

import com.taobao.top.TopClient;
import com.taobao.top.TopException;
import com.taobao.top.domain.User;
import com.taobao.top.parser.json.SingleJsonParser;
import com.taobao.top.util.TestUtils;

/**
 * 用户接口测试。
 * 
 * @author fengsheng
 * @since 1.0, Apr 12, 2010
 */
public class UserApiTest {

	@Test
	public void getUser() {
		UserGetRequest req = new UserGetRequest();
		req.setFields("nick,location,seller_credit,buyer_credit,last_visit");
		req.setNick("hz0799");
		TopClient client = TestUtils.getOnlineClient();
		User user = client.execute(req, new SingleJsonParser<User>(User.class));
		Assert.assertEquals("hz0799", user.getNick());
	}

	@Test
	public void getInvalidUser() {
		UserGetRequest req = new UserGetRequest();
		req.setFields("nick,location,seller_credit,buyer_credit,last_visit");
		req.setNick("abc#$%");
		TopClient client = TestUtils.getOnlineClient();
		try {
			client.execute(req, new SingleJsonParser<User>(User.class));
		} catch (TopException e) {
			Assert.assertEquals("user-not-exist", e.getErrCode());
		}
	}

}
