package com.taobao.top.mapping;

import org.junit.Test;

import com.taobao.top.domain.Item;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.User;
import com.taobao.top.parser.json.JsonConverter;
import com.taobao.top.util.TestUtils;

public class JsonConverterTest {

	@Test
	public void parseItemsGet() throws Exception {
		Converter jc = new JsonConverter();
		String json = TestUtils.readResource("items.json");
		ResponseList<Item> rsp = jc.toResponseList(json, Item.class, "taobao.items.get");
		System.out.println(rsp.getTotalResults());
	}

	@Test
	public void parseUserGet() throws Exception {
		Converter jc = new JsonConverter();
		String json = TestUtils.readResource("user.json");
		User user = jc.toResponse(json, User.class, "taobao.user.get");
		System.out.println(user.getNick());
	}

}
