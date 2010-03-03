package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.taobao.top.TopClient;
import com.taobao.top.domain.Location;
import com.taobao.top.domain.Trade;
import com.taobao.top.parser.StringParser;
import com.taobao.top.parser.json.ObjectJsonParser;
import com.taobao.top.util.DateUtils;
import com.taobao.top.util.TestUtils;

/**
 * 交易接口测试类。
 * 
 * @author carver.gu
 * @since 1.0, Oct 10, 2009
 */
public class TradeApiTest {

	private static TopClient client = TestUtils.getPrivateClient();
	private static Trade trade;

	@BeforeClass
	public static void beforeClass() {
		trade = addTrade();
	}

	@AfterClass
	public static void afterClass() {
		closeTrade();
	}

	@Test
	public void getSoldTrades() throws Exception {
		TradesSoldGetRequest req = new TradesSoldGetRequest();
		req.setFields("seller_nick,buyer_nick,title,type,created,sid,tid,seller_rate,buyer_rate,status,payment,discount_fee,adjust_fee,post_fee,total_fee,pay_time,end_time,modified,consign_time,buyer_obtain_point_fee,point_fee,real_point_fee,received_payment,commission_fee,buyer_memo,seller_memo,alipay_no,buyer_message,pic_path,iid,num,price,cod_fee,shipping_type,orders");
		req.setStartCreated(DateUtils.getYesterdayStart());
		req.setEndCreated(DateUtils.getYesterdayEnd());
		req.setPageSize(10);
		TopRequest proxy = new TopRequestProxy(req, "tbtest1063");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void getBoughtTrades() throws Exception {
		TradesBoughtGetRequest req = new TradesBoughtGetRequest();
		req.setFields("seller_nick,buyer_nick,title,type,created,sid,tid,seller_rate,buyer_rate,status,payment,discount_fee,adjust_fee,post_fee,total_fee,pay_time,end_time,modified,consign_time,buyer_obtain_point_fee,point_fee,real_point_fee,received_payment,commission_fee,buyer_memo,seller_memo,alipay_no,buyer_message,pic_path,iid,num,price,cod_fee,shipping_type,orders");
		req.setStartCreated(DateUtils.getYesterdayStart());
		req.setEndCreated(DateUtils.getYesterdayEnd());
		req.setPageSize(10);
		TopRequest proxy = new TopRequestProxy(req, "tbtest1063");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void getIncrementSoldTrades() throws Exception {
		TradesSoldIncrementGetRequest req = new TradesSoldIncrementGetRequest();
		req.setFields("seller_nick,buyer_nick,title,type,created,sid,tid,seller_rate,buyer_rate,status,payment,discount_fee,adjust_fee,post_fee,total_fee,pay_time,end_time,modified,consign_time,buyer_obtain_point_fee,point_fee,real_point_fee,received_payment,commission_fee,buyer_memo,seller_memo,alipay_no,buyer_message,pic_path,iid,num,price,cod_fee,shipping_type,orders");
		req.setStartModified(DateUtils.getYesterdayStart());
		req.setEndModified(DateUtils.getYesterdayEnd());
		req.setPageSize(10);
		TopRequest proxy = new TopRequestProxy(req, "tbtest1063");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

	public void addSingleTrade() {
		Trade trade = addTrade();
		System.out.println(trade.getTid());
	}

	@Test
	public void addMultipleTrade() {
		TradeAddRequest req = new TradeAddRequest();
		req.setItemTitles("春哥测试,曾哥测试");
		req.setIids("20ee6454727484dd0581aad0dda0c338,d18efb81e0ca184276303cdbba2d1b8c");
		req.setItemSkuIds("5946542,5943150");
		req.setItemPrices("777.77,888.88");
		req.setItemNums("2,3");
		req.setSellerNick("tbtest1063");
		Location location = new Location();
		location.setState("地球省");
		location.setCity("火星市");
		location.setDistrict("山寨区");
		location.setAddress("911号");
		location.setZip("123456");
		req.setLocation(location);
		req.setAreaCode("123456");
		req.setReceiverName("任我行");
		req.setPhone("123456789");
		req.setMobile("123654789");
		req.setTradeMemo("i love you");
		req.setType("independent_simple_trade");
		req.setLogisticsType("post");
		req.setLogisticsFee("10.0");
		req.setSnapshot("snapshot");
		Map<String, String> orderSnap = new HashMap<String, String>();
		orderSnap.put("snapshot_29e5b5d76cb3dc2b627cb3f94988592f_", "xxx");
		req.setOrderSnapshots(orderSnap);
		TopRequest proxy = new TopRequestProxy(req, "tbtest1064");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void addTradeMemo() {
		TradeMemoAddRequest req = new TradeMemoAddRequest();
		req.setTid(trade.getTid());
		req.setMemo("i love you");
		TopRequest proxy = new TopRequestProxy(req, "tbtest1063");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void getOrders() {
		OrdersGetRequest req = new OrdersGetRequest();
		req.setFields("seller_nick,buyer_nick,title,type,created,iid,price,pic_path,num ");
		req.setPageNo(1);
		req.setPageSize(2);
		req.setIid("9444f147a20b22343cf38f3e67a1232c");
		req.setSellerNick("tbtest1061");
		String rsp = client.execute(req, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void getTrade() {
		TradeGetRequest req = new TradeGetRequest();
		req.setFields("orders,buyer_nick,post_fee,type,seller_nick,iid,tid,sid,created,title,pic_path,payment,created,price,num,tid,refund_status,sku_id,modified,total_fee,seller_memo");
		req.setTid(trade.getTid());
		TopRequest proxy = new TopRequestProxy(req, "tbtest1063");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void getTrades() {
		TradesGetRequest req = new TradesGetRequest();
		req.setFields("seller_nick,buyer_nick,title,type,created,iid,price,pic_path,num");
		req.setIid("aeb8ac3cb053533863b9fea947351f45");
		req.setSellerNick("tbtest1063");
		req.setType("independent_simple_trade");
		req.setPageSize(2);
		String rsp = client.execute(req, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void getTradeDetail() {
		TradeGetRequest req = new TradeGetRequest();
		req.setFields("seller_nick,buyer_nick,title,type,created,sid,tid,seller_rate,buyer_rate,status,payment,discount_fee,adjust_fee,post_fee,total_fee,pay_time,end_time,modified,consign_time,buyer_obtain_point_fee,point_fee,real_point_fee,received_payment,commission_fee,buyer_memo,seller_memo,alipay_no,buyer_message,pic_path,iid,num,price,buyer_alipay_no,receiver_name,receiver_state,receiver_city,receiver_district,receiver_address,receiver_zip,receiver_mobile,receiver_phone,buyer_email,seller_alipay_no,seller_mobile,seller_phone,seller_name,seller_email,available_confirm_fee,has_postFee,timeout_action_time,snapshot_url,cod_fee,shipping_type,trade_memo,orders");
		req.setTid(2231978083L);
		TopRequest proxy = new TopRequestProxy(req, "tbtest1063");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void getTradeSnapshot() {
		TradeGetRequest req = new TradeGetRequest();
		req.setFields("snapshot");
		req.setTid(2231958349L);
		TopRequest proxy = new TopRequestProxy(req, "tbtest1063");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void getTradeConfirmFee() {
		TradeConfirmFeeGetRequest req = new TradeConfirmFeeGetRequest();
		req.setTid(11459832L);
		req.setChildOrder(true);
		TopRequest proxy = new TopRequestProxy(req, "tbtest5");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void updateTradeMemo() {
		TradeMemoUpdateRequest req = new TradeMemoUpdateRequest();
		req.setTid(2231958349L);
		req.setMemo("you known");
		TopRequest proxy = new TopRequestProxy(req, "tbtest1063");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void getAppliedRefunds() {
		RefundsAppliedGetRequest req = new RefundsAppliedGetRequest();
		req.setFields("refund_id,tid,title,buyer_nick,seller_nick,total_fee,status,created,refund_fee");
		req.setStatus("SUCCESS");
		req.setPageSize(10);
		TopRequest proxy = new TopRequestProxy(req, "tbtest561");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void getReceivedRefunds() throws Exception {
		RefundsReceivedGetRequest req = new RefundsReceivedGetRequest();
		req.setFields("refund_id,tid,title,buyer_nick,seller_nick,total_fee,status,created,refund_fee,oid,good_status,company_name,sid,payment,reason,desc,has_good_return,modified,order_status");
		req.setStatus("SUCCESS");
		req.setPageSize(10);
		TopRequest proxy = new TopRequestProxy(req, "tbtest561");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void getRefund() {
		RefundGetRequest req = new RefundGetRequest();
		req.setRid(172220L);
		req.setFields("refund_id,alipay_no,tid,oid,buyer_nick,seller_nick,total_fee,status,created,refund_fee,good_status,has_good_return,payment,reason,desc,iid,title,price,num,good_return_time,company_name,sid,address");
		TopRequest proxy = new TopRequestProxy(req, "tbtest561");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void addRefundMessage() {
		RefundMessageAddRequest req = new RefundMessageAddRequest();
		req.setRid(127305L);
		req.setOwnerNick("tbtest1202");
		req.setContent("测试信息");
		TopRequest proxy = new TopRequestProxy(req, "tbtest1202");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

	@Test
	public void getRefundMessage() {
		RefundMessagesGetRequest req = new RefundMessagesGetRequest();
		req.setFields("id,refund_id,owner_id,owner_nick,owner_role,content,pic_urls,created");
		req.setRid(127305L);
		req.setPageSize(10);
		TopRequest proxy = new TopRequestProxy(req, "tbtest1202");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

	private static Trade addTrade() {
		TradeAddRequest request = new TradeAddRequest();
		request.setItemTitles("你信春哥还是曾哥");
		request.setIids("20ee6454727484dd0581aad0dda0c338");
		request.setItemSkuIds("5946542");
		request.setItemPrices("222.22");
		request.setItemNums("2");
		request.setSellerNick("tbtest1063");
		Location location = new Location();
		location.setState("地球省");
		location.setCity("火星市");
		location.setDistrict("山寨区");
		location.setAddress("911号");
		location.setZip("123456");
		request.setLocation(location);
		request.setAreaCode("123456");
		request.setReceiverName("任我行");
		request.setPhone("123456789");
		request.setMobile("123654789");
		request.setTradeMemo("i love you");
		request.setType("independent_simple_trade");
		request.setLogisticsType("post");
		request.setLogisticsFee("10.0");
		request.setSnapshot("snapshot");
		Map<String, String> orderSnap = new HashMap<String, String>();
		orderSnap.put("snapshot_29e5b5d76cb3dc2b627cb3f94988592f_", "xxx");
		request.setOrderSnapshots(orderSnap);
		TopRequest proxy = new TopRequestProxy(request, "tbtest561");
		return client.execute(proxy, new ObjectJsonParser<Trade>(Trade.class));
	}

	private static void closeTrade() {
		TradeCloseRequest req = new TradeCloseRequest();
		req.setTid(trade.getTid());
		req.setReason("I don't want to pay you");
		TopRequest proxy = new TopRequestProxy(req, "tbtest1063");
		String rsp = client.execute(proxy, new StringParser());
		System.out.println(rsp);
	}

}
