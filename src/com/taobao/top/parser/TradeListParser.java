package com.taobao.top.parser;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.taobao.top.TopException;
import com.taobao.top.domain.Order;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.Trade;

/**
 * 交易列表的响应解释器。
 * 
 * @author carver.gu
 * @since 1.0, Sep 20, 2009
 */
public class TradeListParser implements TopParser<ResponseList<Trade>> {

	public ResponseList<Trade> parse(String body) throws TopException {
		ResponseList<Trade> rsp = new ResponseList<Trade>();
		try {
			JSONObject json = new JSONObject(body);
			JSONObject rspJson = json.getJSONObject("rsp");
			rsp.setTotalResults(rspJson.getLong("totalResults"));
			JSONArray tradesJson = rspJson.getJSONArray("trades");
			List<Trade> trades = new ArrayList<Trade>();
			for (int i = 0; i < tradesJson.length(); i++) {
				JSONObject tradeJson = tradesJson.getJSONObject(i);
				Trade trade = new Trade();
				trade.setTid(Long.valueOf(tradeJson.getString("tid")));
				trade.setStatus(tradeJson.getString("status"));
				trade.setPayment(tradeJson.getString("payment"));
				trades.add(trade);

				List<Order> orders = new ArrayList<Order>();
				JSONArray ordersJson = tradeJson.getJSONArray("orders");
				for (int j = 0; j < ordersJson.length(); j++) {
					JSONObject orderJson = ordersJson.getJSONObject(j);
					Order order = new Order();
					order.setItemTitle(orderJson.getString("title"));
					order.setItemPrice(orderJson.getString("price"));
					order.setItemNum(orderJson.getInt("num"));
					orders.add(order);
				}
				trade.setOrders(orders);
				rsp.setContent(trades);
			}
		} catch (Exception e) {
			throw new TopException(e);
		}
		return rsp;
	}

}
