package com.taobao.top.request;

import junit.framework.Assert;

import org.junit.Test;

import com.taobao.top.TopJsonRestClient;
import com.taobao.top.domain.PageList;
import com.taobao.top.domain.Trade;
import com.taobao.top.util.TestUtils;

/**
 * 交易接口测试。
 * 
 * @author fengsheng
 * @since 1.0, Apr 12, 2010
 */
public class TradeApiTest {

	private TopJsonRestClient client = TestUtils.getOnlineJsonClient();

	@Test
	public void getTrades() {
		TradesSoldGetRequest req = new TradesSoldGetRequest();
		req.setFields("tid,seller_nick,buyer_nick,orders.oid,orders.iid,orders.title,orders.price");
		req.setPageSize(2);
		PageList<Trade> rsp = client.tradesSoldGet(req);
		Assert.assertEquals(2, rsp.getReturnResults());
	}

}
