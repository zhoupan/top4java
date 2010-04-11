package com.taobao.top.domain;

import java.util.Date;
import java.util.List;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;
import com.taobao.top.mapping.JsonListField;

/**
 * Postage Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("postage")
@JsonListClass("postages")
public class Postage extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("created")
	private Date created;

	@JsonField("ems_increase")
	private String emsIncrease;

	@JsonField("ems_price")
	private String emsPrice;

	@JsonField("express_increase")
	private String expressIncrease;

	@JsonField("express_price")
	private String expressPrice;

	@JsonField("memo")
	private String memo;

	@JsonField("modified")
	private Date modified;

	@JsonField("name")
	private String name;

	@JsonField("post_increase")
	private String postIncrease;

	@JsonField("post_price")
	private String postPrice;

	@JsonField("postage_id")
	private Long postageId;

	@JsonField("postage_mode")
	@JsonListField("postage_modes")
	private List<PostageMode> postageModes;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getEmsIncrease() {
		return this.emsIncrease;
	}
	public void setEmsIncrease(String emsIncrease) {
		this.emsIncrease = emsIncrease;
	}

	public String getEmsPrice() {
		return this.emsPrice;
	}
	public void setEmsPrice(String emsPrice) {
		this.emsPrice = emsPrice;
	}

	public String getExpressIncrease() {
		return this.expressIncrease;
	}
	public void setExpressIncrease(String expressIncrease) {
		this.expressIncrease = expressIncrease;
	}

	public String getExpressPrice() {
		return this.expressPrice;
	}
	public void setExpressPrice(String expressPrice) {
		this.expressPrice = expressPrice;
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPostIncrease() {
		return this.postIncrease;
	}
	public void setPostIncrease(String postIncrease) {
		this.postIncrease = postIncrease;
	}

	public String getPostPrice() {
		return this.postPrice;
	}
	public void setPostPrice(String postPrice) {
		this.postPrice = postPrice;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public List<PostageMode> getPostageModes() {
		return this.postageModes;
	}
	public void setPostageModes(List<PostageMode> postageModes) {
		this.postageModes = postageModes;
	}

}
