package com.taobao.top.request;

import org.junit.Test;

import com.taobao.top.TopJsonRestClient;
import com.taobao.top.domain.PageList;
import com.taobao.top.domain.TaobaokeShop;
import com.taobao.top.util.TestUtils;

/**
 * 淘宝客接口测试。
 * 
 * @author fengsheng
 * @since 1.0, Apr 17, 2010
 */
public class TaobaokeApiTest {

	private TopJsonRestClient client = TestUtils.getOnlineJsonClient();

	@Test
	public void convertTaobaokeShops() {
		TaobaokeShopsConvertRequest req = new TaobaokeShopsConvertRequest();
		req.setFields("user_id,shop_title,click_url,commission_rate");
		req.setSids("34265604");
		req.setNick("hz0799");
		PageList<TaobaokeShop> rsp = client.taobaokeShopsConvert(req);
		System.out.println(rsp.getTotalResults());
	}

}
