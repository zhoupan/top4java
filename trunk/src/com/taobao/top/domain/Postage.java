package com.taobao.top.domain;

import java.util.Date;
import java.util.List;

import com.taobao.top.mapping.JsonList;
import com.taobao.top.mapping.JsonProperty;

/**
 * Postage Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class Postage extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("created")
	private Date created;

	@JsonProperty("ems_increase")
	private String emsIncrease;

	@JsonProperty("ems_price")
	private String emsPrice;

	@JsonProperty("express_increase")
	private String expressIncrease;

	@JsonProperty("express_price")
	private String expressPrice;

	@JsonProperty("memo")
	private String memo;

	@JsonProperty("modified")
	private Date modified;

	@JsonProperty("name")
	private String name;

	@JsonProperty("post_increase")
	private String postIncrease;

	@JsonProperty("post_price")
	private String postPrice;

	@JsonProperty("postage_id")
	private Long postageId;

	@JsonList(list="postage_modes", name="postage_mode")
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
