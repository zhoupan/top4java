package com.taobao.top.request;

import org.junit.Test;

import com.taobao.top.TopClient;
import com.taobao.top.parser.StringParser;
import com.taobao.top.util.TestUtils;

/**
 * 店铺测试类。
 * 
 * @author carver.gu
 * @since 1.0, Dec 12, 2009
 */
public class ShopApiTest {

	private TopClient client = TestUtils.getOnlineClient();

	@Test
	public void getShop() {
		ShopGetRequest req = new ShopGetRequest();
		req.setFields("sid,cid,title");
		req.setNick("驴友之家");
		String rsp = client.execute(req, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void searchShopItems() {
		ShopItemsSearchRequest req = new ShopItemsSearchRequest();
		req.setShopId(33170372L);
		String rsp = client.execute(req, new StringParser());
		System.out.println(rsp);
	}

}
