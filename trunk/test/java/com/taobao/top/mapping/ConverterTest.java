package com.taobao.top.mapping;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.stringtree.json.JSONReader;

import com.taobao.top.TopException;
import com.taobao.top.domain.ItemProp;
import com.taobao.top.domain.ResponseList;
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
	public void convertProducts() throws IOException, TopException {
		String json = TestUtils.readResource("item.props.json");
		long begin = System.currentTimeMillis();
		JSONReader reader = new JSONReader();
		Map<?, ?> jsonMap = (Map<?, ?>) reader.read(json);
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
		List<?> list = (List<?>) jsonMap.get("item_props");
		ResponseList<ItemProp> products = new ResponseList<ItemProp>();
		for (Object obj : list) {
			Map<?, ?> map = (Map<?, ?>) obj;
			products.addContent(Converter.fromJson(map, ItemProp.class));
		}
		long end2 = System.currentTimeMillis();
		System.out.println(end2 - end);
		System.out.println(products.getContent().size());
	}

}
