package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonProperty;

/**
 * User Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class User extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("alipay_account")
	private String alipayAccount;

	@JsonProperty("alipay_bind")
	private String alipayBind;

	@JsonProperty("alipay_no")
	private String alipayNo;

	@JsonProperty("auto_repost")
	private String autoRepost;

	@JsonProperty("birthday")
	private String birthday;

	@JsonProperty("buyer_credit")
	private UserCredit buyerCredit;

	@JsonProperty("consumer_protection")
	private Boolean consumerProtection;

	@JsonProperty("created")
	private Date created;

	@JsonProperty("email")
	private String email;

	@JsonProperty("has_more_pic")
	private Boolean hasMorePic;

	@JsonProperty("id_card")
	private String idCard;

	@JsonProperty("item_img_num")
	private Integer itemImgNum;

	@JsonProperty("item_img_size")
	private Integer itemImgSize;

	@JsonProperty("last_visit")
	private String lastVisit;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("mobile")
	private String mobile;

	@JsonProperty("nick")
	private String nick;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("promoted_type")
	private String promotedType;

	@JsonProperty("prop_img_num")
	private Integer propImgNum;

	@JsonProperty("prop_img_size")
	private Integer propImgSize;

	@JsonProperty("real_name")
	private String realName;

	@JsonProperty("seller_credit")
	private UserCredit sellerCredit;

	@JsonProperty("sex")
	private String sex;

	@JsonProperty("status")
	private String status;

	@JsonProperty("type")
	private String type;

	@JsonProperty("uid")
	private String uid;

	@JsonProperty("user_id")
	private Long userId;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
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

	public String getAutoRepost() {
		return this.autoRepost;
	}
	public void setAutoRepost(String autoRepost) {
		this.autoRepost = autoRepost;
	}

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public UserCredit getBuyerCredit() {
		return this.buyerCredit;
	}
	public void setBuyerCredit(UserCredit buyerCredit) {
		this.buyerCredit = buyerCredit;
	}

	public Boolean getConsumerProtection() {
		return this.consumerProtection;
	}
	public void setConsumerProtection(Boolean consumerProtection) {
		this.consumerProtection = consumerProtection;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getHasMorePic() {
		return this.hasMorePic;
	}
	public void setHasMorePic(Boolean hasMorePic) {
		this.hasMorePic = hasMorePic;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
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

	public String getLastVisit() {
		return this.lastVisit;
	}
	public void setLastVisit(String lastVisit) {
		this.lastVisit = lastVisit;
	}

	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPromotedType() {
		return this.promotedType;
	}
	public void setPromotedType(String promotedType) {
		this.promotedType = promotedType;
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

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public UserCredit getSellerCredit() {
		return this.sellerCredit;
	}
	public void setSellerCredit(UserCredit sellerCredit) {
		this.sellerCredit = sellerCredit;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
