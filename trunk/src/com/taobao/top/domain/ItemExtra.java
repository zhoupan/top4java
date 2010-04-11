package com.taobao.top.domain;

import java.util.Date;
import java.util.List;

import com.taobao.top.mapping.JsonList;
import com.taobao.top.mapping.JsonProperty;

/**
 * ItemExtra Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemExtra extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("approve_status")
	private String approveStatus;

	@JsonProperty("created")
	private Date created;

	@JsonProperty("delist_time")
	private String delistTime;

	@JsonProperty("desc")
	private String desc;

	@JsonProperty("eid")
	private Long eid;

	@JsonProperty("feature")
	private String feature;

	@JsonProperty("iid")
	private String iid;

	@JsonProperty("item_num")
	private Integer itemNum;

	@JsonProperty("item_options")
	private Long itemOptions;

	@JsonProperty("item_pic_url")
	private String itemPicUrl;

	@JsonProperty("list_time")
	private String listTime;

	@JsonProperty("memo")
	private String memo;

	@JsonProperty("modified")
	private Date modified;

	@JsonProperty("nick")
	private String nick;

	@JsonProperty("num_iid")
	private Long numIid;

	@JsonProperty("options")
	private Long options;

	@JsonProperty("pic_url")
	private String picUrl;

	@JsonProperty("reserve_price")
	private String reservePrice;

	@JsonProperty("seller_cids")
	private String sellerCids;

	@JsonProperty("shop_id")
	private Long shopId;

	@JsonList(list="skus", name="sku")
	private List<Sku> skus;

	@JsonProperty("title")
	private String title;

	@JsonProperty("type")
	private String type;

	public String getApproveStatus() {
		return this.approveStatus;
	}
	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDelistTime() {
		return this.delistTime;
	}
	public void setDelistTime(String delistTime) {
		this.delistTime = delistTime;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getEid() {
		return this.eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}

	public String getFeature() {
		return this.feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public Integer getItemNum() {
		return this.itemNum;
	}
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}

	public Long getItemOptions() {
		return this.itemOptions;
	}
	public void setItemOptions(Long itemOptions) {
		this.itemOptions = itemOptions;
	}

	public String getItemPicUrl() {
		return this.itemPicUrl;
	}
	public void setItemPicUrl(String itemPicUrl) {
		this.itemPicUrl = itemPicUrl;
	}

	public String getListTime() {
		return this.listTime;
	}
	public void setListTime(String listTime) {
		this.listTime = listTime;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getOptions() {
		return this.options;
	}
	public void setOptions(Long options) {
		this.options = options;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getReservePrice() {
		return this.reservePrice;
	}
	public void setReservePrice(String reservePrice) {
		this.reservePrice = reservePrice;
	}

	public String getSellerCids() {
		return this.sellerCids;
	}
	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}

	public Long getShopId() {
		return this.shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public List<Sku> getSkus() {
		return this.skus;
	}
	public void setSkus(List<Sku> skus) {
		this.skus = skus;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
