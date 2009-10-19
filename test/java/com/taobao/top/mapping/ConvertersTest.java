package com.taobao.top.mapping;

import java.util.List;

import org.junit.Test;

import com.taobao.top.TopException;
import com.taobao.top.domain.Album;
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
import com.taobao.top.domain.Location;
import com.taobao.top.domain.LogisticsCompany;
import com.taobao.top.domain.LogisticsOrder;
import com.taobao.top.domain.Order;
import com.taobao.top.domain.Postage;
import com.taobao.top.domain.PostageMode;
import com.taobao.top.domain.Product;
import com.taobao.top.domain.ProductImg;
import com.taobao.top.domain.ProductPropImg;
import com.taobao.top.domain.PropImg;
import com.taobao.top.domain.PropValue;
import com.taobao.top.domain.Refund;
import com.taobao.top.domain.RefundMessage;
import com.taobao.top.domain.RefundTimeout;
import com.taobao.top.domain.SellerItemCat;
import com.taobao.top.domain.Shop;
import com.taobao.top.domain.ShopCat;
import com.taobao.top.domain.Sku;
import com.taobao.top.domain.Tadget;
import com.taobao.top.domain.TaobaokeItem;
import com.taobao.top.domain.TaobaokeReport;
import com.taobao.top.domain.TaobaokeReportMember;
import com.taobao.top.domain.TaobaokeShop;
import com.taobao.top.domain.Trade;
import com.taobao.top.domain.TradeRate;
import com.taobao.top.domain.TradeStat;
import com.taobao.top.domain.User;
import com.taobao.top.domain.UserCredit;

public class ConvertersTest {

	@Test
	public void reflectDomain() {
		Reader reader = new Reader() {
			public boolean hasReturnField(Object name) {
				return false;
			}
			public Object getPrimitiveObject(Object name) {
				return null;
			}
			public Object getObject(Object name, Class<?> type) throws TopException {
				return null;
			}
			public List<?> getListObjects(Object name, Class<?> subType) throws TopException {
				return null;
			}
		};

		Converters.convert(Album.class, reader);
		Converters.convert(Area.class, reader);
		Converters.convert(CatStat.class, reader);
		Converters.convert(ConfirmFee.class, reader);
		Converters.convert(DeliveryAddress.class, reader);
		Converters.convert(Item.class, reader);
		Converters.convert(ItemCat.class, reader);
		Converters.convert(ItemImg.class, reader);
		Converters.convert(ItemProp.class, reader);
		Converters.convert(ItemSearch.class, reader);
		Converters.convert(ItemStat.class, reader);
		Converters.convert(Location.class, reader);
		Converters.convert(LogisticsCompany.class, reader);
		Converters.convert(LogisticsOrder.class, reader);
		Converters.convert(Order.class, reader);
		Converters.convert(Postage.class, reader);
		Converters.convert(PostageMode.class, reader);
		Converters.convert(Product.class, reader);
		Converters.convert(ProductImg.class, reader);
		Converters.convert(ProductPropImg.class, reader);
		Converters.convert(PropImg.class, reader);
		Converters.convert(PropValue.class, reader);
		Converters.convert(Refund.class, reader);
		Converters.convert(RefundMessage.class, reader);
		Converters.convert(RefundTimeout.class, reader);
		Converters.convert(SellerItemCat.class, reader);
		Converters.convert(Shop.class, reader);
		Converters.convert(ShopCat.class, reader);
		Converters.convert(Sku.class, reader);
		Converters.convert(Tadget.class, reader);
		Converters.convert(TaobaokeItem.class, reader);
		Converters.convert(TaobaokeReport.class, reader);
		Converters.convert(TaobaokeReportMember.class, reader);
		Converters.convert(TaobaokeShop.class, reader);
		Converters.convert(Trade.class, reader);
		Converters.convert(TradeRate.class, reader);
		Converters.convert(TradeStat.class, reader);
		Converters.convert(User.class, reader);
		Converters.convert(UserCredit.class, reader);
	}

}
