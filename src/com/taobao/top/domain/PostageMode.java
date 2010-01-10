package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 运费方式模板。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class PostageMode extends BaseObject {

	private static final long serialVersionUID = -3374353869722058383L;

	/** 运费模板编号 */
	@JsonProperty("postage_id")
	private Long postageId;

	/** 运费方式项编号 */
	@JsonProperty("postage_mode_id")
	private Long id;

	/** 运费方式类型 */
	@JsonProperty("postage_mode_type")
	private String type;

	/** 运费方式单价 */
	@JsonProperty("price")
	private String price;

	/** 运费方式增价 */
	@JsonProperty("increase")
	private String increase;

	/** 运费方式地区列表 */
	@JsonProperty("dest")
	private String dests;

	public Long getPostageId() {
		return this.postageId;
	}

	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getIncrease() {
		return this.increase;
	}

	public void setIncrease(String increase) {
		this.increase = increase;
	}

	public String getDests() {
		return this.dests;
	}

	public void setDests(String dests) {
		this.dests = dests;
	}

}
