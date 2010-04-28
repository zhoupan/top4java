package com.taobao.top.request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.add
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemAddRequest implements TopUploadRequest {

	private String approveStatus;
	private Long auctionPoint;
	private String autoFill;
	private Boolean autoRepost;
	private Long cid;
	private String desc;
	private String emsFee;
	private String expressFee;
	private String freightPayer;
	private Boolean hasDiscount;
	private Boolean hasInvoice;
	private Boolean hasShowcase;
	private Boolean hasWarranty;
	private FileItem image;
	private String increment;
	private String inputPids;
	private String inputStr;
	private Boolean is3D;
	private Boolean isEx;
	private Boolean isTaobao;
	private String lang;
	private Date listTime;
	private String locationCity;
	private String locationState;
	private Integer num;
	private String outerId;
	private String picPath;
	private String postFee;
	private Long postageId;
	private String price;
	private Long productId;
	private String propertyAlias;
	private String props;
	private String sellerCids;
	private String skuOuterIds;
	private String skuPrices;
	private String skuProperties;
	private String skuQuantities;
	private String stuffStatus;
	private String title;
	private String type;
	private Integer validThru;

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}
	public void setAuctionPoint(Long auctionPoint) {
		this.auctionPoint = auctionPoint;
	}
	public void setAutoFill(String autoFill) {
		this.autoFill = autoFill;
	}
	public void setAutoRepost(Boolean autoRepost) {
		this.autoRepost = autoRepost;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setEmsFee(String emsFee) {
		this.emsFee = emsFee;
	}
	public void setExpressFee(String expressFee) {
		this.expressFee = expressFee;
	}
	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}
	public void setHasDiscount(Boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}
	public void setHasInvoice(Boolean hasInvoice) {
		this.hasInvoice = hasInvoice;
	}
	public void setHasShowcase(Boolean hasShowcase) {
		this.hasShowcase = hasShowcase;
	}
	public void setHasWarranty(Boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}
	public void setImage(FileItem image) {
		this.image = image;
	}
	public void setIncrement(String increment) {
		this.increment = increment;
	}
	public void setInputPids(String inputPids) {
		this.inputPids = inputPids;
	}
	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}
	public void setIs3D(Boolean is3D) {
		this.is3D = is3D;
	}
	public void setIsEx(Boolean isEx) {
		this.isEx = isEx;
	}
	public void setIsTaobao(Boolean isTaobao) {
		this.isTaobao = isTaobao;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public void setListTime(Date listTime) {
		this.listTime = listTime;
	}
	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}
	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public void setPropertyAlias(String propertyAlias) {
		this.propertyAlias = propertyAlias;
	}
	public void setProps(String props) {
		this.props = props;
	}
	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}
	public void setSkuOuterIds(String skuOuterIds) {
		this.skuOuterIds = skuOuterIds;
	}
	public void setSkuPrices(String skuPrices) {
		this.skuPrices = skuPrices;
	}
	public void setSkuProperties(String skuProperties) {
		this.skuProperties = skuProperties;
	}
	public void setSkuQuantities(String skuQuantities) {
		this.skuQuantities = skuQuantities;
	}
	public void setStuffStatus(String stuffStatus) {
		this.stuffStatus = stuffStatus;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setValidThru(Integer validThru) {
		this.validThru = validThru;
	}

	public String getApiName() {
		return "taobao.item.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("approve_status", this.approveStatus);
		params.put("auction_point", this.auctionPoint);
		params.put("auto_fill", this.autoFill);
		params.put("auto_repost", this.autoRepost);
		params.put("cid", this.cid);
		params.put("desc", this.desc);
		params.put("ems_fee", this.emsFee);
		params.put("express_fee", this.expressFee);
		params.put("freight_payer", this.freightPayer);
		params.put("has_discount", this.hasDiscount);
		params.put("has_invoice", this.hasInvoice);
		params.put("has_showcase", this.hasShowcase);
		params.put("has_warranty", this.hasWarranty);
		params.put("increment", this.increment);
		params.put("input_pids", this.inputPids);
		params.put("input_str", this.inputStr);
		params.put("is_3D", this.is3D);
		params.put("is_ex", this.isEx);
		params.put("is_taobao", this.isTaobao);
		params.put("lang", this.lang);
		params.put("list_time", this.listTime);
		params.put("location.city", this.locationCity);
		params.put("location.state", this.locationState);
		params.put("num", this.num);
		params.put("outer_id", this.outerId);
		params.put("pic_path", this.picPath);
		params.put("post_fee", this.postFee);
		params.put("postage_id", this.postageId);
		params.put("price", this.price);
		params.put("product_id", this.productId);
		params.put("property_alias", this.propertyAlias);
		params.put("props", this.props);
		params.put("seller_cids", this.sellerCids);
		params.put("sku_outer_ids", this.skuOuterIds);
		params.put("sku_prices", this.skuPrices);
		params.put("sku_properties", this.skuProperties);
		params.put("sku_quantities", this.skuQuantities);
		params.put("stuff_status", this.stuffStatus);
		params.put("title", this.title);
		params.put("type", this.type);
		params.put("valid_thru", this.validThru);
		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

}
