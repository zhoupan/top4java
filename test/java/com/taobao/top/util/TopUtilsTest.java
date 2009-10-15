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
		TopContext context = TopUtils.getTopContext("TOP-10494706797fe768ea671256897b15e70eppPa2C16t9cUF0kl847ehc9dt7H0fx-END");
		System.out.println(context.getSessionKey());
		System.out.println(context.getUserId());
		System.out.println(context.getUserNick());
	}

	@Test
	public void decodeTopParams() throws IOException {
		String topParams = "aWZyYW1lPTAmdHM9MTI1NTYxNjE1NjY5NiZ2aWV3X21vZGU9ZnVsbCZ2aWV3X3dpZHRoPTAmdmlzaXRvcl9pZD0yMjg0NDI5NzUmdmlzaXRvcl9uaWNrPbfnyqQ";
		Map<String, String> map = TopUtils.decodeTopParams(topParams);
		Assert.assertEquals("228442975", map.get("visitor_id"));
	}

}
