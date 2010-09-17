package com.taobao.top.domain;

import java.util.Date;
import java.util.List;

import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListClass;
import com.taobao.top.mapping.ApiListField;

/**
 * Product Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("product")
@ApiListClass("products")
public class Product extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("binds")
	private String binds;

	@ApiField("binds_str")
	private String bindsStr;

	@ApiField("cat_name")
	private String catName;

	@ApiField("cid")
	private Long cid;

	@ApiField("created")
	private Date created;

	@ApiField("desc")
	private String desc;

	@ApiField("modified")
	private Date modified;

	@ApiField("name")
	private String name;

	@ApiField("outer_id")
	private String outerId;

	@ApiField("pic_url")
	private String picUrl;

	@ApiField("price")
	private String price;

	@ApiField("product_id")
	private Long productId;

	@ApiField("product_img")
	@ApiListField("product_imgs")
	private List<ProductImg> productImgs;

	@ApiField("product_prop_img")
	@ApiListField("product_prop_imgs")
	private List<ProductPropImg> productPropImgs;

	@ApiField("props")
	private String props;

	@ApiField("props_str")
	private String propsStr;

	@ApiField("sale_props")
	private String saleProps;

	@ApiField("sale_props_str")
	private String salePropsStr;

	@ApiField("status")
	private Long status;

	@ApiField("tsc")
	private String tsc;

	@ApiField("vertical_market")
	private Long verticalMarket;

	public String getBinds() {
		return this.binds;
	}
	public void setBinds(String binds) {
		this.binds = binds;
	}

	public String getBindsStr() {
		return this.bindsStr;
	}
	public void setBindsStr(String bindsStr) {
		this.bindsStr = bindsStr;
	}

	public String getCatName() {
		return this.catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
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

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public List<ProductImg> getProductImgs() {
		return this.productImgs;
	}
	public void setProductImgs(List<ProductImg> productImgs) {
		this.productImgs = productImgs;
	}

	public List<ProductPropImg> getProductPropImgs() {
		return this.productPropImgs;
	}
	public void setProductPropImgs(List<ProductPropImg> productPropImgs) {
		this.productPropImgs = productPropImgs;
	}

	public String getProps() {
		return this.props;
	}
	public void setProps(String props) {
		this.props = props;
	}

	public String getPropsStr() {
		return this.propsStr;
	}
	public void setPropsStr(String propsStr) {
		this.propsStr = propsStr;
	}

	public String getSaleProps() {
		return this.saleProps;
	}
	public void setSaleProps(String saleProps) {
		this.saleProps = saleProps;
	}

	public String getSalePropsStr() {
		return this.salePropsStr;
	}
	public void setSalePropsStr(String salePropsStr) {
		this.salePropsStr = salePropsStr;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTsc() {
		return this.tsc;
	}
	public void setTsc(String tsc) {
		this.tsc = tsc;
	}

	public Long getVerticalMarket() {
		return this.verticalMarket;
	}
	public void setVerticalMarket(Long verticalMarket) {
		this.verticalMarket = verticalMarket;
	}

}
