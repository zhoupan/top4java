package com.taobao.top.util;

import com.taobao.top.TopClient;
import com.taobao.top.TopRestClient;

/**
 * 测试工具类。
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public abstract class TestUtils {

	private static final String TOP_TEST_URL = "http://gw.sandbox.taobao.com/router/rest";

	public static TopClient getTestClient(String format) {
		return new TopRestClient(TOP_TEST_URL, "test", "test");
	}

}
