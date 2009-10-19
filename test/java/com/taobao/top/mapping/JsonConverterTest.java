package com.taobao.top.mapping;

import org.junit.Test;

import com.taobao.top.domain.Order;
import com.taobao.top.parser.json.JsonConverter;
import com.taobao.top.util.TestUtils;

public class JsonConverterTest {

	@Test
	public void parseOrders() throws Exception {
		Converter converter = new JsonConverter();
		String json = TestUtils.readResource("orders.json");
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 500; i++) {
			converter.toResponseList(json, Order.class);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time elapsed: " + (end - begin) + " ms.");
		Thread.sleep(200);
	}

}
