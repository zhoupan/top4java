package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonProperty;

/**
 * Sku Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class Sku extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("price")
	private String price;

	@JsonProperty("created")
	private Date created;

	@JsonProperty("outer_id")
	private String outerId;

	@JsonProperty("quantity")
	private Long quantity;

	@JsonProperty("properties")
	private String properties;

	@JsonProperty("sku_id")
	private Long skuId;

	@JsonProperty("modified")
	private Date modified;

	@JsonProperty("iid")
	private String iid;

	@JsonProperty("num_iid")
	private Long numIid;

	@JsonProperty("status")
	private String status;

	@JsonProperty("memo")
	private String memo;

	@JsonProperty("extra_id")
	private Long extraId;

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Long getExtraId() {
		return this.extraId;
	}
	public void setExtraId(Long extraId) {
		this.extraId = extraId;
	}

}
