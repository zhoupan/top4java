package com.taobao.top.request;

import junit.framework.Assert;

import org.junit.Test;

import com.taobao.top.TopException;
import com.taobao.top.TopJsonRestClient;
import com.taobao.top.domain.User;
import com.taobao.top.util.TestUtils;

/**
 * 用户接口测试。
 * 
 * @author fengsheng
 * @since 1.0, Apr 12, 2010
 */
public class UserApiTest {

	private TopJsonRestClient client = TestUtils.getOnlineJsonClient();

	@Test
	public void getUser() {
		UserGetRequest req = new UserGetRequest();
		req.setFields("nick,location,seller_credit,buyer_credit,last_visit,created");
		req.setNick("hz0799");
		User user = client.userGet(req);
		Assert.assertEquals("hz0799", user.getNick());
	}

	@Test
	public void getInvalidUser() {
		UserGetRequest req = new UserGetRequest();
		req.setFields("nick,location,seller_credit,buyer_credit,last_visit");
		req.setNick("abc#$%");
		try {
			client.userGet(req);
		} catch (TopException e) {
			Assert.assertEquals("user-not-exist", e.getErrCode());
		}
	}

}
