package com.taobao.top;

import java.util.Date;

import org.junit.Test;
import org.stringtree.json.JSONWriter;

import com.taobao.top.domain.Location;
import com.taobao.top.domain.User;

public class JSONWriterTest {

	@Test
	public void writeUser() {
		User user = new User();
		user.setNick("风胜");
		user.setCreated(new Date());
		Location location = new Location();
		location.setState("浙江");
		location.setCity("杭州");
		user.setLocation(location);
		JSONWriter writer = new JSONWriter();
		System.out.println(writer.write(user));
	}

}
