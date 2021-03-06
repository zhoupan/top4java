package com.taobao.top.domain;

import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListClass;

/**
 * PostageMode Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("postage_mode")
@ApiListClass("postage_modes")
public class PostageMode extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("dests")
	private String dests;

	@ApiField("id")
	private Long id;

	@ApiField("increase")
	private String increase;

	@ApiField("postage_id")
	private Long postageId;

	@ApiField("price")
	private String price;

	@ApiField("type")
	private String type;

	public String getDests() {
		return this.dests;
	}
	public void setDests(String dests) {
		this.dests = dests;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getIncrease() {
		return this.increase;
	}
	public void setIncrease(String increase) {
		this.increase = increase;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
