package com.taobao.top.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.junit.Test;

public class TopUtilsTest {

	@Test
	public void signTopRequest() throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("nick", "winwindg");
		params.put("fields", "nick,sex");
		String sign = TopUtils.signTopRequest(params, "carver");
		Assert.assertEquals("E780A69E04E438846FAF25AD28047415", sign);
	}

	@Test
	public void signTopRequestWithChineseCharacters() throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("nick", "风胜");
		params.put("fields", "nick,sex");
		String sign = TopUtils.signTopRequest(params, "carver");
		Assert.assertEquals("C94566A40E066217E83292751B225F2C", sign);
	}

	@Test
	public void getTopContext() throws IOException {
		TopContext context = TopUtils.getTopContext("TOP-10132037c7f1a3241a9ec89db3018b1474jBFuIQHT19SdTx9aLZYiryryfo1TC4-END");
		System.out.println(context.getSessionKey());
		System.out.println(context.getUserId());
		System.out.println(context.getUserNick());
	}

	@Test
	public void decodeTopParams() throws IOException {
		String topParams = "aWZyYW1lPTEmdHM9MTI1NjAwNDg5Mzk4MCZ2aWV3X21vZGU9ZnVsbCZ2aWV3X3dpZHRoPTAmdmlzaXRvcl9pZD0yMzQxOTA1NCZ2aXNpdG9yX25pY2s908C649K7yfo%3D";
		Map<String, String> map = TopUtils.decodeTopParams(topParams);
		Assert.assertEquals("23419054", map.get("visitor_id"));
		Assert.assertEquals("永恒一生", map.get("visitor_nick"));
	}

}
