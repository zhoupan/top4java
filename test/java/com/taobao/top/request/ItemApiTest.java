package com.taobao.top.request;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.taobao.top.TopClient;
import com.taobao.top.domain.Item;
import com.taobao.top.domain.ItemCat;
import com.taobao.top.domain.ItemImg;
import com.taobao.top.domain.ItemProp;
import com.taobao.top.domain.ItemSearch;
import com.taobao.top.domain.Location;
import com.taobao.top.domain.Postage;
import com.taobao.top.domain.PostageMode;
import com.taobao.top.domain.PropImg;
import com.taobao.top.domain.PropValue;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.Sku;
import com.taobao.top.parser.json.ObjectJsonParser;
import com.taobao.top.parser.json.ObjectListJsonParser;
import com.taobao.top.util.TestUtils;

/**
 * 商品接口测试类。
 * 
 * @author carver.gu
 * @since 1.0, Oct 12, 2009
 */
public class ItemApiTest {

	private static TopClient client = TestUtils.getPrivateClient();
	private static DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static Item _item;
	private static Item _b2cItem;

	@BeforeClass
	public static void beforeClass() {
		_item = addItem();
		_b2cItem = addB2cItem();
	}

	@AfterClass
	public static void afterClass() {
		if (_item != null)
			deleteItem(_item);
		if (_b2cItem != null)
			deleteItem(_b2cItem);
	}

	@Test
	public void getItemProps() {
		ItemPropsGetRequest req = new ItemPropsGetRequest();
		req.setFields("pid,name,status,sort_order");
		req.setCid(1101L);
		ResponseList<ItemProp> rsp = client.execute(req, new ObjectListJsonParser<ItemProp>(ItemProp.class));
		Assert.assertTrue(rsp.getReturnResults() > 0);
	}

	@Test
	public void getItemCats() {
		ItemCatsGetRequest req = new ItemCatsGetRequest();
		req.setFields("cid,name,status,sort_order,parent_cid,is_parent");
		req.setParentCid(0L);
		ResponseList<ItemCat> rsp = client.execute(req, new ObjectListJsonParser<ItemCat>(ItemCat.class));
		Assert.assertTrue(rsp.getReturnResults() > 0);
	}

	@Test
	public void getPropValues() throws ParseException {
		ItemPropValuesGetRequest req = new ItemPropValuesGetRequest();
		req.setFields("cid,pid,prop_name,vid,name,is_parent,status,sort_order");
		req.setCid(50012081L);
		req.setDateTime(format.parse("2009-01-01 00:00:00"));
		ResponseList<PropValue> rsp = client.execute(req, new ObjectListJsonParser<PropValue>(PropValue.class));
		Assert.assertTrue(rsp.getReturnResults() > 0);
	}

	@Test
	public void listItemCats() {
		ItemCatsListRequest req = new ItemCatsListRequest();
		req.setParentCid(1L);
		ResponseList<ItemCat> rsp = client.execute(req, new ObjectListJsonParser<ItemCat>(ItemCat.class));
		Assert.assertTrue(rsp.getReturnResults() > 0);
	}

	@Test
	public void listItemProps() {
		ItemPropsListRequest req = new ItemPropsListRequest();
		req.setCid(1101L);
		ResponseList<ItemProp> rsp = client.execute(req, new ObjectListJsonParser<ItemProp>(ItemProp.class));
		Assert.assertTrue(rsp.getReturnResults() > 0);
	}

	@Test
	public void listItemProp() {
		ItemPropListRequest req = new ItemPropListRequest();
		req.setCid(1101L);
		req.setPid(20000L);
		ItemProp rsp = client.execute(req, new ObjectJsonParser<ItemProp>(ItemProp.class));
		Assert.assertTrue(rsp.getPropValues().size()>0);
	}

	@Test
	public void getItems() {
		ItemsGetRequest req = new ItemsGetRequest();
		req.setFields("iid,title,nick,cid,price,type");
		req.setQuery("N73");
		req.setPageNo(1);
		req.setPageSize(5);
		ResponseList<Item> rsp = client.execute(req, new ObjectListJsonParser<Item>(Item.class));
		Assert.assertTrue(rsp.getReturnResults() > 0);
	}

