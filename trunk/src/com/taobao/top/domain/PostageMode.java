package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;

/**
 * PostageMode Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("postage_mode")
@JsonListClass("postage_modes")
public class PostageMode extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("dests")
	private String dests;

	@JsonField("id")
	private Long id;

	@JsonField("increase")
	private String increase;

	@JsonField("postage_id")
	private Long postageId;

	@JsonField("price")
	private String price;

	@JsonField("type")
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
