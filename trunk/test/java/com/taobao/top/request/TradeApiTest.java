package com.taobao.top.request;

import junit.framework.Assert;

import org.junit.Test;

import com.taobao.top.TopClient;
import com.taobao.top.TopJsonRestClient;
import com.taobao.top.domain.PageList;
import com.taobao.top.domain.Trade;
import com.taobao.top.domain.TradeRate;
import com.taobao.top.parser.json.ListJsonParser;
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
	public void getSoldTrades() {
		TradesSoldGetRequest req = new TradesSoldGetRequest();
		req.setFields("tid,seller_nick,buyer_nick,orders.oid,orders.iid,orders.title,orders.price");
		req.setPageSize(2);
		PageList<Trade> rsp = client.tradesSoldGet(req);
		Assert.assertEquals(2, rsp.getReturnResults());
	}

	@Test
	public void getBoughtTrades() {
		TopClient topClient = TestUtils.getPrivateClient();
		TradesBoughtGetRequest req = new TradesBoughtGetRequest();
		req.setFields("tid,seller_nick,buyer_nick,orders.oid,orders.iid,orders.title,orders.price");
		TopRequestProxy proxy = new TopRequestProxy(req, "tbtest1063");
		PageList<Trade> rsp = topClient.execute(proxy, new ListJsonParser<Trade>(Trade.class));
		Assert.assertTrue(rsp.getTotalResults() > 0L);
	}

	@Test
	public void getTradeRates() {
		TraderatesGetRequest req = new TraderatesGetRequest();
		req.setFields("tid,role,nick,result,created,rated_nick,item_title,item_price,content,reply");
		req.setRole("buyer");
		req.setRateType("get");
		req.setResult("good");
		req.setPageNo(1);
		req.setPageSize(40);
		PageList<TradeRate> rsp = client.traderatesGet(req);
		System.out.println(rsp.getTotalResults());
		System.out.println(rsp.getReturnResults());
	}

}