	@Test
	public void getItem() {
		ItemGetRequest req = new ItemGetRequest();
		req.setFields("iid,title,nick,pic_path,cid,price,type,location.city,delist_time,post_fee");
		req.setNick("钟潭通讯科技");
		req.setIid("1ccb4d75b4f3296ed945bb65d68fd4db");
		Item item = client.execute(req, new ObjectJsonParser<Item>(Item.class));
		Assert.assertEquals("50012579", item.getCid());
	}

	@Test
	public void searchItems() {
		ItemsSearchRequest req = new ItemsSearchRequest();
		req.setFields("iid,title,nick,cid,price,type");
		req.setQuery("N73");
		req.setPageNo(1);
		req.setPageSize(5);
		ResponseList<ItemSearch> rsp = client.execute(req, new ObjectListJsonParser<ItemSearch>(ItemSearch.class));
		Assert.assertTrue(rsp.getReturnResults() > 0);
	}

	@Test
	public void getOnsaleItems() {
		ItemsOnsaleGetRequest req = new ItemsOnsaleGetRequest();
		req.setFields("iid,title,nick,type,cid,num,props,price");
		req.setPageNo(2);
		req.setPageSize(5);
		TopRequest proxy = new TopRequestProxy(req, "tbtest561");
		ResponseList<Item> rsp = client.execute(proxy, new ObjectListJsonParser<Item>(Item.class));
		Assert.assertEquals(5, rsp.getReturnResults());
	}

	@Test
	public void getInstockItems() {
		ItemsInventoryGetRequest req = new ItemsInventoryGetRequest();
		req.setFields("iid,title,nick,type,cid,num,props,price");
		req.setPageNo(1);
		req.setPageSize(5);
		TopRequest proxy = new TopRequestProxy(req, "tbtest561");
		ResponseList<Item> rsp = client.execute(proxy, new ObjectListJsonParser<Item>(Item.class));
		Assert.assertEquals(5, rsp.getReturnResults());
	}

	@Test
	public void getAllItems() {
		ItemsAllGetRequest req = new ItemsAllGetRequest();
		req.setFields("iid,title,nick");
		req.setPageNo(1);
		req.setPageSize(1);
		TopRequest proxy = new TopRequestProxy(req, "tbtest5");
		ResponseList<Item> rsp = client.execute(proxy, new ObjectListJsonParser<Item>(Item.class));
		Assert.assertEquals(1, rsp.getReturnResults());
	}

	@Test
	public void updateItem() {
		ItemUpdateRequest req = new ItemUpdateRequest();
		req.setIid(_item.getIid());
		req.setApproveStatus("onsale");
		req.setTitle("Updated by top4java");
		req.setImage(TestUtils.GetResourceAsFileItem("item.jpg"));
		TopRequest proxy = new TopRequestProxy(req, _item.getNick());
		Item item = client.execute(proxy, new ObjectJsonParser<Item>(Item.class));
		Assert.assertEquals(_item.getIid(), item.getIid());
	}

	@Test
	public void deleteItemImg() {
		ItemImg itemUpload = addItemImg();
		ItemImgDeleteRequest reqDelete = new ItemImgDeleteRequest();
		reqDelete.setIid(_b2cItem.getIid());
		reqDelete.setImgId(itemUpload.getImgId());
		TopRequest proxyDelete = new TopRequestProxy(reqDelete, _b2cItem.getNick());
		ItemImg itemDelete = client.execute(proxyDelete, new ObjectJsonParser<ItemImg>(ItemImg.class));
		Assert.assertEquals(itemUpload.getImgId(), itemDelete.getImgId());
	}

	@Test
	public void deleteItemPropImg() {
		PropImg imgUpload = uploadItemPropImg();
		ItemPropImgDeleteRequest reqDelete = new ItemPropImgDeleteRequest();
		reqDelete.setIid(_b2cItem.getIid());
		reqDelete.setImgId(imgUpload.getImgId());
		TopRequest proxyDelete = new TopRequestProxy(reqDelete, _b2cItem.getNick());
		PropImg imgDelete = client.execute(proxyDelete, new ObjectJsonParser<PropImg>(PropImg.class));
		Assert.assertEquals(imgUpload.getImgId(), imgDelete.getImgId());
	}

