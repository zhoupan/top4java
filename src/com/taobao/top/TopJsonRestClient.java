package com.taobao.top;

import com.taobao.top.domain.Area;
import com.taobao.top.domain.CatStat;
import com.taobao.top.domain.ConfirmFee;
import com.taobao.top.domain.DeliveryAddress;
import com.taobao.top.domain.Item;
import com.taobao.top.domain.ItemCat;
import com.taobao.top.domain.ItemImg;
import com.taobao.top.domain.ItemProp;
import com.taobao.top.domain.ItemSearch;
import com.taobao.top.domain.ItemStat;
import com.taobao.top.domain.LogisticsCompany;
import com.taobao.top.domain.LogisticsOrder;
import com.taobao.top.domain.Order;
import com.taobao.top.domain.Postage;
import com.taobao.top.domain.Product;
import com.taobao.top.domain.ProductImg;
import com.taobao.top.domain.ProductPropImg;
import com.taobao.top.domain.PropImg;
import com.taobao.top.domain.PropValue;
import com.taobao.top.domain.Refund;
import com.taobao.top.domain.RefundMessage;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.domain.SellerItemCat;
import com.taobao.top.domain.Shop;
import com.taobao.top.domain.ShopCat;
import com.taobao.top.domain.Sku;
import com.taobao.top.domain.Tadget;
import com.taobao.top.domain.TaobaokeItem;
import com.taobao.top.domain.TaobaokeReport;
import com.taobao.top.domain.TaobaokeShop;
import com.taobao.top.domain.Trade;
import com.taobao.top.domain.TradeRate;
import com.taobao.top.domain.TradeStat;
import com.taobao.top.domain.User;
import com.taobao.top.parser.StringParser;
import com.taobao.top.parser.json.ObjectJsonParser;
import com.taobao.top.parser.json.ObjectListJsonParser;
import com.taobao.top.request.AreasGetRequest;
import com.taobao.top.request.CatStatsGetRequest;
import com.taobao.top.request.DeliveryAddressesGetRequest;
import com.taobao.top.request.DeliverySendRequest;
import com.taobao.top.request.ItemAddRequest;
import com.taobao.top.request.ItemCatsGetRequest;
import com.taobao.top.request.ItemCatsListRequest;
import com.taobao.top.request.ItemDeleteRequest;
import com.taobao.top.request.ItemDelistRequest;
import com.taobao.top.request.ItemEnlistRequest;
import com.taobao.top.request.ItemGetRequest;
import com.taobao.top.request.ItemImgDeleteRequest;
import com.taobao.top.request.ItemImgJointRequest;
import com.taobao.top.request.ItemImgUploadRequest;
import com.taobao.top.request.ItemPropImgDeleteRequest;
import com.taobao.top.request.ItemPropImgUploadRequest;
import com.taobao.top.request.ItemPropListRequest;
import com.taobao.top.request.ItemPropValuesGetRequest;
import com.taobao.top.request.ItemPropsGetRequest;
import com.taobao.top.request.ItemPropsListRequest;
import com.taobao.top.request.ItemRecommendAddRequest;
import com.taobao.top.request.ItemRecommendDeleteRequest;
import com.taobao.top.request.ItemSkuAddRequest;
import com.taobao.top.request.ItemSkuGetRequest;
import com.taobao.top.request.ItemSkuUpdateRequest;
import com.taobao.top.request.ItemSkusGetRequest;
import com.taobao.top.request.ItemStatsGetRequest;
import com.taobao.top.request.ItemUpdateRequest;
import com.taobao.top.request.ItemsAllGetRequest;
import com.taobao.top.request.ItemsCustomGetRequest;
import com.taobao.top.request.ItemsGetRequest;
import com.taobao.top.request.ItemsInventoryGetRequest;
import com.taobao.top.request.ItemsOnsaleGetRequest;
import com.taobao.top.request.ItemsSearchRequest;
import com.taobao.top.request.LogisticsCompaniesGetRequest;
import com.taobao.top.request.LogisticsOrdersDetailGetRequest;
import com.taobao.top.request.LogisticsOrdersGetRequest;
import com.taobao.top.request.OrdersGetRequest;
import com.taobao.top.request.PostageAddRequest;
import com.taobao.top.request.PostageDeleteRequest;
import com.taobao.top.request.PostageGetRequest;
import com.taobao.top.request.PostageUpdateRequest;
import com.taobao.top.request.PostagesGetRequest;
import com.taobao.top.request.ProductAddRequest;
import com.taobao.top.request.ProductGetRequest;
import com.taobao.top.request.ProductImgDeleteRequest;
import com.taobao.top.request.ProductImgUploadRequest;
import com.taobao.top.request.ProductPropImgDeleteRequest;
import com.taobao.top.request.ProductPropImgUploadRequest;
import com.taobao.top.request.ProductUpdateRequest;
import com.taobao.top.request.ProductsGetRequest;
import com.taobao.top.request.ProductsSearchRequest;
import com.taobao.top.request.RefundGetRequest;
import com.taobao.top.request.RefundMessageAddRequest;
import com.taobao.top.request.RefundMessagesGetRequest;
import com.taobao.top.request.RefundsAppliedGetRequest;
import com.taobao.top.request.RefundsReceivedGetRequest;
import com.taobao.top.request.SellerItemCatAddRequest;
import com.taobao.top.request.SellerItemCatUpdateRequest;
import com.taobao.top.request.SellerItemCatsGetRequest;
import com.taobao.top.request.ShopCatsGetRequest;
import com.taobao.top.request.ShopGetRequest;
import com.taobao.top.request.ShopUpdateRequest;
import com.taobao.top.request.SkusCustomGetRequest;
import com.taobao.top.request.SubappApplyRequest;
import com.taobao.top.request.TaobaokeItemsConvertRequest;
import com.taobao.top.request.TaobaokeItemsGetRequest;
import com.taobao.top.request.TaobaokeListUrlGetRequest;
import com.taobao.top.request.TaobaokeReportGetRequest;
import com.taobao.top.request.TaobaokeShopsConvertRequest;
import com.taobao.top.request.TopRequest;
import com.taobao.top.request.TradeAddRequest;
import com.taobao.top.request.TradeCloseRequest;
import com.taobao.top.request.TradeConfirmFeeGetRequest;
import com.taobao.top.request.TradeDetailGetRequest;
import com.taobao.top.request.TradeGetRequest;
import com.taobao.top.request.TradeMemoAddRequest;
import com.taobao.top.request.TradeMemoUpdateRequest;
import com.taobao.top.request.TradeRateAddRequest;
import com.taobao.top.request.TradeRateBatchAddRequest;
import com.taobao.top.request.TradeRatesGetRequest;
import com.taobao.top.request.TradeSnapshotGetRequest;
import com.taobao.top.request.TradeStatsGetRequest;
import com.taobao.top.request.TradesBoughtGetRequest;
import com.taobao.top.request.TradesGetRequest;
import com.taobao.top.request.TradesSoldGetRequest;
import com.taobao.top.request.TradesSoldIncrementGetRequest;
import com.taobao.top.request.UserGetRequest;
import com.taobao.top.request.UsersGetRequest;

