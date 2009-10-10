package com.taobao.top;

import com.taobao.top.domain.Area;
import com.taobao.top.domain.CategoryStat;
import com.taobao.top.domain.ConfirmFee;
import com.taobao.top.domain.DeliveryAddress;
import com.taobao.top.domain.Item;
import com.taobao.top.domain.ItemCategory;
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
import com.taobao.top.domain.SellerItemCategory;
import com.taobao.top.domain.Shop;
import com.taobao.top.domain.ShopCategory;
import com.taobao.top.domain.Sku;
import com.taobao.top.domain.TaobaokeItem;
import com.taobao.top.domain.TaobaokeReport;
import com.taobao.top.domain.TaobaokeShop;
import com.taobao.top.domain.Trade;
import com.taobao.top.domain.TradeRate;
import com.taobao.top.domain.TradeStat;
import com.taobao.top.domain.User;
import com.taobao.top.parser.AreaListJsonParser;
import com.taobao.top.parser.CategoryStatListJsonParser;
import com.taobao.top.parser.ConfirmFeeJsonParser;
import com.taobao.top.parser.DeliveryAddressListJsonParser;
import com.taobao.top.parser.ItemCatListJsonParser;
import com.taobao.top.parser.ItemImgJsonParser;
import com.taobao.top.parser.ItemJsonParser;
import com.taobao.top.parser.ItemListJsonParser;
import com.taobao.top.parser.ItemPropJsonParser;
import com.taobao.top.parser.ItemPropListJsonParser;
import com.taobao.top.parser.ItemSearchListJsonParser;
import com.taobao.top.parser.ItemStatListJsonParser;
import com.taobao.top.parser.LogisticsCompanyListJsonParser;
import com.taobao.top.parser.LogisticsOrderJsonParser;
import com.taobao.top.parser.LogisticsOrderListJsonParser;
import com.taobao.top.parser.OrderListJsonParser;
import com.taobao.top.parser.PostageJsonParser;
import com.taobao.top.parser.PostageListJsonParser;
import com.taobao.top.parser.ProductImgJsonParser;
import com.taobao.top.parser.ProductJsonParser;
import com.taobao.top.parser.ProductListJsonParser;
import com.taobao.top.parser.ProductPropImgJsonParser;
import com.taobao.top.parser.PropImgJsonParser;
import com.taobao.top.parser.PropValueListJsonParser;
import com.taobao.top.parser.RefundJsonParser;
import com.taobao.top.parser.RefundListJsonParser;
import com.taobao.top.parser.RefundMessageJsonParser;
import com.taobao.top.parser.RefundMessageListJsonParser;
import com.taobao.top.parser.SellerItemCategoryJsonParser;
import com.taobao.top.parser.SellerItemCategoryListJsonParser;
import com.taobao.top.parser.ShopCategoryListJsonParser;
import com.taobao.top.parser.ShopJsonParser;
import com.taobao.top.parser.SkuJsonParser;
import com.taobao.top.parser.SkuListJsonParser;
import com.taobao.top.parser.StringParser;
import com.taobao.top.parser.TaobaokeItemListJsonParser;
import com.taobao.top.parser.TaobaokeListUrlJsonParser;
import com.taobao.top.parser.TaobaokeReportJsonParser;
import com.taobao.top.parser.TaobaokeShopListJsonParser;
import com.taobao.top.parser.TradeJsonParser;
import com.taobao.top.parser.TradeListJsonParser;
import com.taobao.top.parser.TradeRateJsonParser;
import com.taobao.top.parser.TradeRateListJsonParser;
import com.taobao.top.parser.TradeStatListJsonParser;
import com.taobao.top.parser.UserJsonParser;
import com.taobao.top.parser.UserListJsonParser;
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
import com.taobao.top.request.ItemsInstockGetRequest;
import com.taobao.top.request.ItemsOnsaleGetRequest;
import com.taobao.top.request.ItemsSearchRequest;
import com.taobao.top.request.LogisticsCompaniesGetRequest;
import com.taobao.top.request.LogisticsOrderDetailsGetRequest;
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
		return client.execute(request, new UserJsonParser());
	}

	/** TOP API: taobao.user.get **/
	public User getUser(UserGetRequest request, String session) throws TopException {
		return client.execute(request, new UserJsonParser(), session);
	}

	/** TOP API: taobao.users.get **/
	public ResponseList<User> getUsers(UsersGetRequest request) throws TopException {
		return client.execute(request, new UserListJsonParser());
	}

	/** TOP API: taobao.product.get **/
	public Product getProduct(ProductGetRequest request) throws TopException {
		return client.execute(request, new ProductJsonParser());
	}

	/** TOP API: taobao.products.get **/
	public ResponseList<Product> getProducts(ProductsGetRequest request) throws TopException {
		return client.execute(request, new ProductListJsonParser());
	}

	/** TOP API: taobao.product.add **/
	public Product addProduct(ProductAddRequest request, String session) throws TopException {
		return client.execute(request, new ProductJsonParser(), session);
	}

	/** TOP API: taobao.product.update **/
	public Product updateProduct(ProductUpdateRequest request, String session) throws TopException {
		return client.execute(request, new ProductJsonParser(), session);
	}

	/** TOP API: taobao.products.search **/
	public ResponseList<Product> searchProducts(ProductsSearchRequest request) throws TopException {
		return client.execute(request, new ProductListJsonParser());
	}

	/** TOP API: taobao.product.img.upload **/
	public ProductImg uploadProductImg(ProductImgUploadRequest request, String session) throws TopException {
		return client.execute(request, new ProductImgJsonParser(), session);
	}

	/** TOP API: taobao.product.img.delete **/
	public ProductImg deleteProductImg(ProductImgDeleteRequest request, String session) throws TopException {
		return client.execute(request, new ProductImgJsonParser(), session);
	}

	/** TOP API: taobao.product.propimg.upload **/
	public ProductPropImg uploadProductPropImg(ProductPropImgUploadRequest request, String session) throws TopException {
		return client.execute(request, new ProductPropImgJsonParser(), session);
	}

	/** TOP API: taobao.product.propimg.delete **/
	public ProductPropImg deleteProductPropImg(ProductPropImgDeleteRequest request, String session) throws TopException {
		return client.execute(request, new ProductPropImgJsonParser(), session);
	}

	/** TOP API: taobao.itemprops.get.v2 **/
	public ResponseList<ItemProp> getItemProps(ItemPropsGetRequest request) throws TopException {
		return client.execute(request, new ItemPropListJsonParser());
	}

	/** TOP API: taobao.itemcats.get.v2 **/
	public ResponseList<ItemCategory> getItemCats(ItemCatsGetRequest request) throws TopException {
		return client.execute(request, new ItemCatListJsonParser());
	}

	/** TOP API: taobao.itempropvalues.get **/
	public ResponseList<PropValue> getItemPropValues(ItemPropValuesGetRequest request) throws TopException {
		return client.execute(request, new PropValueListJsonParser());
	}

	/** TOP API: taobao.itemcats.list.get **/
	public ResponseList<ItemCategory> listItemCats(ItemCatsListRequest request) throws TopException {
		return client.execute(request, new ItemCatListJsonParser());
	}

	/** TOP API: taobao.itemprops.list.get **/
	public ResponseList<ItemProp> listItemProps(ItemPropsListRequest request) throws TopException {
		return client.execute(request, new ItemPropListJsonParser());
	}

	/** TOP API: taobao.itemprop.list.get **/
	public ItemProp listItemProp(ItemPropListRequest request) throws TopException {
		return client.execute(request, new ItemPropJsonParser());
	}

	/** TOP API: taobao.item.get **/
	public Item getItem(ItemGetRequest request) throws TopException {
		return client.execute(request, new ItemJsonParser());
	}

	/** TOP API: taobao.items.get **/
	public ResponseList<Item> getItems(ItemsGetRequest request) throws TopException {
		return client.execute(request, new ItemListJsonParser());
	}

	/** TOP API: taobao.fullitems.get **/
	public ResponseList<Item> getCustomItems(ItemsCustomGetRequest request, String session)
			throws TopException {
		return client.execute(request, new ItemListJsonParser(), session);
	}

	/** TOP API: taobao.items.search **/
	public ResponseList<ItemSearch> searchItems(ItemsSearchRequest request) throws TopException {
		return client.execute(request, new ItemSearchListJsonParser());
	}

	/** TOP API: taobao.items.onsale.get **/
	public ResponseList<Item> getOnsaleItems(ItemsOnsaleGetRequest request, String session) throws TopException {
		return client.execute(request, new ItemListJsonParser(), session);
	}

	/** TOP API: taobao.items.instock.get **/
	public ResponseList<Item> getInstockItems(ItemsInstockGetRequest request, String session) throws TopException {
		return client.execute(request, new ItemListJsonParser(), session);
	}

	/** TOP API: taobao.items.all.get **/
	public ResponseList<Item> getAllItems(ItemsAllGetRequest request, String session) throws TopException {
		return client.execute(request, new ItemListJsonParser(), session);
	}

	/** TOP API: taobao.item.update **/
	public Item updateItem(ItemUpdateRequest request, String session) throws TopException {
		return client.execute(request, new ItemJsonParser(), session);
	}

	/** TOP API: taobao.item.add **/
	public Item addItem(ItemAddRequest request, String session) throws TopException {
		return client.execute(request, new ItemJsonParser(), session);
	}

	/** TOP API: taobao.item.delete **/
	public Item deleteItem(ItemDeleteRequest request, String session) throws TopException {
		return client.execute(request, new ItemJsonParser(), session);
	}

	/** TOP API: taobao.item.img.upload **/
	public ItemImg uploadItemImg(ItemImgUploadRequest request, String session) throws TopException {
		return client.execute(request, new ItemImgJsonParser(), session);
	}

	/** TOP API: taobao.item.joint.img **/
	public ItemImg jointItemImg(ItemImgJointRequest request, String session) throws TopException {
		return client.execute(request, new ItemImgJsonParser(), session);
	}

	/** TOP API: taobao.item.img.delete **/
	public ItemImg deleteItemImg(ItemImgDeleteRequest request, String session) throws TopException {
		return client.execute(request, new ItemImgJsonParser(), session);
	}

	/** TOP API: taobao.item.propimg.upload **/
	public PropImg uploadItemPropImg(ItemPropImgUploadRequest request, String session) throws TopException {
		return client.execute(request, new PropImgJsonParser(), session);
	}

	/** TOP API: taobao.item.propimg.delete **/
	public PropImg deleteItemPropImg(ItemPropImgDeleteRequest request, String session) throws TopException {
		return client.execute(request, new PropImgJsonParser(), session);
	}

	/** TOP API: taobao.item.sku.get **/
	public Sku getItemSku(ItemSkuGetRequest request) throws TopException {
		return client.execute(request, new SkuJsonParser());
	}

	/** TOP API: taobao.item.skus.get **/
	public ResponseList<Sku> getItemSkus(ItemSkusGetRequest request) throws TopException {
		return client.execute(request, new SkuListJsonParser());
	}

	/** TOP API: taobao.fullskus.get **/
	public ResponseList<Sku> getCustomSkus(SkusCustomGetRequest request, String session) throws TopException {
		return client.execute(request, new SkuListJsonParser(), session);
	}

	/** TOP API: taobao.item.sku.add **/
	public Sku addItemSku(ItemSkuAddRequest request, String session) throws TopException {
		return client.execute(request, new SkuJsonParser(), session);
	}

	/** TOP API: taobao.item.sku.update **/
	public Sku updateItemSku(ItemSkuUpdateRequest request, String session) throws TopException {
		return client.execute(request, new SkuJsonParser(), session);
	}

	/** TOP API: taobao.item.update.listing **/
	public Item enlistItem(ItemEnlistRequest request, String session) throws TopException {
		return client.execute(request, new ItemJsonParser(), session);
	}

	/** TOP API: taobao.item.update.delisting **/
	public Item delistItem(ItemDelistRequest request, String session) throws TopException {
		return client.execute(request, new ItemJsonParser(), session);
	}

	/** TOP API: taobao.item.update.showcase **/
	public Item addRecommendItem(ItemRecommendAddRequest request, String session) throws TopException {
		return client.execute(request, new ItemJsonParser(), session);
	}

	/** TOP API: taobao.item.update.revokeShowcase **/
	public Item deleteRecommendItem(ItemRecommendDeleteRequest request, String session) throws TopException {
		return client.execute(request, new ItemJsonParser(), session);
	}

	/** TOP API: taobao.postage.get **/
	public Postage getPostage(PostageGetRequest request, String session) throws TopException {
		return client.execute(request, new PostageJsonParser(), session);
	}

	/** TOP API: taobao.postage.add **/
	public Postage addPostage(PostageAddRequest request, String session) throws TopException {
		return client.execute(request, new PostageJsonParser(), session);
	}

	/** TOP API: taobao.postage.update **/
	public Postage updatePostage(PostageUpdateRequest request, String session) throws TopException {
		return client.execute(request, new PostageJsonParser(), session);
	}

	/** TOP API: taobao.postage.delete **/
	public Postage deletePostage(PostageDeleteRequest request, String session) throws TopException {
		return client.execute(request, new PostageJsonParser(), session);
	}

	/** TOP API: taobao.postages.get **/
	public ResponseList<Postage> getPostages(PostagesGetRequest request, String session) throws TopException {
		return client.execute(request, new PostageListJsonParser(), session);
	}

	/** TOP API: taobao.taobaoke.items.get **/
	public ResponseList<TaobaokeItem> getTaobaokeItems(TaobaokeItemsGetRequest request) throws TopException {
		return client.execute(request, new TaobaokeItemListJsonParser());
	}

	/** TOP API: taobao.taobaoke.report.get **/
	public TaobaokeReport getTaobaokeReport(TaobaokeReportGetRequest request, String session) throws TopException {
		return client.execute(request, new TaobaokeReportJsonParser(), session);
	}

	/** TOP API: taobao.taobaoke.items.convert **/
	public ResponseList<TaobaokeItem> convertTaobaokeItems(TaobaokeItemsConvertRequest request) throws TopException {
		return client.execute(request, new TaobaokeItemListJsonParser());
	}

	/** TOP API: taobao.taobaoke.shops.convert **/
	public ResponseList<TaobaokeShop> convertTaobaokeShops(TaobaokeShopsConvertRequest request) throws TopException {
		return client.execute(request, new TaobaokeShopListJsonParser());
	}

	/** TOP API: taobao.taobaoke.listurl.get **/
	public String getTaobaokeListUrl(TaobaokeListUrlGetRequest request) throws TopException {
		return client.execute(request, new TaobaokeListUrlJsonParser());
	}

	/** TOP API: taobao.trade.nbsadd **/
	public Trade addTrade(TradeAddRequest request, String session) throws TopException {
		return client.execute(request, new TradeJsonParser(), session);
	}

	/** TOP API: taobao.trade.get **/
	public Trade getTrade(TradeGetRequest request, String session) throws TopException {
		return client.execute(request, new TradeJsonParser(), session);
	}

	/** TOP API: taobao.trade.close **/
	public Trade closeTrade(TradeCloseRequest request, String session) throws TopException {
		return client.execute(request, new TradeJsonParser(), session);
	}

	/** TOP API: taobao.trades.get **/
	public ResponseList<Trade> getTrades(TradesGetRequest request) throws TopException {
		return client.execute(request, new TradeListJsonParser());
	}

	/** TOP API: taobao.trade.memo.add **/
	public Trade addTradeMemo(TradeMemoAddRequest request, String session) throws TopException {
		return client.execute(request, new TradeJsonParser(), session);
	}

	/** TOP API: taobao.trade.memo.update **/
	public Trade updateTradeMemo(TradeMemoUpdateRequest request, String session) throws TopException {
		return client.execute(request, new TradeJsonParser(), session);
	}

	/** TOP API: taobao.trade.fullinfo.get **/
	public Trade getTradeDetail(TradeDetailGetRequest request, String session) throws TopException {
		return client.execute(request, new TradeJsonParser(), session);
	}

	/** TOP API: taobao.trades.bought.get **/
	public ResponseList<Trade> getBoughtTrades(TradesBoughtGetRequest request, String session) throws TopException {
		return client.execute(request, new TradeListJsonParser(), session);
	}

	/** TOP API: taobao.trades.sold.get **/
	public ResponseList<Trade> getSoldTrades(TradesSoldGetRequest request, String session) throws TopException {
		return client.execute(request, new TradeListJsonParser(), session);
	}

	/** TOP API: taobao.trades.sold.increment.get **/
	public ResponseList<Trade> getIncrementSoldTrades(TradesSoldIncrementGetRequest request, String session) throws TopException {
		return client.execute(request, new TradeListJsonParser(), session);
	}

	/** TOP API: taobao.orders.get **/
	public ResponseList<Order> getOrders(OrdersGetRequest request) throws TopException {
		return client.execute(request, new OrderListJsonParser());
	}

	/** TOP API: taobao.refund.get **/
	public Refund getRefund(RefundGetRequest request, String session) throws TopException {
		return client.execute(request, new RefundJsonParser(), session);
	}

	/** TOP API: taobao.refunds.apply.get **/
	public ResponseList<Refund> getAppliedRefunds(RefundsAppliedGetRequest request, String session) throws TopException {
		return client.execute(request, new RefundListJsonParser(), session);
	}

	/** TOP API: taobao.refunds.receive.get **/
	public ResponseList<Refund> getReceivedRefunds(RefundsReceivedGetRequest request, String session) throws TopException {
		return client.execute(request, new RefundListJsonParser(), session);
	}

	/** TOP API: taobao.refund.message.add **/
	public RefundMessage addRefundMessage(RefundMessageAddRequest request, String session) throws TopException {
		return client.execute(request, new RefundMessageJsonParser(), session);
	}

	/** TOP API: taobao.refund.messages.get **/
	public ResponseList<RefundMessage> getRefundMessages(RefundMessagesGetRequest request, String session) throws TopException {
		return client.execute(request, new RefundMessageListJsonParser(), session);
	}

	/** TOP API: taobao.trade.confirmfee.get **/
	public ConfirmFee getTradeConfirmFee(TradeConfirmFeeGetRequest request, String session) throws TopException {
		return client.execute(request, new ConfirmFeeJsonParser(), session);
	}

	/** TOP API: taobao.traderate.add **/
	public TradeRate addTradeRate(TradeRateAddRequest request, String session) throws TopException {
		return client.execute(request, new TradeRateJsonParser(), session);
	}

	/** TOP API: taobao.traderate.list.add **/
	public TradeRate addBatchTradeRate(TradeRateBatchAddRequest request, String session) throws TopException {
		return client.execute(request, new TradeRateJsonParser(), session);
	}

	/** TOP API: taobao.traderates.get **/
	public ResponseList<TradeRate> getTradeRates(TradeRatesGetRequest request, String session) throws TopException {
		return client.execute(request, new TradeRateListJsonParser(), session);
	}

	/** TOP API: taobao.areas.get **/
	public ResponseList<Area> getAreas(AreasGetRequest request) throws TopException {
		return client.execute(request, new AreaListJsonParser());
	}

	/** TOP API: taobao.logisticcompanies.get **/
	public ResponseList<LogisticsCompany> getLogisticsCompanies(LogisticsCompaniesGetRequest request) throws TopException {
		return client.execute(request, new LogisticsCompanyListJsonParser());
	}

	/** TOP API: taobao.shippings.send.get **/
	public ResponseList<LogisticsOrder> getLogisticsOrders(LogisticsOrdersGetRequest request, String session) throws TopException {
		return client.execute(request, new LogisticsOrderListJsonParser(), session);
	}

	/** TOP API: taobao.delivery.send **/
	public LogisticsOrder sendDelivery(DeliverySendRequest request, String session) throws TopException {
		return client.execute(request, new LogisticsOrderJsonParser(), session);
	}

	/** TOP API: taobao.shippings.send.fullinfo.get **/
	public ResponseList<LogisticsOrder> getLogisticsOrderDetails( LogisticsOrderDetailsGetRequest request, String session) throws TopException {
		return client.execute(request, new LogisticsOrderListJsonParser(), session);
	}

	/** TOP API: taobao.shipping.addresses.get **/
	public ResponseList<DeliveryAddress> getDeliveryAddresses(DeliveryAddressesGetRequest request, String session) throws TopException {
		return client.execute(request, new DeliveryAddressListJsonParser(), session);
	}

	/** TOP API: taobao.shop.get **/
	public Shop getShop(ShopGetRequest request) throws TopException {
		return client.execute(request, new ShopJsonParser());
	}

	/** TOP API: taobao.shop.update **/
	public Shop updateShop(ShopUpdateRequest request, String session) throws TopException {
		return client.execute(request, new ShopJsonParser(), session);
	}

	/** TOP API: taobao.shopcats.list.get **/
	public ResponseList<ShopCategory> getShopCats(ShopCatsGetRequest request) throws TopException {
		return client.execute(request, new ShopCategoryListJsonParser());
	}

	/** TOP API: taobao.sellercats.list.add **/
	public SellerItemCategory addSellerItemCat(SellerItemCatAddRequest request, String session) throws TopException {
		return client.execute(request, new SellerItemCategoryJsonParser(), session);
	}

	/** TOP API: taobao.sellercats.list.update **/
	public SellerItemCategory updateSellerItemCat(SellerItemCatUpdateRequest request, String session) throws TopException {
		return client.execute(request, new SellerItemCategoryJsonParser(), session);
	}

	/** TOP API: taobao.sellercats.list.get **/
	public ResponseList<SellerItemCategory> getSellerItemCats(SellerItemCatsGetRequest request) throws TopException {
		return client.execute(request, new SellerItemCategoryListJsonParser());
	}

	/** TOP API: taobao.itemstats.get **/
	public ResponseList<ItemStat> getItemStats(ItemStatsGetRequest request, String session) throws TopException {
		return client.execute(request, new ItemStatListJsonParser());
	}

	/** TOP API: taobao.tradestats.get **/
	public ResponseList<TradeStat> getTradeStats(TradeStatsGetRequest request, String session) throws TopException {
		return client.execute(request, new TradeStatListJsonParser());
	}

	/** TOP API: taotao.catstats.get **/
	public ResponseList<CategoryStat> getCatStats(CatStatsGetRequest request, String session) throws TopException {
		return client.execute(request, new CategoryStatListJsonParser());
	}

}
