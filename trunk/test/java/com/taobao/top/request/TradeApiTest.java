package com.taobao.top.request;

import org.junit.Test;

import com.taobao.top.TopClient;
import com.taobao.top.parser.StringParser;
import com.taobao.top.util.TestUtils;

/**
 * 交易接口测试类。
 * 
 * @author carver.gu
 * @since 1.0, Oct 10, 2009
 */
public class TradeApiTest {

	@Test
	public void getSoldTrades() {
		TradesSoldGetRequest req = new TradesSoldGetRequest();
		req.setFields("tid,sid,total_fee,post_fee,status,trade_memo,buyer_memo,seller_memo,orders.iid,orders.tid,orders.title,orders.price,orders.num");
		req.setBuyerNick("nancyxuan88");
		TopClient client = TestUtils.getOnlineClient();
		String rsp = client.execute(req, new StringParser(), "1bec2ed78aa0b4f67838dc03988a3a8bc");
		System.out.println(rsp);
	}

}
