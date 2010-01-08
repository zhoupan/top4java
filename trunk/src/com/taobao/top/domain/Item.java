package com.taobao.top.domain;

import java.util.Date;
import java.util.List;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 商品。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("items")
public class Item extends BaseObject {

	/** 商品编号 */
	@JsonProperty("iid")
	private String iid;

	/** 商品数字编号 */
	@JsonProperty("num_iid")
	private Long numIid;

	/** 商品地址 */
	@JsonProperty("detail_url")
	private String detailUrl;

	/** 商品标题 */
	@JsonProperty("title")
	private String title;

	/** 卖家昵称 */
	@JsonProperty("nick")
	private String nick;

	/** 商品类型 */
	@JsonProperty("type")
	private String type;

	/** 商品所属的叶子类目 */
	@JsonProperty("cid")
	private Long cid;

	/** 商品所属的店铺内卖家自定义类目列表 */
	@JsonProperty("seller_cids")
	private String sellerCids;

	/** 商品属性格式 */
	@JsonProperty("props")
	private String props;

	/** 用户自行输入的类目属性编号串 */
	@JsonProperty("input_pids")
	private String inputPids;

	/** 用户自行输入的子属性名和属性值 */
	@JsonProperty("input_str")
	private String inputStrs;

	/** 商品描述 */
	@JsonProperty("desc")
	private String description;

	/** 商品主图片地址 */
	@JsonProperty("pic_path")
	private String picPath;

	/** 商品数量 */
	@JsonProperty("num")
	private String num;

	/** 商品有效期 */
	@JsonProperty("valid_thru")
	private String validTerm;

	/** 上架时间 */
	@JsonProperty("list_time")
	private Date enlistTime;

	/** 下架时间 */
	@JsonProperty("delist_time")
	private Date delistTime;

	/** 商品新旧程度 */
	@JsonProperty("stuff_status")
	private String stuffStatus;

	/** 商品所在地 */
	@JsonProperty("location")
	private Location location;

	/** 商品价格 */
	@JsonProperty("price")
	private String price;

	/** 平邮费用 */
	@JsonProperty("post_fee")
	private String postFee;

	/** 快递费用 */
	@JsonProperty("express_fee")
	private String expressFee;

	/** EMS费用 */
	@JsonProperty("ems_fee")
	private String emsFee;

	/** 是否已出价 */
	@JsonProperty("has_bid")
	private Boolean hasBid;

	/** 支持会员打折 */
	@JsonProperty("has_discount")
	private Boolean hasDiscount;

	/** 运费承担方式 */
	@JsonProperty("freight_payer")
	private String freightPayer;

	/** 是否有发票 */
	@JsonProperty("has_invoice")
	private Boolean hasInvoice;

	/** 是否有保修 */
	@JsonProperty("has_warranty")
	private Boolean hasWarranty;

	/** 橱窗推荐 */
	@JsonProperty("has_showcase")
	private Boolean hasShowcase;

	/** 加价幅度 */
	@JsonProperty("increment")
	private String increment;

	/** 自动重发 */
	@JsonProperty("auto_repost")
	private Boolean autoRepost;

	/** 商品上传后的状态 */
	@JsonProperty("approve_status")
	private String approveStatus;

	/** 宝贝所属的运费模板编号 */
	@JsonProperty("postage_id")
	private Long postageId;

	/** 宝贝所属产品的编号 */
	@JsonProperty("product_id")
	private Long productId;

	/** 返点比例 */
	@JsonProperty("auction_point")
	private String auctionPoint;

	/** 属性值别名 */
	@JsonProperty("property_alias")
	private String propAlias;

	/** 商家外部编码 */
	@JsonProperty("outer_id")
	private String outerId;

	/** 虚拟商品的状态字段 */
	@JsonProperty("is_virtural")
	private String virtural;

	/** 是否在淘宝显示 */
	@JsonProperty("is_taobao")
	private Boolean taobao;

	/** 是否在外部网店显示 */
	@JsonProperty("is_ex")
	private Boolean external;

	/** 是否定时 */
	@JsonProperty("is_timing")
	private Boolean timing;

	/** 商品所属卖家的信用等级数 */
	@JsonProperty("score")
	private Long score;

	/** 商品30天成交量 */
	@JsonProperty("volume")
	private Long volume;

	/** 是否淘1站商品 */
	@JsonProperty("one_station")
	private Boolean oneStation;

	/** 商品图片列表(包括主图) */
	@JsonProperty("item_img")
	private List<ItemImg> itemImgs;

	/** 商品属性图片列表 */
	@JsonProperty("prop_img")
	private List<PropImg> propImgs;

	/** SKU列表 */
	@JsonProperty("sku")
	private List<Sku> skus;