	@Test
	public void getItemSku() {
		ItemSkuGetRequest req = new ItemSkuGetRequest();
		req.setFields("sku_id,iid,properties,quantity,price,outer_id,created,modified");
		req.setNick("tbtest561");
		req.setSkuId(81192754L);
		Sku sku = client.execute(req, new ObjectJsonParser<Sku>(Sku.class));
		Assert.assertNotNull(sku);
	}

	@Test
	public void updateItemSku() {
		ItemSkuUpdateRequest req = new ItemSkuUpdateRequest();
		req.setIid(_item.getIid());
		req.setProps("1627207:3232481");
		req.setQuantity(5);
		req.setPrice("1000");
		TopRequest proxy = new TopRequestProxy(req, _item.getNick());
		Sku sku = client.execute(proxy, new ObjectJsonParser<Sku>(Sku.class));
		Assert.assertNotNull(sku);
		Assert.assertEquals(_item.getIid(), sku.getIid());
	}

	@Test
	public void getItemSkus() {
		addItemSku();
		ItemSkusGetRequest req = new ItemSkusGetRequest();
		req.setFields("sku_id,iid,properties,quantity,price,outer_id,created,modified");
		req.setIids(_item.getIid());
		req.setNick(_item.getNick());
		ResponseList<Sku> rsp = client.execute(req, new ObjectListJsonParser<Sku>(Sku.class));
		Assert.assertEquals(1, rsp.getReturnResults());
	}

	@Test
	public void enlistItem() {
		ItemEnlistRequest req = new ItemEnlistRequest();
		req.setIid(_item.getIid());
		req.setNum(10);
		TopRequest proxy = new TopRequestProxy(req, _item.getNick());
		Item item = client.execute(proxy, new ObjectJsonParser<Item>(Item.class));
		Assert.assertEquals(_item.getIid(), item.getIid());
	}

	@Test
	public void delistItem() {
		ItemDelistRequest req = new ItemDelistRequest();
		req.setIid(_item.getIid());
		TopRequest proxy = new TopRequestProxy(req, _item.getNick());
		Item item = client.execute(proxy, new ObjectJsonParser<Item>(Item.class));
		Assert.assertEquals(_item.getIid(), item.getIid());
	}

	@Test
	public void getPostages() {
		PostagesGetRequest req = new PostagesGetRequest();
		req.setFields("postage_id,name,post_price,post_increase,express_price,express_increase,ems_price,ems_increase");
		TopRequest proxy = new TopRequestProxy(req, "tbtest562");
		ResponseList<Postage> rsp = client.execute(proxy, new ObjectListJsonParser<Postage>(Postage.class));
		Assert.assertTrue(rsp.getReturnResults() > 0);
	}

	@Test
	public void getPostage() {
		PostageGetRequest req = new PostageGetRequest();
		req.setFields("postage_id,name,post_price,post_increase,postage_mode.id,postage_mode.type");
		req.setPostageId(57228L);
		req.setNick("tbtest561");
		Postage postage = client.execute(req, new ObjectJsonParser<Postage>(Postage.class));
		Assert.assertNotNull(postage);
		Assert.assertEquals("57228", postage.getId().toString());
	}

	@Test
	public void updatePostage() {
		Postage postageAdd = addPostage();
		PostageUpdateRequest req = new PostageUpdateRequest();
		req.setPostageId(postageAdd.getId());
		req.setName("笑傲江湖邮费模板");
		req.setMemo("东方不败专用");
		req.setPostPrice("6");
		req.setPostIncrease("2");
		req.setExpressPrice("10");
		req.setExpressIncrease("3");
		req.setEmsPrice("20");
		req.setEmsIncrease("5");
		TopRequest proxy = new TopRequestProxy(req, "tbtest561");
		Postage postage = client.execute(proxy, new ObjectJsonParser<Postage>(Postage.class));
		Assert.assertNotNull(postage);
		Assert.assertEquals(postageAdd.getId(), postage.getId());
	}

