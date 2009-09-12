package com.taobao.top;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.taobao.top.parser.TopParser;
import com.taobao.top.request.TopRequest;
import com.taobao.top.request.TopUploadRequest;
import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

public class TopRestClientTest {

	private static final String TOP_TEST_URL = "http://gw.sandbox.taobao.com/router/rest";

	@Test
	public void getUserByJson() throws TopException {
		TopClient client = new TopRestClient(TOP_TEST_URL, "test", "test");
		TopRequest request = new TopRequest() {
			public Map<String, String> getTextParams() {
				TopHashMap params = new TopHashMap();
				params.put("fields", "user_id,nick,sex,created,location");
				params.put("nick", "tbtest520");
				return params;
			}

			public String getApiName() {
				return "taobao.user.get";
			}
		};
		TopParser<String> parser = new TopParser<String>() {
			public String parse(String body) {
				return body;
			}
		};
		String rsp = client.execute(request, parser);
		System.out.println(rsp);
	}

	@Test
	public void addItemByJson() throws TopException {
		TopClient client = new TopRestClient(TOP_TEST_URL, "test", "test");
		TopUploadRequest request = new TopUploadRequest() {
			public Map<String, String> getTextParams() {
				TopHashMap params = new TopHashMap();
				params.put("approve_status", "onsale");
				params.put("cid", "2203");
				params.put("props", "20000:20727;1627207:3232483;20055:20716");
				params.put("num", "10");
				params.put("price", "1000.00");
				params.put("type", "fixed");
				params.put("stuff_status", "new");
				params.put("title", "六脉神剑");
				params.put("desc", "客户第一，员工第二，股东第三");
				params.put("location.state", "广东");
				params.put("location.city", "深圳");
				params.put("auto_repost", true);
				params.put("has_showcase", true);
				params.put("post_fee", "5.0");
				params.put("express_fee", "10.0");
				params.put("ems_fee", "20.0");
				params.put("list_time", new Date());
				params.put("sku_properties", "1627207:3232483");
				params.put("outer_id", "top4java");
				return params;
			}

			public String getApiName() {
				return "taobao.item.add";
			}

			public Map<String, FileItem> getFileParams() {
				Map<String, FileItem> params = new HashMap<String, FileItem>();
				FileItem fileItem = new FileItem(new File("E:/Develop/Top4Java/build.xml"));
				params.put("image", fileItem);
				return params;
			}
		};
		TopParser<String> parser = new TopParser<String>() {
			public String parse(String body) {
				return body;
			}
		};
		String rsp = client.execute(request, parser);
		System.out.println(rsp);
	}

}