	public String getIid() {
		return this.iid;
	}

	public void setIid(String iid) {
		this.iid = iid;
	}

	public Long getNumIid() {
		return this.numIid;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getCid() {
		return this.cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getSellerCids() {
		return this.sellerCids;
	}

	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}

	public String getProps() {
		return this.props;
	}

	public void setProps(String props) {
		this.props = props;
	}

	public String getInputPids() {
		return this.inputPids;
	}

	public void setInputPids(String inputPids) {
		this.inputPids = inputPids;
	}

	public String getInputStrs() {
		return this.inputStrs;
	}

	public void setInputStrs(String inputStrs) {
		this.inputStrs = inputStrs;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public String getPicPath() {
		return this.picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getValidTerm() {
		return this.validTerm;
	}

	public void setValidTerm(String validTerm) {
		this.validTerm = validTerm;
	}

	public Date getEnlistTime() {
		return this.enlistTime;
	}

	public void setEnlistTime(Date enlistTime) {
		this.enlistTime = enlistTime;
	}

	public Date getDelistTime() {
		return this.delistTime;
	}

	public void setDelistTime(Date delistTime) {
		this.delistTime = delistTime;
	}

	public String getStuffStatus() {
		return this.stuffStatus;
	}

	public void setStuffStatus(String stuffStatus) {
		this.stuffStatus = stuffStatus;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPostFee() {
		return this.postFee;
	}

	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public String getExpressFee() {
		return this.expressFee;
	}

	public void setExpressFee(String expressFee) {
		this.expressFee = expressFee;
	}

	public String getEmsFee() {
		return this.emsFee;
	}

	public void setEmsFee(String emsFee) {
		this.emsFee = emsFee;
	}

	public Boolean getHasDiscount() {
		return this.hasDiscount;
	}

	public void setHasDiscount(Boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}

	public String getFreightPayer() {
		return this.freightPayer;
	}

	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}

	public Boolean getHasInvoice() {
		return this.hasInvoice;
	}

	public void setHasInvoice(Boolean hasInvoice) {
		this.hasInvoice = hasInvoice;
	}

	public Boolean getHasWarranty() {
		return this.hasWarranty;
	}

	public void setHasWarranty(Boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}

	public Boolean getHasShowcase() {
		return this.hasShowcase;
	}

	public void setHasShowcase(Boolean hasShowcase) {
		this.hasShowcase = hasShowcase;
	}

	public String getIncrement() {
		return this.increment;
	}

	public void setIncrement(String increment) {
		this.increment = increment;
	}

	public Boolean getAutoRepost() {
		return this.autoRepost;
	}

	public void setAutoRepost(Boolean autoRepost) {
		this.autoRepost = autoRepost;
	}

	public String getApproveStatus() {
		return this.approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public Long getPostageId() {
		return this.postageId;
	}

	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getAuctionPoint() {
		return this.auctionPoint;
	}

	public void setAuctionPoint(String auctionPoint) {
		this.auctionPoint = auctionPoint;
	}

	public String getPropAlias() {
		return this.propAlias;
	}

	public void setPropAlias(String propAlias) {
		this.propAlias = propAlias;
	}

	public String getOuterId() {
		return this.outerId;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getVirtural() {
		return this.virtural;
	}

	public void setVirtural(String virtural) {
		this.virtural = virtural;
	}

	public Boolean isTaobao() {
		return this.taobao;
	}

	public void setTaobao(Boolean taobao) {
		this.taobao = taobao;
	}

	public Boolean isExternal() {
		return this.external;
	}

	public void setExternal(Boolean external) {
		this.external = external;
	}

	public Boolean getHasBid() {
		return this.hasBid;
	}

	public void setHasBid(Boolean hasBid) {
		this.hasBid = hasBid;
	}

	public Boolean isTiming() {
		return this.timing;
	}

	public void setTiming(Boolean timing) {
		this.timing = timing;
	}

	public Long getScore() {
		return this.score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Long getVolume() {
		return this.volume;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public Boolean isOneStation() {
		return this.oneStation;
	}

	public void setOneStation(Boolean oneStation) {
		this.oneStation = oneStation;
	}

	public List<ItemImg> getItemImgs() {
		return this.itemImgs;
	}

	public void setItemImgs(List<ItemImg> itemImgs) {
		this.itemImgs = itemImgs;
	}

	public List<PropImg> getPropImgs() {
		return this.propImgs;
	}

	public void setPropImgs(List<PropImg> propImgs) {
		this.propImgs = propImgs;
	}

	public List<Sku> getSkus() {
		return this.skus;
	}

	public void setSkus(List<Sku> skus) {
		this.skus = skus;
	}

}
