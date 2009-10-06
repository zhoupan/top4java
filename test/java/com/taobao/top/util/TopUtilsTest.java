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
	public void decodeTopParams() throws IOException {
		String topParams = "aWZyYW1lPTEmdHM9MTI1NDgzMjI5NDU1MiZ2aWV3X21vZGU9ZnVsbCZ2aWV3X3dpZHRoPTAmdmlzaXRvcl9pZD0yMjY3MDQ1OCZ2aXNpdG9yX25pY2s9aHowNzk5";
		Map<String, String> map = TopUtils.decodeTopParams(topParams);
		Assert.assertEquals("hz0799", map.get("visitor_nick"));
	}

}
