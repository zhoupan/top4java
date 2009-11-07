package org.stringtree.json;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import com.taobao.top.domain.Location;
import com.taobao.top.domain.Order;
import com.taobao.top.domain.Trade;
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

	@Test
	public void writeTrade() {
		Trade trade = new Trade();
		trade.setTid(123456789L);
		trade.setTitle("驴友之家");
		trade.setOrders(new ArrayList<Order>());
		JSONWriter writer = new JSONWriter();
		System.out.println(writer.write(trade));
	}

}
