package com.taobao.top.util;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.junit.Test;

public class SysUtilsTest {

	@Test
	public void signTopRequest() throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("nick", "winwindg");
		params.put("fields", "nick,sex");
		String sign = SysUtils.signTopRequest(params, "carver");
		Assert.assertEquals("E780A69E04E438846FAF25AD28047415", sign);
	}

	@Test
	public void signTopRequestWithChineseParameters() throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("nick", "风胜");
		params.put("fields", "nick,sex");
		String sign = SysUtils.signTopRequest(params, "carver");
		Assert.assertEquals("C94566A40E066217E83292751B225F2C", sign);
	}

}
