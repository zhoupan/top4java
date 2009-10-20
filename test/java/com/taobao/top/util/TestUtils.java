package com.taobao.top.util;

import java.io.IOException;
import java.io.InputStream;

import com.taobao.top.TopClient;
import com.taobao.top.TopRestClient;

/**
 * 测试工具类。
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public abstract class TestUtils {

	private static final String TOP_TEST_URL = "http://gw.api.tbsandbox.com/router/rest";

	public static TopClient getTestClient() {
		return new TopRestClient(TOP_TEST_URL, "test", "test");
	}

	public static String readResource(String fileName) throws IOException {
		StringBuilder out = new StringBuilder();
		InputStream in = null;

		try {
			in = TestUtils.class.getResourceAsStream("/" + fileName);
			byte[] bytes = new byte[1024];
			for (int n; (n = in.read(bytes)) != -1;) {
				out.append(new String(bytes, 0, n));
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
		return out.toString();
	}

}
