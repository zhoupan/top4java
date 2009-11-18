package com.taobao.top.request;

import org.junit.Test;

import com.taobao.top.TopClient;
import com.taobao.top.TopJsonRestClient;
import com.taobao.top.domain.AuthorizeCats;
import com.taobao.top.domain.ItemSearch;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.parser.StringParser;
import com.taobao.top.util.TestUtils;

/**
 * 商品接口测试类。
 * 
 * @author carver.gu
 * @since 1.0, Oct 12, 2009
 */
public class ItemApiTest {

	@Test
	public void getItemProps() {
		ItemPropsGetRequest req = new ItemPropsGetRequest();
		req.setCid(111703L);
		req.setFields("name");
		TopClient client = TestUtils.getTestClient();
		String rsp = client.execute(req, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void searchItems() {
		ItemsSearchRequest req = new ItemsSearchRequest();
		req.setFields("iid,title");
		req.setQuery("欧莱雅 复颜清乳柔肤水 200ml 保湿滋润补水抗皱紧致");
		req.setNicks("绿贝壳化妆品专营店");
		TopJsonRestClient client = TestUtils.getOnlineJsonClient();
		ResponseList<ItemSearch> rsp = client.searchItems(req);
		System.out.println(rsp.getTotalResults());
	}

	@Test
	public void getTaobaokeItems() {
		TopJsonRestClient client = TestUtils.getOnlineJsonClient();
		TaobaokeItemsGetRequest req = new TaobaokeItemsGetRequest();
		req.setFields("iid,title,nick");
		req.setCid(0L);
		req.setNick("hz0799");
		System.out.println(client.getResponse(req));
	}

	public void getAuthorizeItemCats() {
		ItemCatsAuthorizeGetRequest req = new ItemCatsAuthorizeGetRequest();
		req.setFields("brand.vid,brand.name,item_cat.cid,item_cat.name");
		TopJsonRestClient client = TestUtils.getOnlineJsonClient();
		AuthorizeCats rsp = client.getAuthorizeItemCats(req, "2bf49d6fbf750f02224f3e0535f153bbc");
		System.out.println(rsp);
	}

}
