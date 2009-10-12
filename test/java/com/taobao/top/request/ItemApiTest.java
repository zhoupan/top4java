package com.taobao.top.request;

import org.junit.Test;

import com.taobao.top.TopClient;
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
		req.setCid("111703");
		req.setFields("name");
		TopClient client = TestUtils.getTestClient();
		String rsp = client.execute(req, new StringParser());
		System.out.println(rsp);
	}

}
