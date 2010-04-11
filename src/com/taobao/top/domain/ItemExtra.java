package com.taobao.top.domain;

import java.util.Date;
import java.util.List;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;
import com.taobao.top.mapping.JsonListField;

/**
 * ItemExtra Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("item_extra")
@JsonListClass("item_extras")
public class ItemExtra extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("approve_status")
	private String approveStatus;

	@JsonField("created")
	private Date created;

	@JsonField("delist_time")
	private String delistTime;

	@JsonField("desc")
	private String desc;

	@JsonField("eid")
	private Long eid;

	@JsonField("feature")
	private String feature;

	@JsonField("iid")
	private String iid;

	@JsonField("item_num")
	private Integer itemNum;

	@JsonField("item_options")
	private Long itemOptions;

	@JsonField("item_pic_url")
	private String itemPicUrl;

	@JsonField("list_time")
	private String listTime;

	@JsonField("memo")
	private String memo;

	@JsonField("modified")
	private Date modified;

	@JsonField("nick")
	private String nick;

	@JsonField("num_iid")
	private Long numIid;

	@JsonField("options")
	private Long options;

	@JsonField("pic_url")
	private String picUrl;

	@JsonField("reserve_price")
	private String reservePrice;

	@JsonField("seller_cids")
	private String sellerCids;

	@JsonField("shop_id")
	private Long shopId;

	@JsonField("sku")
	@JsonListField("skus")
	private List<Sku> skus;

	@JsonField("title")
	private String title;

	@JsonField("type")
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
