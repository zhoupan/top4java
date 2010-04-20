package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListClass;

/**
 * Sku Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("sku")
@ApiListClass("skus")
public class Sku extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("created")
	private Date created;

	@ApiField("extra_id")
	private Long extraId;

	@ApiField("iid")
	private String iid;

	@ApiField("memo")
	private String memo;

	@ApiField("modified")
	private Date modified;

	@ApiField("num_iid")
	private Long numIid;

	@ApiField("outer_id")
	private String outerId;

	@ApiField("price")
	private String price;

	@ApiField("properties")
	private String properties;

	@ApiField("quantity")
	private Long quantity;

	@ApiField("sku_id")
	private Long skuId;

	@ApiField("status")
	private String status;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getExtraId() {
		return this.extraId;
	}
	public void setExtraId(Long extraId) {
		this.extraId = extraId;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
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

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