	@Test
	public void deletePostage() {
		Postage postageAdd = addPostage();
		PostageDeleteRequest reqDel = new PostageDeleteRequest();
		reqDel.setPostageId(postageAdd.getId());
		TopRequest proxyDel = new TopRequestProxy(reqDel, "tbtest561");
		Postage postageDel = client.execute(proxyDel, new ObjectJsonParser<Postage>(Postage.class));
		Assert.assertNotNull(postageDel);
		Assert.assertEquals(postageAdd.getId(), postageDel.getId());
	}

	@Test
	public void deleteItem() {
		ItemDeleteRequest req = new ItemDeleteRequest();
		req.setIid(_item.getIid());
		TopRequest proxy = new TopRequestProxy(req, _item.getNick());
		Item item = client.execute(proxy, new ObjectJsonParser<Item>(Item.class));
		Assert.assertNotNull(item);
	}

	@Test
	public void getCustomItems() {
		ItemsCustomGetRequest req = new ItemsCustomGetRequest();
		req.setFields("iid,title,nick,outer_id");
		req.setOuterId("top4java");
		TopRequest proxy = new TopRequestProxy(req, _item.getNick());
		ResponseList<Item> rsp = client.execute(proxy, new ObjectListJsonParser<Item>(Item.class));
		Assert.assertNotNull(rsp.getContent());
	}

	@Test
	public void getCustomSkus() {
		addItemSku();
		SkusCustomGetRequest req = new SkusCustomGetRequest();
		req.setFields("sku_id,outer_id,iid");
		req.setOuterId("top4java");
		TopRequest proxy = new TopRequestProxy(req, _item.getNick());
		ResponseList<Sku> rsp = client.execute(proxy, new ObjectListJsonParser<Sku>(Sku.class));
		Assert.assertNotNull(rsp.getContent());
	}

	private void addItemSku() {
		ItemSkuAddRequest req = new ItemSkuAddRequest();
		req.setIid(_item.getIid());
		req.setProps("1627207:3232481");
		req.setQuantity(3);
		req.setPrice("1000");
		req.setOuterId("top4java");
		TopRequest proxy = new TopRequestProxy(req, _item.getNick());
		client.execute(proxy, new ObjectJsonParser<Sku>(Sku.class));
	}

	@Test
	public void addRecommendItem() {
		ItemRecommendAddRequest req = new ItemRecommendAddRequest();
		req.setIid(_item.getIid());
		TopRequest proxy = new TopRequestProxy(req, _item.getNick());
		Item item = client.execute(proxy, new ObjectJsonParser<Item>(Item.class));
		Assert.assertNotNull(item);
		Assert.assertEquals(_item.getIid(), item.getIid());
	}

	@Test
	public void deleteRecommendItem() {
		ItemRecommendDeleteRequest req = new ItemRecommendDeleteRequest();
		req.setIid(_item.getIid());
		TopRequest proxy = new TopRequestProxy(req, _item.getNick());
		Item item = client.execute(proxy, new ObjectJsonParser<Item>(Item.class));
		Assert.assertNotNull(item);
		Assert.assertEquals(_item.getIid(), item.getIid());
	}

	private static Item addItem() {
		try {
			ItemAddRequest req = new ItemAddRequest();
			req.setApproveStatus("onsale");
			req.setEnlistTime(new Date());
			req.setNum(10);
			req.setPrice("1000.00");
			req.setType("fixed");
			req.setStuffStatus("new");
			req.setTitle("六脉神剑");
			req.setDesc("客户第一，员工第二，股东第三");
			Location location = new Location();
			location.setState("广东");
			location.setCity("深圳");
			req.setCid(2203L);
			req.setLocation(location);
			req.setAutoRepost(true);
			req.setPostFee("5.0");
			req.setExpressFee("10.0");
			req.setEmsFee("20.0");
			req.setOuterId("top4java");
			req.setProps("20000:20727;1627207:3232483;20055:20716");
			req.setSkuProps("1627207:3232483");
			req.setHasShowcase(true);
			req.setImage(TestUtils.GetResourceAsFileItem("item.jpg"));

			TopRequest proxy = new TopRequestProxy(req, "tbtest561");
			Item item = client.execute(proxy, new ObjectJsonParser<Item>(Item.class));
			item.setNick("tbtest561");
			Assert.assertNotNull(item);
			return item;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return _item;
		}
	}

