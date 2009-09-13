package com.taobao.top.domain;

/**
 * 运费方式模板收费方式。
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class PostageMode extends BaseObject {
	/** 运费模板编号 */
	private String postageId;

	/** 运费方式项编号 */
	private String id;

	/** 运费方式类型 */
	private String type;

	/** 运费方式单价 */
	private String price;

	/** 运费方式增价 */
	private String increase;

	/** 运费方式地区列表 */
	private String dest;

	public String getPostageId() {
		return this.postageId;
	}

	public void setPostageId(String postageId) {
		this.postageId = postageId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
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

	public String getDest() {
		return this.dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

}
