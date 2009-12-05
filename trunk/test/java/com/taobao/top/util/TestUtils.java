package com.taobao.top.util;

import java.io.IOException;
import java.io.InputStream;

import com.taobao.top.TopClient;
import com.taobao.top.TopJsonRestClient;
import com.taobao.top.TopRestClient;

/**
 * 测试工具类。
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public abstract class TestUtils {

	private static final String TOP_TEST_URL = "http://gw.api.tbsandbox.com/router/rest";
	private static final String TOP_ONLINE_URL = "http://gw.api.taobao.com/router/rest";
	private static final String TOP_PRIVATE_URL = "http://api.daily.taobao.net/top/private/services/rest";

	public static TopClient getTestClient() {
		return new TopRestClient(TOP_TEST_URL, "12011932", "a12489406d7a8de453bc9d3b15229cba");
	}

	public static TopClient getPrivateClient() {
		return new TopRestClient(TOP_PRIVATE_URL, "30592", "eece9b3d34f077e65acfc6fa8f872c0a");
	}

	public static TopClient getOnlineClient() {
		return new TopRestClient(TOP_ONLINE_URL, "12011932", "a12489406d7a8de453bc9d3b15229cba");
	}

	public static TopJsonRestClient getOnlineJsonClient() {
		return new TopJsonRestClient(TOP_ONLINE_URL, "12011932", "a12489406d7a8de453bc9d3b15229cba");
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

	public static FileItem GetResourceAsFileItem(String fileName) {
		return null;
	}

}
