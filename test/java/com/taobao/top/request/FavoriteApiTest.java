package com.taobao.top.request;

import org.junit.Test;

import com.taobao.top.TopJsonRestClient;
import com.taobao.top.domain.CollectItem;
import com.taobao.top.domain.PageList;
import com.taobao.top.domain.Shop;
import com.taobao.top.util.TestUtils;

/**
 * 收藏夹接口测试。
 * 
 * @author carver.gu
 * @since 1.0, Sep 18, 2010
 */
public class FavoriteApiTest {

	private TopJsonRestClient client = TestUtils.getOnlineJsonClient();

	@Test
	public void searchFavorite() {
		FavoriteSearchRequest req = new FavoriteSearchRequest();
		req.setUserNick("我的小天天宝贝");
		req.setCollectType("SHOP");
		req.setPageNo(1);
		PageList<CollectItem> cis = client.favoriteSearch(req);
		if (!cis.isEmpty()) {
			for (CollectItem ci : cis.getContent()) {
				System.out.println(ci.getItemNumid());
			}
		}
	}

	@Test
	public void getShop() {
		ShopGetRequest req = new ShopGetRequest();
		req.setFields("sid,bulletin");
		req.setNick("mg百库专卖店");
		Shop shop = client.shopGet(req);
		System.out.println(shop.getBulletin() + ":" + shop.getSid());
	}

}
