package com.taobao.top;

import com.taobao.top.domain.PageList;
import com.taobao.top.domain.User;
import com.taobao.top.parser.StringParser;
import com.taobao.top.parser.json.SingleJsonParser;
import com.taobao.top.parser.json.ListJsonParser;
import com.taobao.top.request.TopRequest;
import com.taobao.top.request.UserGetRequest;
import com.taobao.top.request.UsersGetRequest;

/**
 * TOP基于REST的JSON客户端帮助类。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TopJsonRestClient {

	private TopClient client;

	public TopJsonRestClient(String topUrl, String appKey, String appSecret) {
		client = new TopRestClient(topUrl, appKey, appSecret, Constants.FORMAT_JSON);
	}

	/** All PUBLIC TOP APIs **/
	public String getResponse(TopRequest request) throws TopException {
		return client.execute(request, new StringParser());
	}

	/** All PRIVATE TOP APIs **/
	public String getResponse(TopRequest request, String session) throws TopException {
		return client.execute(request, new StringParser(), session);
	}

	public User userGet(UserGetRequest request) {
		return client.execute(request, new SingleJsonParser<User>(User.class));
	}

	public PageList<User> usersGet(UsersGetRequest request) {
		return client.execute(request, new ListJsonParser<User>(User.class));
	}

}
