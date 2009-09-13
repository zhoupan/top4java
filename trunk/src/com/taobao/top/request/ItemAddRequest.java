package com.taobao.top.request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.taobao.top.domain.Location;
import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.add
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemAddRequest implements TopUploadRequest {

	/** 商品上传后的状态 */
	private String approveStatus;

	/** 叶子类目编号 */
	private String cid;

	/** 商品属性列表 */
	private String props;

	/** 商品数量 */
	private Integer num;

	/** 商品价格 */
	private String price;

	/** 发布类型 */
	private String type;

	/** 新旧程度 */
	private String stuffStatus;

	/** 宝贝标题 */
	private String title;

	/** 宝贝描述 */
	private String desc;

	/** 所在地 */
	public Location location;

	/** 运费承担方式 */
	private String freightPayer;

	/** 有效期 */
	private String validTerm;

	/** 是否有发票 */
	private Boolean hasInvoice;

	/** 是否有保修 */
	private Boolean hasWarranty;

	/** 是否自动上架 */
	private Boolean autoRepost;

	/** 是否橱窗推荐 */
	private Boolean hasShowcase;

	/** 店铺类目列表 */
	private String sellerCids;

	/** 是否支持会员打折 */
	private Boolean hasDiscount;

	/** 平邮费用 */
	private String postFee;

	/** 快递费用 */
	private String expressFee;

	/** EMS费用 */
	private String emsFee;

	/** 上架时间 */
	private Date enlistTime;

	/** 加价幅度 */
	private String increment;

	/** 商品主图片 */
	public FileItem image;

	/** 宝贝所属的运费模板编号 */
	private String postageId;

	/** 商品的积分返点比例 */
	private Integer auctionPoint;

	/** 属性值别名 */
	private String propAlias;

	/** 用户自行输入的类目属性编号串 */
	private String inputPids;

	/** 用户自行输入的类目属性别名串 */
	private String inputStrs;

	/** SKU的属性串 */
	private String skuProps;

	/** SKU的数量串 */
	private String skuQuantities;

	/** SKU的价格串 */
	private String skuPrices;

	/** SKU的外部编号串 */
	private String skuOuterIds;

	/** 商品文字的版本 */
	private String language;

	/** 商家外部编码 */
	private String outerId;

	/** 商品所属的产品编号 */
	private String productId;

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setProps(String props) {
		this.props = props;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setStuffStatus(String stuffStatus) {
		this.stuffStatus = stuffStatus;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}

	public void setValidTerm(String validTerm) {
		this.validTerm = validTerm;
	}

	public void setHasInvoice(Boolean hasInvoice) {
		this.hasInvoice = hasInvoice;
	}

	public void setHasWarranty(Boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}

	public void setAutoRepost(Boolean autoRepost) {
		this.autoRepost = autoRepost;
	}

	public void setHasShowcase(Boolean hasShowcase) {
		this.hasShowcase = hasShowcase;
	}

	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}

	public void setHasDiscount(Boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}

	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public void setExpressFee(String expressFee) {
		this.expressFee = expressFee;
	}

	public void setEmsFee(String emsFee) {
		this.emsFee = emsFee;
	}

	public void setEnlistTime(Date enlistTime) {
		this.enlistTime = enlistTime;
	}

	public void setIncrement(String increment) {
		this.increment = increment;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}

	public void setPostageId(String postageId) {
		this.postageId = postageId;
	}

	public void setAuctionPoint(Integer auctionPoint) {
		this.auctionPoint = auctionPoint;
	}

	public void setPropAlias(String propAlias) {
		this.propAlias = propAlias;
	}

	public void setInputPids(String inputPids) {
		this.inputPids = inputPids;
	}

	public void setInputStrs(String inputStrs) {
		this.inputStrs = inputStrs;
	}

	public void setSkuProps(String skuProps) {
		this.skuProps = skuProps;
	}

	public void setSkuQuantities(String skuQuantities) {
		this.skuQuantities = skuQuantities;
	}

	public void setSkuPrices(String skuPrices) {
		this.skuPrices = skuPrices;
	}

	public void setSkuOuterIds(String skuOuterIds) {
		this.skuOuterIds = skuOuterIds;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getApiName() {
		return "taobao.item.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("approve_status", this.approveStatus);
		params.put("cid", this.cid);
		params.put("props", this.props);
		params.put("num", this.num);
		params.put("price", this.price);
		params.put("type", this.type);
		params.put("stuff_status", this.stuffStatus);
		params.put("title", this.title);
		params.put("desc", this.desc);
		if (this.location != null) {
			params.put("location.state", this.location.getState());
			params.put("location.city", this.location.getCity());
		}
		params.put("freight_payer", this.freightPayer);
		params.put("valid_thru", this.validTerm);
		params.put("has_invoice", this.hasInvoice);
		params.put("has_warranty", this.hasWarranty);
		params.put("auto_repost", this.autoRepost);
		params.put("has_showcase", this.hasShowcase);
		params.put("seller_cids", this.sellerCids);
		params.put("has_discount", this.hasDiscount);
		params.put("post_fee", this.postFee);
		params.put("express_fee", this.expressFee);
		params.put("ems_fee", this.emsFee);
		params.put("list_time", this.enlistTime);
		params.put("increment", this.increment);
		params.put("postage_id", this.postageId);
		params.put("auction_point", this.auctionPoint);
		params.put("property_alias", this.propAlias);
		params.put("input_pids", this.inputPids);
		params.put("input_str", this.inputStrs);
		params.put("sku_properties", this.skuProps);
		params.put("sku_quantities", this.skuQuantities);
		params.put("sku_prices", this.skuPrices);
		params.put("sku_outer_ids", this.skuOuterIds);
		params.put("lang", this.language);
		params.put("outer_id", this.outerId);
		params.put("product_id", this.productId);

		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

}