	private static Item addB2cItem() {
		try {
			ItemAddRequest req = new ItemAddRequest();
			req.setApproveStatus("onsale");
			req.setEnlistTime(new Date());
			req.setNum(10);
			req.setPrice("1000.00");
			req.setType("fixed");
			req.setStuffStatus("new");
			req.setTitle("独孤九剑");
			req.setDesc("无招胜有招");
			Location location = new Location();
			location.setState("浙江");
			location.setCity("杭州");
			req.setCid(50012286L);
			req.setLocation(location);
			req.setAutoRepost(true);
			req.setPostFee("5.0");
			req.setExpressFee("10.0");
			req.setEmsFee("20.0");
			req.setAuctionPoint(5);
			req.setHasInvoice(true);
			req.setProps("20000:3464206;1637400:4606395;1627207:28326;21861:44860;21862:44571");
			req.setSkuProps("1627207:28326");
			req.setImage(TestUtils.GetResourceAsFileItem("item.jpg"));
			TopRequest proxy = new TopRequestProxy(req, "b2ctest125");
			Item item = client.execute(proxy, new ObjectJsonParser<Item>(Item.class));
			item.setNick("b2ctest125");
			Assert.assertNotNull(item);
			return item;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return _b2cItem;
		}
	}

	private static ItemImg addItemImg() {
		ItemImgUploadRequest req = new ItemImgUploadRequest();
		req.setIid(_b2cItem.getIid());
		req.setImage(TestUtils.GetResourceAsFileItem("item.jpg"));
		req.setPosition(3);
		req.setPrimary(false);
		TopRequest proxy = new TopUploadRequestProxy(req, _b2cItem.getNick());
		ItemImg item = client.execute(proxy, new ObjectJsonParser<ItemImg>(ItemImg.class));
		Assert.assertNotNull(item);
		return item;
	}

	private static PropImg uploadItemPropImg() {
		ItemPropImgUploadRequest req = new ItemPropImgUploadRequest();
		req.setIid(_b2cItem.getIid());
		req.setProps("1628011:4001117");
		req.setPosition(2);
		req.setImage(TestUtils.GetResourceAsFileItem("prop.jpg"));
		TopRequest proxy = new TopUploadRequestProxy(req, _b2cItem.getNick());
		PropImg img = client.execute(proxy, new ObjectJsonParser<PropImg>(PropImg.class));
		Assert.assertNotNull(img);
		return img;
	}

	private static Postage addPostage() {
		PostageAddRequest req = new PostageAddRequest();
		req.setName("笑傲江湖邮费模板");
		req.setMemo("东方不败专用");
		req.setPostPrice("5");
		req.setPostIncrease("3");
		req.setExpressPrice("5");
		req.setExpressIncrease("4");
		req.setEmsPrice("20");
		req.setEmsIncrease("10");
		PostageMode mode = new PostageMode();
		mode.setType("post;express;ems");
		mode.setDests("810000,820000");
		mode.setPrice("11;15;20");
		mode.setIncrease("2;5;7");
		req.addPostageMode(mode);
		TopRequest proxy = new TopRequestProxy(req, "tbtest561");
		Postage postage = client.execute(proxy, new ObjectJsonParser<Postage>(Postage.class));
		Assert.assertNotNull(postage);
		return postage;
	}

	protected static void deleteItem(Item item) {
		try {
			ItemDeleteRequest req = new ItemDeleteRequest();
			req.setIid(item.getIid());
			TopRequest proxy = new TopRequestProxy(req, item.getNick());
			Item rsp = client.execute(proxy, new ObjectJsonParser<Item>(Item.class));
			Assert.assertNotNull(rsp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
