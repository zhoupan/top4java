package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonProperty;

/**
 * 用户信息。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
@JsonClass("users")
public class User extends BaseObject {

	private static final long serialVersionUID = 2781191496664162267L;

	/** 用户编号 */
	@JsonProperty("user_id")
	private Long userId;

	/** 用户昵称 */
	@JsonProperty("nick")
	private String nick;

	/** 用户性别 */
	@JsonProperty("sex")
	private String sex;

	/** 卖家信用 */
	@JsonProperty("seller_credit")
	public UserCredit sellerCredit;

	/** 买家信用 */
	@JsonProperty("buyer_credit")
	public UserCredit buyerCredit;

	/** 用户当前居住地公开信息 */
	@JsonProperty("location")
	private Location location;

	/** 最近登陆时间 */
	@JsonProperty("last_visit")
	private String lastVisit;

	/** 用户生日日期 */
	@JsonProperty("birthday")
	private String birthday;

	/** 用户类型 */
	@JsonProperty("type")
	private String type;

	/** 是否购买多图服务 */
	@JsonProperty("has_more_pic")
	private Boolean hasMorePic;

	/** 可上传商品图片数量 */
	@JsonProperty("item_img_num")
	private Integer itemImgNum;

	/** 单张商品图片最大容量 */
	@JsonProperty("item_img_size")
	private Integer itemImgSize;

	/** 可上传属性图片数量 */
	@JsonProperty("prop_img_num")
	private Integer propImgNum;

	/** 单张销售属性图片最大容量 */
	@JsonProperty("prop_img_size")
	private Integer propImgSize;

	/** 是否受限制 */
	@JsonProperty("auto_repost")
	private String autoRepost;

	/** 有无实名认证 */
	@JsonProperty("promoted_type")
	private String promotedType;

	/** 用户账号状态 */
	@JsonProperty("status")
	private String status;

	/** 有无绑定支付宝 */
	@JsonProperty("alipay_bind")
	private String alipayBind;

	/** 支付宝数字编号 */
	@JsonProperty("alipay_no")
	private String alipayNo;

	/** 支付宝邮件账号 */
	@JsonProperty("alipay_account")
	private String alipayAccount;

	/** 是否参加消保 */
	@JsonProperty("consumer_protection")
	private String consumerProtection;

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public UserCredit getSellerCredit() {
		return this.sellerCredit;
	}

	public void setSellerCredit(UserCredit sellerCredit) {
		this.sellerCredit = sellerCredit;
	}

	public UserCredit getBuyerCredit() {
		return this.buyerCredit;
	}

	public void setBuyerCredit(UserCredit buyerCredit) {
		this.buyerCredit = buyerCredit;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getLastVisit() {
		return this.lastVisit;
	}

	public void setLastVisit(String lastVisit) {
		this.lastVisit = lastVisit;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getHasMorePic() {
		return this.hasMorePic;
	}

	public void setHasMorePic(Boolean hasMorePic) {
		this.hasMorePic = hasMorePic;
	}

	public Integer getItemImgNum() {
		return this.itemImgNum;
	}

	public void setItemImgNum(Integer itemImgNum) {
		this.itemImgNum = itemImgNum;
	}

	public Integer getItemImgSize() {
		return this.itemImgSize;
	}

	public void setItemImgSize(Integer itemImgSize) {
		this.itemImgSize = itemImgSize;
	}

	public Integer getPropImgNum() {
		return this.propImgNum;
	}

	public void setPropImgNum(Integer propImgNum) {
		this.propImgNum = propImgNum;
	}

	public Integer getPropImgSize() {
		return this.propImgSize;
	}

	public void setPropImgSize(Integer propImgSize) {
		this.propImgSize = propImgSize;
	}

	public String getAutoRepost() {
		return this.autoRepost;
	}

	public void setAutoRepost(String autoRepost) {
		this.autoRepost = autoRepost;
	}

	public String getPromotedType() {
		return this.promotedType;
	}

	public void setPromotedType(String promotedType) {
		this.promotedType = promotedType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAlipayBind() {
		return this.alipayBind;
	}

	public void setAlipayBind(String alipayBind) {
		this.alipayBind = alipayBind;
	}

	public String getAlipayNo() {
		return this.alipayNo;
	}

	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getAlipayAccount() {
		return this.alipayAccount;
	}

	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getConsumerProtection() {
		return this.consumerProtection;
	}

	public void setConsumerProtection(String consumerProtection) {
		this.consumerProtection = consumerProtection;
	}

}
