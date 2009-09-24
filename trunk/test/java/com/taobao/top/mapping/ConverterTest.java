package com.taobao.top.mapping;

import java.util.Map;

import org.junit.Test;
import org.stringtree.json.JSONReader;

import com.taobao.top.domain.Order;
import com.taobao.top.domain.User;
import com.taobao.top.util.TestUtils;

public class ConverterTest {

	@Test
	public void convertUser() throws Exception {
		String json = "{\"nick\":\"carver\",\"created\":\"2009-09-10 09:09:09\"}";
		JSONReader reader = new JSONReader();
		Map<?, ?> map = (Map<?, ?>) reader.read(json);
		User user = Converter.fromJson(map, User.class);
		System.out.println(user.getNick());
		System.out.println(user.getCreated());
	}

	@Test
	public void parseOrders() throws Exception {
		String json = TestUtils.readResource("orders.json");
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 500; i++) {
			Converter.toResponseList(json, Order.class);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time elapsed: " + (end - begin) + " ms.");
		Thread.sleep(200);
	}

}
