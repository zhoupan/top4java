package com.taobao.top.request;

import org.junit.Test;

import com.taobao.top.TopJsonRestClient;
import com.taobao.top.util.TestUtils;

/**
 * 交易接口测试。
 * 
 * @author fengsheng
 * @since 1.0, Apr 12, 2010
 */
public class TradeApiTest {

	@Test
	public void getTrades() {
		TradesSoldGetRequest req = new TradesSoldGetRequest();
		req.setFields("tid,seller_nick,buyer_nick,orders");
		req.setPageSize(2);
		TopJsonRestClient client = TestUtils.getOnlineJsonClient();
		String rsp = client.getResponse(req);
		System.out.println(rsp);
	}

}
