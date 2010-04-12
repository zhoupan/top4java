package com.taobao.top.mapping;

import junit.framework.Assert;

import org.junit.Test;

import com.taobao.top.domain.Item;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.Trade;
import com.taobao.top.domain.User;
import com.taobao.top.parser.json.JsonConverter;
import com.taobao.top.util.TestUtils;

public class JsonConverterTest {

	@Test
	public void parseItemsGet() throws Exception {
		Converter jc = new JsonConverter();
		String json = TestUtils.readResource("items.json");
		ResponseList<Item> rsp = jc.toResponseList(json, Item.class, "taobao.items.get");
		Assert.assertEquals(new Long(277L), rsp.getTotalResults());
	}

	@Test
	public void parseUserGet() throws Exception {
		Converter jc = new JsonConverter();
		String json = TestUtils.readResource("user.json");
		User user = jc.toResponse(json, User.class, "taobao.user.get");
		Assert.assertEquals("hz0799", user.getNick());
	}

	@Test
	public void parseTradesSoldGet() throws Exception {
		Converter jc = new JsonConverter();
		String json = TestUtils.readResource("trades.json");
		ResponseList<Trade> rsp = jc.toResponseList(json, Trade.class, "taobao.trades.sold.get");
		Assert.assertEquals(new Long(897L), rsp.getTotalResults());
		Assert.assertEquals(2, rsp.getContent().size());
	}

}
