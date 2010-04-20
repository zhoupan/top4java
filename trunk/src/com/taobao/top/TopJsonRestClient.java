package com.taobao.top;

import com.taobao.top.domain.*;
import com.taobao.top.parser.StringParser;
import com.taobao.top.parser.json.ListJsonParser;
import com.taobao.top.parser.json.ObjectJsonParser;
import com.taobao.top.request.*;

/**
 * TOP基于REST的JSON客户端帮助类。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
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

	/** TOP API: taobao.app.subapp.apply **/
	public Tadget appSubappApply(AppSubappApplyRequest request) {
		return client.execute(request, new ObjectJsonParser<Tadget>(Tadget.class));
	}

	/** TOP API: taobao.app.subapp.apply **/
	public Tadget appSubappApply(AppSubappApplyRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Tadget>(Tadget.class), session);
	}

	/** TOP API: taobao.areas.get **/
	public PageList<Area> areasGet(AreasGetRequest request) {
		return client.execute(request, new ListJsonParser<Area>(Area.class));
	}

	/** TOP API: taobao.areas.get **/
	public PageList<Area> areasGet(AreasGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Area>(Area.class), session);
	}

	/** TOP API: taobao.delivery.send **/
	public Shipping deliverySend(DeliverySendRequest request) {
		return client.execute(request, new ObjectJsonParser<Shipping>(Shipping.class));
	}

	/** TOP API: taobao.delivery.send **/
	public Shipping deliverySend(DeliverySendRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Shipping>(Shipping.class), session);
	}

	/** TOP API: taobao.icp.id.submit **/
	public void icpIdSubmit(IcpIdSubmitRequest request) {
		client.execute(request, new StringParser());
	}

	/** TOP API: taobao.icp.id.submit **/
	public void icpIdSubmit(IcpIdSubmitRequest request, String session) {
		client.execute(request, new StringParser(), session);
	}

	/** TOP API: taobao.icp.submit **/
	public void icpSubmit(IcpSubmitRequest request) {
		client.execute(request, new StringParser());
	}

	/** TOP API: taobao.icp.submit **/
	public void icpSubmit(IcpSubmitRequest request, String session) {
		client.execute(request, new StringParser(), session);
	}

	/** TOP API: taobao.item.add **/
	public Item itemAdd(ItemAddRequest request) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.item.add **/
	public Item itemAdd(ItemAddRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.delete **/
	public Item itemDelete(ItemDeleteRequest request) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.item.delete **/
	public Item itemDelete(ItemDeleteRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.game.add **/
	public Item itemGameAdd(ItemGameAddRequest request) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.item.game.add **/
	public Item itemGameAdd(ItemGameAddRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.get **/
	public Item itemGet(ItemGetRequest request) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.item.get **/
	public Item itemGet(ItemGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.img.delete **/
	public ItemImg itemImgDelete(ItemImgDeleteRequest request) {
		return client.execute(request, new ObjectJsonParser<ItemImg>(ItemImg.class));
	}

	/** TOP API: taobao.item.img.delete **/
	public ItemImg itemImgDelete(ItemImgDeleteRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<ItemImg>(ItemImg.class), session);
	}

	/** TOP API: taobao.item.img.upload **/
	public ItemImg itemImgUpload(ItemImgUploadRequest request) {
		return client.execute(request, new ObjectJsonParser<ItemImg>(ItemImg.class));
	}

	/** TOP API: taobao.item.img.upload **/
	public ItemImg itemImgUpload(ItemImgUploadRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<ItemImg>(ItemImg.class), session);
	}

	/** TOP API: taobao.item.joint.img **/
	public ItemImg itemJointImg(ItemJointImgRequest request) {
		return client.execute(request, new ObjectJsonParser<ItemImg>(ItemImg.class));
	}

	/** TOP API: taobao.item.joint.img **/
	public ItemImg itemJointImg(ItemJointImgRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<ItemImg>(ItemImg.class), session);
	}

	/** TOP API: taobao.item.joint.propimg **/
	public PropImg itemJointPropimg(ItemJointPropimgRequest request) {
		return client.execute(request, new ObjectJsonParser<PropImg>(PropImg.class));
	}

	/** TOP API: taobao.item.joint.propimg **/
	public PropImg itemJointPropimg(ItemJointPropimgRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<PropImg>(PropImg.class), session);
	}

	/** TOP API: taobao.item.propimg.delete **/
	public PropImg itemPropimgDelete(ItemPropimgDeleteRequest request) {
		return client.execute(request, new ObjectJsonParser<PropImg>(PropImg.class));
	}

	/** TOP API: taobao.item.propimg.delete **/
	public PropImg itemPropimgDelete(ItemPropimgDeleteRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<PropImg>(PropImg.class), session);
	}

	/** TOP API: taobao.item.propimg.upload **/
	public PropImg itemPropimgUpload(ItemPropimgUploadRequest request) {
		return client.execute(request, new ObjectJsonParser<PropImg>(PropImg.class));
	}

	/** TOP API: taobao.item.propimg.upload **/
	public PropImg itemPropimgUpload(ItemPropimgUploadRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<PropImg>(PropImg.class), session);
	}

	/** TOP API: taobao.item.recommend.add **/
	public Item itemRecommendAdd(ItemRecommendAddRequest request) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.item.recommend.add **/
	public Item itemRecommendAdd(ItemRecommendAddRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.recommend.delete **/
	public Item itemRecommendDelete(ItemRecommendDeleteRequest request) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.item.recommend.delete **/
	public Item itemRecommendDelete(ItemRecommendDeleteRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.sku.add **/
	public Sku itemSkuAdd(ItemSkuAddRequest request) {
		return client.execute(request, new ObjectJsonParser<Sku>(Sku.class));
	}

	/** TOP API: taobao.item.sku.add **/
	public Sku itemSkuAdd(ItemSkuAddRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Sku>(Sku.class), session);
	}

	/** TOP API: taobao.item.sku.delete **/
	public Sku itemSkuDelete(ItemSkuDeleteRequest request) {
		return client.execute(request, new ObjectJsonParser<Sku>(Sku.class));
	}

	/** TOP API: taobao.item.sku.delete **/
	public Sku itemSkuDelete(ItemSkuDeleteRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Sku>(Sku.class), session);
	}

	/** TOP API: taobao.item.sku.get **/
	public Sku itemSkuGet(ItemSkuGetRequest request) {
		return client.execute(request, new ObjectJsonParser<Sku>(Sku.class));
	}

	/** TOP API: taobao.item.sku.get **/
	public Sku itemSkuGet(ItemSkuGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Sku>(Sku.class), session);
	}

	/** TOP API: taobao.item.sku.update **/
	public Sku itemSkuUpdate(ItemSkuUpdateRequest request) {
		return client.execute(request, new ObjectJsonParser<Sku>(Sku.class));
	}

	/** TOP API: taobao.item.sku.update **/
	public Sku itemSkuUpdate(ItemSkuUpdateRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Sku>(Sku.class), session);
	}

	/** TOP API: taobao.item.skus.get **/
	public PageList<Sku> itemSkusGet(ItemSkusGetRequest request) {
		return client.execute(request, new ListJsonParser<Sku>(Sku.class));
	}

	/** TOP API: taobao.item.skus.get **/
	public PageList<Sku> itemSkusGet(ItemSkusGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Sku>(Sku.class), session);
	}

	/** TOP API: taobao.item.update **/
	public Item itemUpdate(ItemUpdateRequest request) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.item.update **/
	public Item itemUpdate(ItemUpdateRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.update.delisting **/
	public Item itemUpdateDelisting(ItemUpdateDelistingRequest request) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.item.update.delisting **/
	public Item itemUpdateDelisting(ItemUpdateDelistingRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.update.listing **/
	public Item itemUpdateListing(ItemUpdateListingRequest request) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.item.update.listing **/
	public Item itemUpdateListing(ItemUpdateListingRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.video.delete **/
	public Video itemVideoDelete(ItemVideoDeleteRequest request) {
		return client.execute(request, new ObjectJsonParser<Video>(Video.class));
	}

	/** TOP API: taobao.item.video.delete **/
	public Video itemVideoDelete(ItemVideoDeleteRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Video>(Video.class), session);
	}

	/** TOP API: taobao.item.video.upload **/
	public Video itemVideoUpload(ItemVideoUploadRequest request) {
		return client.execute(request, new ObjectJsonParser<Video>(Video.class));
	}

	/** TOP API: taobao.item.video.upload **/
	public Video itemVideoUpload(ItemVideoUploadRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Video>(Video.class), session);
	}

	/** TOP API: taobao.item.vip.add **/
	public Item itemVipAdd(ItemVipAddRequest request) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.item.vip.add **/
	public Item itemVipAdd(ItemVipAddRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.item.vip.update **/
	public Item itemVipUpdate(ItemVipUpdateRequest request) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.item.vip.update **/
	public Item itemVipUpdate(ItemVipUpdateRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.itemcat.features.get **/
	public PageList<Feature> itemcatFeaturesGet(ItemcatFeaturesGetRequest request) {
		return client.execute(request, new ListJsonParser<Feature>(Feature.class));
	}

	/** TOP API: taobao.itemcat.features.get **/
	public PageList<Feature> itemcatFeaturesGet(ItemcatFeaturesGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Feature>(Feature.class), session);
	}

	/** TOP API: taobao.itemcats.authorize.get **/
	public SellerAuthorize itemcatsAuthorizeGet(ItemcatsAuthorizeGetRequest request) {
		return client.execute(request, new ObjectJsonParser<SellerAuthorize>(SellerAuthorize.class));
	}

	/** TOP API: taobao.itemcats.authorize.get **/
	public SellerAuthorize itemcatsAuthorizeGet(ItemcatsAuthorizeGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<SellerAuthorize>(SellerAuthorize.class), session);
	}

	/** TOP API: taobao.itemcats.get **/
	public PageList<ItemCat> itemcatsGet(ItemcatsGetRequest request) {
		return client.execute(request, new ListJsonParser<ItemCat>(ItemCat.class));
	}

	/** TOP API: taobao.itemcats.get **/
	public PageList<ItemCat> itemcatsGet(ItemcatsGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<ItemCat>(ItemCat.class), session);
	}

	/** TOP API: taobao.itemextra.add **/
	public ItemExtra itemextraAdd(ItemextraAddRequest request) {
		return client.execute(request, new ObjectJsonParser<ItemExtra>(ItemExtra.class));
	}

	/** TOP API: taobao.itemextra.add **/
	public ItemExtra itemextraAdd(ItemextraAddRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<ItemExtra>(ItemExtra.class), session);
	}

	/** TOP API: taobao.itemextra.get **/
	public ItemExtra itemextraGet(ItemextraGetRequest request) {
		return client.execute(request, new ObjectJsonParser<ItemExtra>(ItemExtra.class));
	}

	/** TOP API: taobao.itemextra.get **/
	public ItemExtra itemextraGet(ItemextraGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<ItemExtra>(ItemExtra.class), session);
	}

	/** TOP API: taobao.itemextra.update **/
	public ItemExtra itemextraUpdate(ItemextraUpdateRequest request) {
		return client.execute(request, new ObjectJsonParser<ItemExtra>(ItemExtra.class));
	}

	/** TOP API: taobao.itemextra.update **/
	public ItemExtra itemextraUpdate(ItemextraUpdateRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<ItemExtra>(ItemExtra.class), session);
	}

	/** TOP API: taobao.itemextras.get **/
	public PageList<ItemExtra> itemextrasGet(ItemextrasGetRequest request) {
		return client.execute(request, new ListJsonParser<ItemExtra>(ItemExtra.class));
	}

	/** TOP API: taobao.itemextras.get **/
	public PageList<ItemExtra> itemextrasGet(ItemextrasGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<ItemExtra>(ItemExtra.class), session);
	}

	/** TOP API: taobao.itemextras.instant.search **/
	public PageList<ItemExtra> itemextrasInstantSearch(ItemextrasInstantSearchRequest request) {
		return client.execute(request, new ListJsonParser<ItemExtra>(ItemExtra.class));
	}

	/** TOP API: taobao.itemextras.instant.search **/
	public PageList<ItemExtra> itemextrasInstantSearch(ItemextrasInstantSearchRequest request, String session) {
		return client.execute(request, new ListJsonParser<ItemExtra>(ItemExtra.class), session);
	}

	/** TOP API: taobao.itemextras.search **/
	public PageList<ItemExtra> itemextrasSearch(ItemextrasSearchRequest request) {
		return client.execute(request, new ListJsonParser<ItemExtra>(ItemExtra.class));
	}

	/** TOP API: taobao.itemextras.search **/
	public PageList<ItemExtra> itemextrasSearch(ItemextrasSearchRequest request, String session) {
		return client.execute(request, new ListJsonParser<ItemExtra>(ItemExtra.class), session);
	}

	/** TOP API: taobao.itemprops.get **/
	public PageList<ItemProp> itempropsGet(ItempropsGetRequest request) {
		return client.execute(request, new ListJsonParser<ItemProp>(ItemProp.class));
	}

	/** TOP API: taobao.itemprops.get **/
	public PageList<ItemProp> itempropsGet(ItempropsGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<ItemProp>(ItemProp.class), session);
	}

	/** TOP API: taobao.itemprops.vertical.get **/
	public PageList<ItemVerticalProp> itempropsVerticalGet(ItempropsVerticalGetRequest request) {
		return client.execute(request, new ListJsonParser<ItemVerticalProp>(ItemVerticalProp.class));
	}

	/** TOP API: taobao.itemprops.vertical.get **/
	public PageList<ItemVerticalProp> itempropsVerticalGet(ItempropsVerticalGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<ItemVerticalProp>(ItemVerticalProp.class), session);
	}

	/** TOP API: taobao.itempropvalues.get **/
	public PageList<PropValue> itempropvaluesGet(ItempropvaluesGetRequest request) {
		return client.execute(request, new ListJsonParser<PropValue>(PropValue.class));
	}

	/** TOP API: taobao.itempropvalues.get **/
	public PageList<PropValue> itempropvaluesGet(ItempropvaluesGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<PropValue>(PropValue.class), session);
	}

	/** TOP API: taobao.items.all.get **/
	public PageList<Item> itemsAllGet(ItemsAllGetRequest request) {
		return client.execute(request, new ListJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.items.all.get **/
	public PageList<Item> itemsAllGet(ItemsAllGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.items.custom.get **/
	public PageList<Item> itemsCustomGet(ItemsCustomGetRequest request) {
		return client.execute(request, new ListJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.items.custom.get **/
	public PageList<Item> itemsCustomGet(ItemsCustomGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.items.download **/
	public PageList<Item> itemsDownload(ItemsDownloadRequest request) {
		return client.execute(request, new ListJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.items.download **/
	public PageList<Item> itemsDownload(ItemsDownloadRequest request, String session) {
		return client.execute(request, new ListJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.items.get **/
	public PageList<Item> itemsGet(ItemsGetRequest request) {
		return client.execute(request, new ListJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.items.get **/
	public PageList<Item> itemsGet(ItemsGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.items.inventory.get **/
	public PageList<Item> itemsInventoryGet(ItemsInventoryGetRequest request) {
		return client.execute(request, new ListJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.items.inventory.get **/
	public PageList<Item> itemsInventoryGet(ItemsInventoryGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.items.list.get **/
	public PageList<Item> itemsListGet(ItemsListGetRequest request) {
		return client.execute(request, new ListJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.items.list.get **/
	public PageList<Item> itemsListGet(ItemsListGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.items.onsale.get **/
	public PageList<Item> itemsOnsaleGet(ItemsOnsaleGetRequest request) {
		return client.execute(request, new ListJsonParser<Item>(Item.class));
	}

	/** TOP API: taobao.items.onsale.get **/
	public PageList<Item> itemsOnsaleGet(ItemsOnsaleGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Item>(Item.class), session);
	}

	/** TOP API: taobao.items.search **/
	public ItemSearch itemsSearch(ItemsSearchRequest request) {
		return client.execute(request, new ObjectJsonParser<ItemSearch>(ItemSearch.class));
	}

	/** TOP API: taobao.items.search **/
	public ItemSearch itemsSearch(ItemsSearchRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<ItemSearch>(ItemSearch.class), session);
	}

	/** TOP API: taobao.logistics.companies.get **/
	public PageList<LogisticsCompany> logisticsCompaniesGet(LogisticsCompaniesGetRequest request) {
		return client.execute(request, new ListJsonParser<LogisticsCompany>(LogisticsCompany.class));
	}

	/** TOP API: taobao.logistics.companies.get **/
	public PageList<LogisticsCompany> logisticsCompaniesGet(LogisticsCompaniesGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<LogisticsCompany>(LogisticsCompany.class), session);
	}

	/** TOP API: taobao.logistics.orders.detail.get **/
	public PageList<Shipping> logisticsOrdersDetailGet(LogisticsOrdersDetailGetRequest request) {
		return client.execute(request, new ListJsonParser<Shipping>(Shipping.class));
	}

	/** TOP API: taobao.logistics.orders.detail.get **/
	public PageList<Shipping> logisticsOrdersDetailGet(LogisticsOrdersDetailGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Shipping>(Shipping.class), session);
	}

	/** TOP API: taobao.logistics.orders.get **/
	public PageList<Shipping> logisticsOrdersGet(LogisticsOrdersGetRequest request) {
		return client.execute(request, new ListJsonParser<Shipping>(Shipping.class));
	}

	/** TOP API: taobao.logistics.orders.get **/
	public PageList<Shipping> logisticsOrdersGet(LogisticsOrdersGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Shipping>(Shipping.class), session);
	}

	/** TOP API: taobao.notify.app.subscribe **/
	public SubscribeMessage notifyAppSubscribe(NotifyAppSubscribeRequest request) {
		return client.execute(request, new ObjectJsonParser<SubscribeMessage>(SubscribeMessage.class));
	}

	/** TOP API: taobao.notify.app.subscribe **/
	public SubscribeMessage notifyAppSubscribe(NotifyAppSubscribeRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<SubscribeMessage>(SubscribeMessage.class), session);
	}

	/** TOP API: taobao.notify.authorizemessages.get **/
	public PageList<AuthorizeMessage> notifyAuthorizemessagesGet(NotifyAuthorizemessagesGetRequest request) {
		return client.execute(request, new ListJsonParser<AuthorizeMessage>(AuthorizeMessage.class));
	}

	/** TOP API: taobao.notify.authorizemessages.get **/
	public PageList<AuthorizeMessage> notifyAuthorizemessagesGet(NotifyAuthorizemessagesGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<AuthorizeMessage>(AuthorizeMessage.class), session);
	}

	/** TOP API: taobao.notify.items.get **/
	public PageList<NotifyItem> notifyItemsGet(NotifyItemsGetRequest request) {
		return client.execute(request, new ListJsonParser<NotifyItem>(NotifyItem.class));
	}

	/** TOP API: taobao.notify.items.get **/
	public PageList<NotifyItem> notifyItemsGet(NotifyItemsGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<NotifyItem>(NotifyItem.class), session);
	}

	/** TOP API: taobao.notify.refunds.get **/
	public PageList<NotifyRefund> notifyRefundsGet(NotifyRefundsGetRequest request) {
		return client.execute(request, new ListJsonParser<NotifyRefund>(NotifyRefund.class));
	}

	/** TOP API: taobao.notify.refunds.get **/
	public PageList<NotifyRefund> notifyRefundsGet(NotifyRefundsGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<NotifyRefund>(NotifyRefund.class), session);
	}

	/** TOP API: taobao.notify.subscribemessage.get **/
	public SubscribeMessage notifySubscribemessageGet(NotifySubscribemessageGetRequest request) {
		return client.execute(request, new ObjectJsonParser<SubscribeMessage>(SubscribeMessage.class));
	}

	/** TOP API: taobao.notify.subscribemessage.get **/
	public SubscribeMessage notifySubscribemessageGet(NotifySubscribemessageGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<SubscribeMessage>(SubscribeMessage.class), session);
	}

	/** TOP API: taobao.notify.trades.get **/
	public PageList<NotifyTrade> notifyTradesGet(NotifyTradesGetRequest request) {
		return client.execute(request, new ListJsonParser<NotifyTrade>(NotifyTrade.class));
	}

	/** TOP API: taobao.notify.trades.get **/
	public PageList<NotifyTrade> notifyTradesGet(NotifyTradesGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<NotifyTrade>(NotifyTrade.class), session);
	}

	/** TOP API: taobao.notify.user.authorize **/
	public AuthorizeMessage notifyUserAuthorize(NotifyUserAuthorizeRequest request) {
		return client.execute(request, new ObjectJsonParser<AuthorizeMessage>(AuthorizeMessage.class));
	}

	/** TOP API: taobao.notify.user.authorize **/
	public AuthorizeMessage notifyUserAuthorize(NotifyUserAuthorizeRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<AuthorizeMessage>(AuthorizeMessage.class), session);
	}

	/** TOP API: taobao.picture.category.add **/
	public void pictureCategoryAdd(PictureCategoryAddRequest request) {
		client.execute(request, new StringParser());
	}

	/** TOP API: taobao.picture.category.add **/
	public void pictureCategoryAdd(PictureCategoryAddRequest request, String session) {
		client.execute(request, new StringParser(), session);
	}

	/** TOP API: taobao.picture.category.get **/
	public PageList<PictureCategory> pictureCategoryGet(PictureCategoryGetRequest request) {
		return client.execute(request, new ListJsonParser<PictureCategory>(PictureCategory.class));
	}

	/** TOP API: taobao.picture.category.get **/
	public PageList<PictureCategory> pictureCategoryGet(PictureCategoryGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<PictureCategory>(PictureCategory.class), session);
	}

	/** TOP API: taobao.picture.delete **/
	public void pictureDelete(PictureDeleteRequest request) {
		client.execute(request, new StringParser());
	}

	/** TOP API: taobao.picture.delete **/
	public void pictureDelete(PictureDeleteRequest request, String session) {
		client.execute(request, new StringParser(), session);
	}

	/** TOP API: taobao.picture.get **/
	public PageList<Picture> pictureGet(PictureGetRequest request) {
		return client.execute(request, new ListJsonParser<Picture>(Picture.class));
	}

	/** TOP API: taobao.picture.get **/
	public PageList<Picture> pictureGet(PictureGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Picture>(Picture.class), session);
	}

	/** TOP API: taobao.picture.upload **/
	public void pictureUpload(PictureUploadRequest request) {
		client.execute(request, new StringParser());
	}

	/** TOP API: taobao.picture.upload **/
	public void pictureUpload(PictureUploadRequest request, String session) {
		client.execute(request, new StringParser(), session);
	}

	/** TOP API: taobao.postage.add **/
	public Postage postageAdd(PostageAddRequest request) {
		return client.execute(request, new ObjectJsonParser<Postage>(Postage.class));
	}

	/** TOP API: taobao.postage.add **/
	public Postage postageAdd(PostageAddRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Postage>(Postage.class), session);
	}

	/** TOP API: taobao.postage.delete **/
	public Postage postageDelete(PostageDeleteRequest request) {
		return client.execute(request, new ObjectJsonParser<Postage>(Postage.class));
	}

	/** TOP API: taobao.postage.delete **/
	public Postage postageDelete(PostageDeleteRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Postage>(Postage.class), session);
	}

	/** TOP API: taobao.postage.get **/
	public Postage postageGet(PostageGetRequest request) {
		return client.execute(request, new ObjectJsonParser<Postage>(Postage.class));
	}

	/** TOP API: taobao.postage.get **/
	public Postage postageGet(PostageGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Postage>(Postage.class), session);
	}

	/** TOP API: taobao.postage.update **/
	public Postage postageUpdate(PostageUpdateRequest request) {
		return client.execute(request, new ObjectJsonParser<Postage>(Postage.class));
	}

	/** TOP API: taobao.postage.update **/
	public Postage postageUpdate(PostageUpdateRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Postage>(Postage.class), session);
	}

	/** TOP API: taobao.postages.get **/
	public PageList<Postage> postagesGet(PostagesGetRequest request) {
		return client.execute(request, new ListJsonParser<Postage>(Postage.class));
	}

	/** TOP API: taobao.postages.get **/
	public PageList<Postage> postagesGet(PostagesGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Postage>(Postage.class), session);
	}

	/** TOP API: taobao.product.add **/
	public Product productAdd(ProductAddRequest request) {
		return client.execute(request, new ObjectJsonParser<Product>(Product.class));
	}

	/** TOP API: taobao.product.add **/
	public Product productAdd(ProductAddRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Product>(Product.class), session);
	}

	/** TOP API: taobao.product.get **/
	public Product productGet(ProductGetRequest request) {
		return client.execute(request, new ObjectJsonParser<Product>(Product.class));
	}

	/** TOP API: taobao.product.get **/
	public Product productGet(ProductGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Product>(Product.class), session);
	}

	/** TOP API: taobao.product.img.delete **/
	public ProductImg productImgDelete(ProductImgDeleteRequest request) {
		return client.execute(request, new ObjectJsonParser<ProductImg>(ProductImg.class));
	}

	/** TOP API: taobao.product.img.delete **/
	public ProductImg productImgDelete(ProductImgDeleteRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<ProductImg>(ProductImg.class), session);
	}

	/** TOP API: taobao.product.img.upload **/
	public ProductImg productImgUpload(ProductImgUploadRequest request) {
		return client.execute(request, new ObjectJsonParser<ProductImg>(ProductImg.class));
	}

	/** TOP API: taobao.product.img.upload **/
	public ProductImg productImgUpload(ProductImgUploadRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<ProductImg>(ProductImg.class), session);
	}

	/** TOP API: taobao.product.propimg.delete **/
	public ProductPropImg productPropimgDelete(ProductPropimgDeleteRequest request) {
		return client.execute(request, new ObjectJsonParser<ProductPropImg>(ProductPropImg.class));
	}

	/** TOP API: taobao.product.propimg.delete **/
	public ProductPropImg productPropimgDelete(ProductPropimgDeleteRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<ProductPropImg>(ProductPropImg.class), session);
	}

	/** TOP API: taobao.product.propimg.upload **/
	public ProductPropImg productPropimgUpload(ProductPropimgUploadRequest request) {
		return client.execute(request, new ObjectJsonParser<ProductPropImg>(ProductPropImg.class));
	}

	/** TOP API: taobao.product.propimg.upload **/
	public ProductPropImg productPropimgUpload(ProductPropimgUploadRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<ProductPropImg>(ProductPropImg.class), session);
	}

	/** TOP API: taobao.product.update **/
	public Product productUpdate(ProductUpdateRequest request) {
		return client.execute(request, new ObjectJsonParser<Product>(Product.class));
	}

	/** TOP API: taobao.product.update **/
	public Product productUpdate(ProductUpdateRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Product>(Product.class), session);
	}

	/** TOP API: taobao.products.get **/
	public PageList<Product> productsGet(ProductsGetRequest request) {
		return client.execute(request, new ListJsonParser<Product>(Product.class));
	}

	/** TOP API: taobao.products.get **/
	public PageList<Product> productsGet(ProductsGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Product>(Product.class), session);
	}

	/** TOP API: taobao.products.search **/
	public PageList<Product> productsSearch(ProductsSearchRequest request) {
		return client.execute(request, new ListJsonParser<Product>(Product.class));
	}

	/** TOP API: taobao.products.search **/
	public PageList<Product> productsSearch(ProductsSearchRequest request, String session) {
		return client.execute(request, new ListJsonParser<Product>(Product.class), session);
	}

	/** TOP API: taobao.refund.get **/
	public Refund refundGet(RefundGetRequest request) {
		return client.execute(request, new ObjectJsonParser<Refund>(Refund.class));
	}

	/** TOP API: taobao.refund.get **/
	public Refund refundGet(RefundGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Refund>(Refund.class), session);
	}

	/** TOP API: taobao.refund.message.add **/
	public RefundMessage refundMessageAdd(RefundMessageAddRequest request) {
		return client.execute(request, new ObjectJsonParser<RefundMessage>(RefundMessage.class));
	}

	/** TOP API: taobao.refund.message.add **/
	public RefundMessage refundMessageAdd(RefundMessageAddRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<RefundMessage>(RefundMessage.class), session);
	}

	/** TOP API: taobao.refund.messages.get **/
	public PageList<RefundMessage> refundMessagesGet(RefundMessagesGetRequest request) {
		return client.execute(request, new ListJsonParser<RefundMessage>(RefundMessage.class));
	}

	/** TOP API: taobao.refund.messages.get **/
	public PageList<RefundMessage> refundMessagesGet(RefundMessagesGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<RefundMessage>(RefundMessage.class), session);
	}

	/** TOP API: taobao.refunds.apply.get **/
	public PageList<Refund> refundsApplyGet(RefundsApplyGetRequest request) {
		return client.execute(request, new ListJsonParser<Refund>(Refund.class));
	}

	/** TOP API: taobao.refunds.apply.get **/
	public PageList<Refund> refundsApplyGet(RefundsApplyGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Refund>(Refund.class), session);
	}

	/** TOP API: taobao.refunds.receive.get **/
	public PageList<Refund> refundsReceiveGet(RefundsReceiveGetRequest request) {
		return client.execute(request, new ListJsonParser<Refund>(Refund.class));
	}

	/** TOP API: taobao.refunds.receive.get **/
	public PageList<Refund> refundsReceiveGet(RefundsReceiveGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Refund>(Refund.class), session);
	}

	/** TOP API: taobao.sellercats.list.add **/
	public SellerCat sellercatsListAdd(SellercatsListAddRequest request) {
		return client.execute(request, new ObjectJsonParser<SellerCat>(SellerCat.class));
	}

	/** TOP API: taobao.sellercats.list.add **/
	public SellerCat sellercatsListAdd(SellercatsListAddRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<SellerCat>(SellerCat.class), session);
	}

	/** TOP API: taobao.sellercats.list.get **/
	public PageList<SellerCat> sellercatsListGet(SellercatsListGetRequest request) {
		return client.execute(request, new ListJsonParser<SellerCat>(SellerCat.class));
	}

	/** TOP API: taobao.sellercats.list.get **/
	public PageList<SellerCat> sellercatsListGet(SellercatsListGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<SellerCat>(SellerCat.class), session);
	}

	/** TOP API: taobao.sellercats.list.update **/
	public SellerCat sellercatsListUpdate(SellercatsListUpdateRequest request) {
		return client.execute(request, new ObjectJsonParser<SellerCat>(SellerCat.class));
	}

	/** TOP API: taobao.sellercats.list.update **/
	public SellerCat sellercatsListUpdate(SellercatsListUpdateRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<SellerCat>(SellerCat.class), session);
	}

	/** TOP API: taobao.shipping.addresses.get **/
	public PageList<ShippingAddress> shippingAddressesGet(ShippingAddressesGetRequest request) {
		return client.execute(request, new ListJsonParser<ShippingAddress>(ShippingAddress.class));
	}

	/** TOP API: taobao.shipping.addresses.get **/
	public PageList<ShippingAddress> shippingAddressesGet(ShippingAddressesGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<ShippingAddress>(ShippingAddress.class), session);
	}

	/** TOP API: taobao.shop.get **/
	public Shop shopGet(ShopGetRequest request) {
		return client.execute(request, new ObjectJsonParser<Shop>(Shop.class));
	}

	/** TOP API: taobao.shop.get **/
	public Shop shopGet(ShopGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Shop>(Shop.class), session);
	}

	/** TOP API: taobao.shop.remainshowcase.get **/
	public Shop shopRemainshowcaseGet(ShopRemainshowcaseGetRequest request) {
		return client.execute(request, new ObjectJsonParser<Shop>(Shop.class));
	}

	/** TOP API: taobao.shop.remainshowcase.get **/
	public Shop shopRemainshowcaseGet(ShopRemainshowcaseGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Shop>(Shop.class), session);
	}

	/** TOP API: taobao.shop.update **/
	public Shop shopUpdate(ShopUpdateRequest request) {
		return client.execute(request, new ObjectJsonParser<Shop>(Shop.class));
	}

	/** TOP API: taobao.shop.update **/
	public Shop shopUpdate(ShopUpdateRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Shop>(Shop.class), session);
	}

	/** TOP API: taobao.shopcats.list.get **/
	public PageList<ShopCat> shopcatsListGet(ShopcatsListGetRequest request) {
		return client.execute(request, new ListJsonParser<ShopCat>(ShopCat.class));
	}

	/** TOP API: taobao.shopcats.list.get **/
	public PageList<ShopCat> shopcatsListGet(ShopcatsListGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<ShopCat>(ShopCat.class), session);
	}

	/** TOP API: taobao.skus.custom.get **/
	public PageList<Sku> skusCustomGet(SkusCustomGetRequest request) {
		return client.execute(request, new ListJsonParser<Sku>(Sku.class));
	}

	/** TOP API: taobao.skus.custom.get **/
	public PageList<Sku> skusCustomGet(SkusCustomGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Sku>(Sku.class), session);
	}

	/** TOP API: taobao.suites.get **/
	public PageList<Suite> suitesGet(SuitesGetRequest request) {
		return client.execute(request, new ListJsonParser<Suite>(Suite.class));
	}

	/** TOP API: taobao.suites.get **/
	public PageList<Suite> suitesGet(SuitesGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Suite>(Suite.class), session);
	}

	/** TOP API: taobao.taobaoke.caturl.get **/
	public TaobaokeItem taobaokeCaturlGet(TaobaokeCaturlGetRequest request) {
		return client.execute(request, new ObjectJsonParser<TaobaokeItem>(TaobaokeItem.class));
	}

	/** TOP API: taobao.taobaoke.caturl.get **/
	public TaobaokeItem taobaokeCaturlGet(TaobaokeCaturlGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<TaobaokeItem>(TaobaokeItem.class), session);
	}

	/** TOP API: taobao.taobaoke.items.convert **/
	public PageList<TaobaokeItem> taobaokeItemsConvert(TaobaokeItemsConvertRequest request) {
		return client.execute(request, new ListJsonParser<TaobaokeItem>(TaobaokeItem.class));
	}

	/** TOP API: taobao.taobaoke.items.convert **/
	public PageList<TaobaokeItem> taobaokeItemsConvert(TaobaokeItemsConvertRequest request, String session) {
		return client.execute(request, new ListJsonParser<TaobaokeItem>(TaobaokeItem.class), session);
	}

	/** TOP API: taobao.taobaoke.items.detail.get **/
	public PageList<TaobaokeItemDetail> taobaokeItemsDetailGet(TaobaokeItemsDetailGetRequest request) {
		return client.execute(request, new ListJsonParser<TaobaokeItemDetail>(TaobaokeItemDetail.class));
	}

	/** TOP API: taobao.taobaoke.items.detail.get **/
	public PageList<TaobaokeItemDetail> taobaokeItemsDetailGet(TaobaokeItemsDetailGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<TaobaokeItemDetail>(TaobaokeItemDetail.class), session);
	}

	/** TOP API: taobao.taobaoke.items.get **/
	public PageList<TaobaokeItem> taobaokeItemsGet(TaobaokeItemsGetRequest request) {
		return client.execute(request, new ListJsonParser<TaobaokeItem>(TaobaokeItem.class));
	}

	/** TOP API: taobao.taobaoke.items.get **/
	public PageList<TaobaokeItem> taobaokeItemsGet(TaobaokeItemsGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<TaobaokeItem>(TaobaokeItem.class), session);
	}

	/** TOP API: taobao.taobaoke.listurl.get **/
	public TaobaokeItem taobaokeListurlGet(TaobaokeListurlGetRequest request) {
		return client.execute(request, new ObjectJsonParser<TaobaokeItem>(TaobaokeItem.class));
	}

	/** TOP API: taobao.taobaoke.listurl.get **/
	public TaobaokeItem taobaokeListurlGet(TaobaokeListurlGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<TaobaokeItem>(TaobaokeItem.class), session);
	}

	/** TOP API: taobao.taobaoke.report.get **/
	public TaobaokeReport taobaokeReportGet(TaobaokeReportGetRequest request) {
		return client.execute(request, new ObjectJsonParser<TaobaokeReport>(TaobaokeReport.class));
	}

	/** TOP API: taobao.taobaoke.report.get **/
	public TaobaokeReport taobaokeReportGet(TaobaokeReportGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<TaobaokeReport>(TaobaokeReport.class), session);
	}

	/** TOP API: taobao.taobaoke.shops.convert **/
	public PageList<TaobaokeShop> taobaokeShopsConvert(TaobaokeShopsConvertRequest request) {
		return client.execute(request, new ListJsonParser<TaobaokeShop>(TaobaokeShop.class));
	}

	/** TOP API: taobao.taobaoke.shops.convert **/
	public PageList<TaobaokeShop> taobaokeShopsConvert(TaobaokeShopsConvertRequest request, String session) {
		return client.execute(request, new ListJsonParser<TaobaokeShop>(TaobaokeShop.class), session);
	}

	/** TOP API: taobao.trade.close **/
	public Trade tradeClose(TradeCloseRequest request) {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class));
	}

	/** TOP API: taobao.trade.close **/
	public Trade tradeClose(TradeCloseRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trade.confirmfee.get **/
	public TradeConfirmFee tradeConfirmfeeGet(TradeConfirmfeeGetRequest request) {
		return client.execute(request, new ObjectJsonParser<TradeConfirmFee>(TradeConfirmFee.class));
	}

	/** TOP API: taobao.trade.confirmfee.get **/
	public TradeConfirmFee tradeConfirmfeeGet(TradeConfirmfeeGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<TradeConfirmFee>(TradeConfirmFee.class), session);
	}

	/** TOP API: taobao.trade.fullinfo.get **/
	public Trade tradeFullinfoGet(TradeFullinfoGetRequest request) {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class));
	}

	/** TOP API: taobao.trade.fullinfo.get **/
	public Trade tradeFullinfoGet(TradeFullinfoGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trade.get **/
	public Trade tradeGet(TradeGetRequest request) {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class));
	}

	/** TOP API: taobao.trade.get **/
	public Trade tradeGet(TradeGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trade.memo.add **/
	public Trade tradeMemoAdd(TradeMemoAddRequest request) {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class));
	}

	/** TOP API: taobao.trade.memo.add **/
	public Trade tradeMemoAdd(TradeMemoAddRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trade.memo.update **/
	public Trade tradeMemoUpdate(TradeMemoUpdateRequest request) {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class));
	}

	/** TOP API: taobao.trade.memo.update **/
	public Trade tradeMemoUpdate(TradeMemoUpdateRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trade.ordersku.update **/
	public Order tradeOrderskuUpdate(TradeOrderskuUpdateRequest request) {
		return client.execute(request, new ObjectJsonParser<Order>(Order.class));
	}

	/** TOP API: taobao.trade.ordersku.update **/
	public Order tradeOrderskuUpdate(TradeOrderskuUpdateRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Order>(Order.class), session);
	}

	/** TOP API: taobao.trade.shippingaddress.update **/
	public Trade tradeShippingaddressUpdate(TradeShippingaddressUpdateRequest request) {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class));
	}

	/** TOP API: taobao.trade.shippingaddress.update **/
	public Trade tradeShippingaddressUpdate(TradeShippingaddressUpdateRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trade.snapshot.get **/
	public Trade tradeSnapshotGet(TradeSnapshotGetRequest request) {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class));
	}

	/** TOP API: taobao.trade.snapshot.get **/
	public Trade tradeSnapshotGet(TradeSnapshotGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.traderate.add **/
	public TradeRate traderateAdd(TraderateAddRequest request) {
		return client.execute(request, new ObjectJsonParser<TradeRate>(TradeRate.class));
	}

	/** TOP API: taobao.traderate.add **/
	public TradeRate traderateAdd(TraderateAddRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<TradeRate>(TradeRate.class), session);
	}

	/** TOP API: taobao.traderate.list.add **/
	public TradeRate traderateListAdd(TraderateListAddRequest request) {
		return client.execute(request, new ObjectJsonParser<TradeRate>(TradeRate.class));
	}

	/** TOP API: taobao.traderate.list.add **/
	public TradeRate traderateListAdd(TraderateListAddRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<TradeRate>(TradeRate.class), session);
	}

	/** TOP API: taobao.traderates.get **/
	public PageList<TradeRate> traderatesGet(TraderatesGetRequest request) {
		return client.execute(request, new ListJsonParser<TradeRate>(TradeRate.class));
	}

	/** TOP API: taobao.traderates.get **/
	public PageList<TradeRate> traderatesGet(TraderatesGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<TradeRate>(TradeRate.class), session);
	}

	/** TOP API: taobao.trades.bought.get **/
	public PageList<Trade> tradesBoughtGet(TradesBoughtGetRequest request) {
		return client.execute(request, new ListJsonParser<Trade>(Trade.class));
	}

	/** TOP API: taobao.trades.bought.get **/
	public PageList<Trade> tradesBoughtGet(TradesBoughtGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trades.get **/
	public PageList<Trade> tradesGet(TradesGetRequest request) {
		return client.execute(request, new ListJsonParser<Trade>(Trade.class));
	}

	/** TOP API: taobao.trades.get **/
	public PageList<Trade> tradesGet(TradesGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trades.sold.get **/
	public PageList<Trade> tradesSoldGet(TradesSoldGetRequest request) {
		return client.execute(request, new ListJsonParser<Trade>(Trade.class));
	}

	/** TOP API: taobao.trades.sold.get **/
	public PageList<Trade> tradesSoldGet(TradesSoldGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.trades.sold.increment.get **/
	public PageList<Trade> tradesSoldIncrementGet(TradesSoldIncrementGetRequest request) {
		return client.execute(request, new ListJsonParser<Trade>(Trade.class));
	}

	/** TOP API: taobao.trades.sold.increment.get **/
	public PageList<Trade> tradesSoldIncrementGet(TradesSoldIncrementGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<Trade>(Trade.class), session);
	}

	/** TOP API: taobao.user.detail.get **/
	public User userDetailGet(UserDetailGetRequest request) {
		return client.execute(request, new ObjectJsonParser<User>(User.class));
	}

	/** TOP API: taobao.user.detail.get **/
	public User userDetailGet(UserDetailGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<User>(User.class), session);
	}

	/** TOP API: taobao.user.get **/
	public User userGet(UserGetRequest request) {
		return client.execute(request, new ObjectJsonParser<User>(User.class));
	}

	/** TOP API: taobao.user.get **/
	public User userGet(UserGetRequest request, String session) {
		return client.execute(request, new ObjectJsonParser<User>(User.class), session);
	}

	/** TOP API: taobao.users.get **/
	public PageList<User> usersGet(UsersGetRequest request) {
		return client.execute(request, new ListJsonParser<User>(User.class));
	}

	/** TOP API: taobao.users.get **/
	public PageList<User> usersGet(UsersGetRequest request, String session) {
		return client.execute(request, new ListJsonParser<User>(User.class), session);
	}

}
