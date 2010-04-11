package com.taobao.top.domain;

import java.util.Date;
import java.util.List;

import com.taobao.top.mapping.JsonList;
import com.taobao.top.mapping.JsonProperty;

/**
 * ItemDetail Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemDetail extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("express_fee")
	private String expressFee;

	@JsonProperty("product_id")
	private Long productId;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("property_alias")
	private String propertyAlias;

	@JsonList(list="item_imgs", name="item_img")
	private List<ItemImg> itemImgs;

	@JsonProperty("iid")
	private String iid;

	@JsonProperty("has_warranty")
	private Boolean hasWarranty;

	@JsonProperty("type")
	private String type;

	@JsonProperty("approve_status")
	private String approveStatus;

	@JsonProperty("auto_repost")
	private Boolean autoRepost;

	@JsonProperty("list_time")
	private String listTime;

	@JsonProperty("ems_fee")
	private String emsFee;

	@JsonList(list="prop_imgs", name="prop_img")
	private List<PropImg> propImgs;

	@JsonProperty("is_3D")
	private Boolean is3D;

	@JsonProperty("increment")
	private String increment;

	@JsonProperty("stuff_status")
	private String stuffStatus;

	@JsonProperty("has_discount")
	private Boolean hasDiscount;

	@JsonProperty("is_ex")
	private Boolean isEx;

	@JsonProperty("cid")
	private Long cid;

	@JsonProperty("modified")
	private Date modified;

	@JsonProperty("is_virtual")
	private Boolean isVirtual;

	@JsonProperty("valid_thru")
	private Integer validThru;

	@JsonProperty("price")
	private String price;

	@JsonList(list="videos", name="video")
	private List<Video> videos;

	@JsonProperty("nick")
	private String nick;

	@JsonProperty("is_timing")
	private Boolean isTiming;

	@JsonProperty("detail_url")
	private String detailUrl;

	@JsonProperty("desc")
	private String desc;

	@JsonProperty("auction_point")
	private Long auctionPoint;

	@JsonProperty("pic_url")
	private String picUrl;

	@JsonProperty("title")
	private String title;

	@JsonProperty("num_iid")
	private Long numIid;

	@JsonProperty("seller_cids")
	private String sellerCids;

	@JsonProperty("has_showcase")
	private Boolean hasShowcase;

	@JsonProperty("second_kill")
	private String secondKill;

	@JsonList(list="skus", name="sku")
	private List<Sku> skus;

	@JsonProperty("input_str")
	private String inputStr;

	@JsonProperty("one_station")
	private Boolean oneStation;

	@JsonProperty("outer_id")
	private String outerId;

	@JsonProperty("input_pids")
	private String inputPids;

	@JsonProperty("postage_id")
	private Long postageId;

	@JsonProperty("freight_payer")
	private String freightPayer;

	@JsonProperty("post_fee")
	private String postFee;

	@JsonProperty("has_invoice")
	private Boolean hasInvoice;

	@JsonProperty("auto_fill")
	private String autoFill;

	@JsonProperty("num")
	private Integer num;

	@JsonProperty("is_taobao")
	private Boolean isTaobao;

	@JsonProperty("delist_time")
	private String delistTime;

	@JsonProperty("props")
	private String props;

	public String getExpressFee() {
		return this.expressFee;
	}
	public void setExpressFee(String expressFee) {
		this.expressFee = expressFee;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	public String getPropertyAlias() {
		return this.propertyAlias;
	}
	public void setPropertyAlias(String propertyAlias) {
		this.propertyAlias = propertyAlias;
	}

	public List<ItemImg> getItemImgs() {
		return this.itemImgs;
	}
	public void setItemImgs(List<ItemImg> itemImgs) {
		this.itemImgs = itemImgs;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public Boolean getHasWarranty() {
		return this.hasWarranty;
	}
	public void setHasWarranty(Boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getApproveStatus() {
		return this.approveStatus;
	}
	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public Boolean getAutoRepost() {
		return this.autoRepost;
	}
	public void setAutoRepost(Boolean autoRepost) {
		this.autoRepost = autoRepost;
	}

	public String getListTime() {
		return this.listTime;
	}
	public void setListTime(String listTime) {
		this.listTime = listTime;
	}

	public String getEmsFee() {
		return this.emsFee;
	}
	public void setEmsFee(String emsFee) {
		this.emsFee = emsFee;
	}

	public List<PropImg> getPropImgs() {
		return this.propImgs;
	}
	public void setPropImgs(List<PropImg> propImgs) {
		this.propImgs = propImgs;
	}

	public Boolean getIs3D() {
		return this.is3D;
	}
	public void setIs3D(Boolean is3D) {
		this.is3D = is3D;
	}

	public String getIncrement() {
		return this.increment;
	}
	public void setIncrement(String increment) {
		this.increment = increment;
	}

	public String getStuffStatus() {
		return this.stuffStatus;
	}
	public void setStuffStatus(String stuffStatus) {
		this.stuffStatus = stuffStatus;
	}

	public Boolean getHasDiscount() {
		return this.hasDiscount;
	}
	public void setHasDiscount(Boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}

	public Boolean getIsEx() {
		return this.isEx;
	}
	public void setIsEx(Boolean isEx) {
		this.isEx = isEx;
	}

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Boolean getIsVirtual() {
		return this.isVirtual;
	}
	public void setIsVirtual(Boolean isVirtual) {
		this.isVirtual = isVirtual;
	}

	public Integer getValidThru() {
		return this.validThru;
	}
	public void setValidThru(Integer validThru) {
		this.validThru = validThru;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public List<Video> getVideos() {
		return this.videos;
	}
	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Boolean getIsTiming() {
		return this.isTiming;
	}
	public void setIsTiming(Boolean isTiming) {
		this.isTiming = isTiming;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getAuctionPoint() {
		return this.auctionPoint;
	}
	public void setAuctionPoint(Long auctionPoint) {
		this.auctionPoint = auctionPoint;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getSellerCids() {
		return this.sellerCids;
	}
	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}

	public Boolean getHasShowcase() {
		return this.hasShowcase;
	}
	public void setHasShowcase(Boolean hasShowcase) {
		this.hasShowcase = hasShowcase;
	}

	public String getSecondKill() {
		return this.secondKill;
	}
	public void setSecondKill(String secondKill) {
		this.secondKill = secondKill;
	}

	public List<Sku> getSkus() {
		return this.skus;
	}
	public void setSkus(List<Sku> skus) {
		this.skus = skus;
	}

	public String getInputStr() {
		return this.inputStr;
	}
	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}

	public Boolean getOneStation() {
		return this.oneStation;
	}
	public void setOneStation(Boolean oneStation) {
		this.oneStation = oneStation;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getInputPids() {
		return this.inputPids;
	}
	public void setInputPids(String inputPids) {
		this.inputPids = inputPids;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public String getFreightPayer() {
		return this.freightPayer;
	}
	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}

	public String getPostFee() {
		return this.postFee;
	}
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public Boolean getHasInvoice() {
		return this.hasInvoice;
	}
	public void setHasInvoice(Boolean hasInvoice) {
		this.hasInvoice = hasInvoice;
	}

	public String getAutoFill() {
		return this.autoFill;
	}
	public void setAutoFill(String autoFill) {
		this.autoFill = autoFill;
	}

	public Integer getNum() {
		return this.num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}

	public Boolean getIsTaobao() {
		return this.isTaobao;
	}
	public void setIsTaobao(Boolean isTaobao) {
		this.isTaobao = isTaobao;
	}

	public String getDelistTime() {
		return this.delistTime;
	}
	public void setDelistTime(String delistTime) {
		this.delistTime = delistTime;
	}

	public String getProps() {
		return this.props;
	}
	public void setProps(String props) {
		this.props = props;
	}

}