/**
 * TOP基于REST的JSON客户端帮助类。
 * 
 * @author carver.gu
 * @since 1.0, Sep 26, 2009
 */
public class TopJsonRestClient {

	private TopClient client;

	public TopJsonRestClient(String topUrl, String appKey, String appSecret) {
		client = new TopRestClient(topUrl, appKey, appSecret, Constants.FORMAT_JSON);
	}

	/** All PUBLIC TOP APIs **/
	public String getResponse(TopRequest request) throws TopException {
		return client.execute(request, new StringParser());
	}

	/** All PRIVATE TOP APIs **/
	public String getResponse(TopRequest request, String session) throws TopException {
		return client.execute(request, new StringParser(), session);
	}

	/** TOP API: taobao.user.get **/
	public User getUser(UserGetRequest request) throws TopException {
		return client.execute(request, new ObjectJsonParser<User>(User.class));
	}

	/** TOP API: taobao.user.get **/
	public User getUser(UserGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<User>(User.class), session);
	}

	/** TOP API: taobao.users.get **/
	public ResponseList<User> getUsers(UsersGetRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<User>(User.class));
	}

	/** TOP API: taobao.product.get **/
	public Product getProduct(ProductGetRequest request) throws TopException {
		return client.execute(request, new ObjectJsonParser<Product>(Product.class));
	}

	/** TOP API: taobao.products.get **/
	public ResponseList<Product> getProducts(ProductsGetRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Product>(Product.class));
	}

	/** TOP API: taobao.product.add **/
	public Product addProduct(ProductAddRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Product>(Product.class), session);
	}

	/** TOP API: taobao.product.update **/
	public Product updateProduct(ProductUpdateRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Product>(Product.class), session);
	}

	/** TOP API: taobao.products.search **/
	public ResponseList<Product> searchProducts(ProductsSearchRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Product>(Product.class));
	}

	/** TOP API: taobao.product.img.upload **/
	public ProductImg uploadProductImg(ProductImgUploadRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<ProductImg>(ProductImg.class), session);
	}

	/** TOP API: taobao.product.img.delete **/
	public ProductImg deleteProductImg(ProductImgDeleteRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<ProductImg>(ProductImg.class), session);
	}

	/** TOP API: taobao.product.propimg.upload **/
	public ProductPropImg uploadProductPropImg(ProductPropImgUploadRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<ProductPropImg>(ProductPropImg.class), session);
	}

	/** TOP API: taobao.product.propimg.delete **/
	public ProductPropImg deleteProductPropImg(ProductPropImgDeleteRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<ProductPropImg>(ProductPropImg.class), session);
	}

	/** TOP API: taobao.itemprops.get **/
	public ResponseList<ItemProp> getItemProps(ItemPropsGetRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<ItemProp>(ItemProp.class));
	}

	/** TOP API: taobao.itemcats.get **/
	public ResponseList<ItemCat> getItemCats(ItemCatsGetRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<ItemCat>(ItemCat.class));
	}

	/** TOP API: taobao.itempropvalues.get **/
	public ResponseList<PropValue> getItemPropValues(ItemPropValuesGetRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<PropValue>(PropValue.class));
	}

	/** TOP API: taobao.itemcats.list.get **/
	public ResponseList<ItemCat> listItemCats(ItemCatsListRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<ItemCat>(ItemCat.class));
	}

	/** TOP API: taobao.itemprops.list.get **/
	public ResponseList<ItemProp> listItemProps(ItemPropsListRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<ItemProp>(ItemProp.class));
	}

	/** TOP API: taobao.itemprop.list.get **/
	public ItemProp listItemProp(ItemPropListRequest request) throws TopException {
		return client.execute(request, new ObjectJsonParser<ItemProp>(ItemProp.class));
	}

	/** TOP API: taobao.item.get **/
	public Item getItem(ItemGetRequest request) throws TopException {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.item.get **/
	public Item getItem(ItemGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.items.get **/
	public ResponseList<Item> getItems(ItemsGetRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.items.custom.get **/
	public ResponseList<Item> getCustomItems(ItemsCustomGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.items.search **/
	public ItemSearch searchItems(ItemsSearchRequest request) throws TopException {
		return client.execute(request, new ObjectJsonParser<ItemSearch>(ItemSearch.class));
	}

	/** TOP API: taobao.items.onsale.get **/
	public ResponseList<Item> getOnsaleItems(ItemsOnsaleGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.items.inventory.get **/
	public ResponseList<Item> getInventoryItems(ItemsInventoryGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.items.all.get **/
	public ResponseList<Item> getAllItems(ItemsAllGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.update **/
	public Item updateItem(ItemUpdateRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.add **/
	public Item addItem(ItemAddRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.delete **/
	public Item deleteItem(ItemDeleteRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.img.upload **/
	public ItemImg uploadItemImg(ItemImgUploadRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<ItemImg>(ItemImg.class), session);
	}

	/** TOP API: taobao.item.joint.img **/
	public ItemImg jointItemImg(ItemImgJointRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<ItemImg>(ItemImg.class), session);
	}

	/** TOP API: taobao.item.img.delete **/
	public ItemImg deleteItemImg(ItemImgDeleteRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<ItemImg>(ItemImg.class), session);
	}

	/** TOP API: taobao.item.propimg.upload **/
	public PropImg uploadItemPropImg(ItemPropImgUploadRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<PropImg>(PropImg.class), session);
	}

	/** TOP API: taobao.item.propimg.delete **/
	public PropImg deleteItemPropImg(ItemPropImgDeleteRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<PropImg>(PropImg.class), session);
	}

	/** TOP API: taobao.item.sku.get **/
	public Sku getItemSku(ItemSkuGetRequest request) throws TopException {
		return client.execute(request, new ObjectJsonParser<Sku>(Sku.class));
	}

	/** TOP API: taobao.item.skus.get **/
	public ResponseList<Sku> getItemSkus(ItemSkusGetRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Sku>(Sku.class));
	}

	/** TOP API: taobao.skus.custom.get **/
	public ResponseList<Sku> getCustomSkus(SkusCustomGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Sku>(Sku.class), session);
	}

	/** TOP API: taobao.item.sku.add **/
	public Sku addItemSku(ItemSkuAddRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Sku>(Sku.class), session);
	}

	/** TOP API: taobao.item.sku.update **/
	public Sku updateItemSku(ItemSkuUpdateRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Sku>(Sku.class), session);
	}

	/** TOP API: taobao.item.update.listing **/
	public Item enlistItem(ItemEnlistRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.update.delisting **/
	public Item delistItem(ItemDelistRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.recommend.add **/
	public Item addRecommendItem(ItemRecommendAddRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.recommend.delete **/
	public Item deleteRecommendItem(ItemRecommendDeleteRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.postage.get **/
	public Postage getPostage(PostageGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Postage>(Postage.class), session);
	}

	/** TOP API: taobao.postage.add **/
	public Postage addPostage(PostageAddRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Postage>(Postage.class), session);
	}

	/** TOP API: taobao.postage.update **/
	public Postage updatePostage(PostageUpdateRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Postage>(Postage.class), session);
	}

	/** TOP API: taobao.postage.delete **/
	public Postage deletePostage(PostageDeleteRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Postage>(Postage.class), session);
	}

	/** TOP API: taobao.postages.get **/
	public ResponseList<Postage> getPostages(PostagesGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Postage>(Postage.class), session);
	}

	/** TOP API: taobao.taobaoke.items.get **/
	public ResponseList<TaobaokeItem> getTaobaokeItems(TaobaokeItemsGetRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<TaobaokeItem>(TaobaokeItem.class));
	}

	/** TOP API: taobao.taobaoke.report.get **/
	public TaobaokeReport getTaobaokeReport(TaobaokeReportGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<TaobaokeReport>(TaobaokeReport.class), session);
	}

	/** TOP API: taobao.taobaoke.items.convert **/
	public ResponseList<TaobaokeItem> convertTaobaokeItems(TaobaokeItemsConvertRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<TaobaokeItem>(TaobaokeItem.class));
	}

	/** TOP API: taobao.taobaoke.shops.convert **/
	public ResponseList<TaobaokeShop> convertTaobaokeShops(TaobaokeShopsConvertRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<TaobaokeShop>(TaobaokeShop.class));
	}

	/** TOP API: taobao.taobaoke.listurl.get **/
	public String getTaobaokeListUrl(TaobaokeListUrlGetRequest request) throws TopException {
		TaobaokeItem item = client.execute(request, new ObjectJsonParser<TaobaokeItem>(TaobaokeItem.class));
		return item.getPromotionUrl();
	}

	/** TOP API: taobao.trade.nbsadd **/
	public Trade addTrade(TradeAddRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trade.get **/
	public Trade getTrade(TradeGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trade.close **/
	public Trade closeTrade(TradeCloseRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trades.get **/
	public ResponseList<Trade> getTrades(TradesGetRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Trade>(Trade.class));
	}

	/** TOP API: taobao.trade.memo.add **/
	public Trade addTradeMemo(TradeMemoAddRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trade.memo.update **/
	public Trade updateTradeMemo(TradeMemoUpdateRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trade.fullinfo.get **/
	public Trade getTradeDetail(TradeDetailGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trades.bought.get **/
	public ResponseList<Trade> getBoughtTrades(TradesBoughtGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trades.sold.get **/
	public ResponseList<Trade> getSoldTrades(TradesSoldGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trades.sold.increment.get **/
	public ResponseList<Trade> getIncrementSoldTrades(TradesSoldIncrementGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.orders.get **/
	public ResponseList<Order> getOrders(OrdersGetRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Order>(Order.class));
	}

	/** TOP API: taobao.refund.get **/
	public Refund getRefund(RefundGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Refund>(Refund.class), session);
	}

	/** TOP API: taobao.refunds.apply.get **/
	public ResponseList<Refund> getAppliedRefunds(RefundsAppliedGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Refund>(Refund.class), session);
	}

	/** TOP API: taobao.refunds.receive.get **/
	public ResponseList<Refund> getReceivedRefunds(RefundsReceivedGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Refund>(Refund.class), session);
	}

	/** TOP API: taobao.refund.message.add **/
	public RefundMessage addRefundMessage(RefundMessageAddRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<RefundMessage>(RefundMessage.class), session);
	}

	/** TOP API: taobao.refund.messages.get **/
	public ResponseList<RefundMessage> getRefundMessages(RefundMessagesGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<RefundMessage>(RefundMessage.class), session);
	}

	/** TOP API: taobao.trade.confirmfee.get **/
	public ConfirmFee getTradeConfirmFee(TradeConfirmFeeGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<ConfirmFee>(ConfirmFee.class), session);
	}

	/** TOP API: taobao.trade.snapshot.get **/
	public Trade getTradeSnapshot(TradeSnapshotGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.traderate.add **/
	public TradeRate addTradeRate(TradeRateAddRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<TradeRate>(TradeRate.class), session);
	}

	/** TOP API: taobao.traderate.list.add **/
	public TradeRate addBatchTradeRate(TradeRateBatchAddRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<TradeRate>(TradeRate.class), session);
	}

	/** TOP API: taobao.traderates.get **/
	public ResponseList<TradeRate> getTradeRates(TradeRatesGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<TradeRate>(TradeRate.class), session);
	}

	/** TOP API: taobao.areas.get **/
	public ResponseList<Area> getAreas(AreasGetRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<Area>(Area.class));
	}

	/** TOP API: taobao.logistics.companies.get **/
	public ResponseList<LogisticsCompany> getLogisticsCompanies(LogisticsCompaniesGetRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<LogisticsCompany>(LogisticsCompany.class));
	}

	/** TOP API: taobao.logistics.orders.get **/
	public ResponseList<LogisticsOrder> getLogisticsOrders(LogisticsOrdersGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<LogisticsOrder>(LogisticsOrder.class), session);
	}

	/** TOP API: taobao.delivery.send **/
	public LogisticsOrder sendDelivery(DeliverySendRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<LogisticsOrder>(LogisticsOrder.class), session);
	}

	/** TOP API: taobao.logistics.orders.detail.get **/
	public ResponseList<LogisticsOrder> getDetailLogisticsOrders(LogisticsOrdersDetailGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<LogisticsOrder>(LogisticsOrder.class), session);
	}

	/** TOP API: taobao.shipping.addresses.get **/
	public ResponseList<DeliveryAddress> getDeliveryAddresses(DeliveryAddressesGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<DeliveryAddress>(DeliveryAddress.class), session);
	}

	/** TOP API: taobao.shop.get **/
	public Shop getShop(ShopGetRequest request) throws TopException {
		return client.execute(request, new ObjectJsonParser<Shop>(Shop.class));
	}

	/** TOP API: taobao.shop.update **/
	public Shop updateShop(ShopUpdateRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Shop>(Shop.class), session);
	}

	/** TOP API: taobao.shopcats.list.get **/
	public ResponseList<ShopCat> getShopCats(ShopCatsGetRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<ShopCat>(ShopCat.class));
	}

	/** TOP API: taobao.sellercats.list.add **/
	public SellerItemCat addSellerItemCat(SellerItemCatAddRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<SellerItemCat>(SellerItemCat.class), session);
	}

	/** TOP API: taobao.sellercats.list.update **/
	public SellerItemCat updateSellerItemCat(SellerItemCatUpdateRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<SellerItemCat>(SellerItemCat.class), session);
	}

	/** TOP API: taobao.sellercats.list.get **/
	public ResponseList<SellerItemCat> getSellerItemCats(SellerItemCatsGetRequest request) throws TopException {
		return client.execute(request, new ObjectListJsonParser<SellerItemCat>(SellerItemCat.class));
	}

	/** TOP API: taobao.itemstats.get **/
	public ResponseList<ItemStat> getItemStats(ItemStatsGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<ItemStat>(ItemStat.class));
	}

	/** TOP API: taobao.tradestats.get **/
	public ResponseList<TradeStat> getTradeStats(TradeStatsGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<TradeStat>(TradeStat.class));
	}

	/** TOP API: taotao.catstats.get **/
	public ResponseList<CatStat> getCatStats(CatStatsGetRequest request, String session) throws TopException {
		return client.execute(request, new ObjectListJsonParser<CatStat>(CatStat.class));
	}

	/** TOP API: taobao.app.subapp.apply */
	public Tadget applySubapp(SubappApplyRequest request, String session) throws TopException {
		return client.execute(request, new ObjectJsonParser<Tadget>(Tadget.class), session);
	}

}
