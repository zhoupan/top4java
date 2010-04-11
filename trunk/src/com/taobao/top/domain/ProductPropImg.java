package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;

/**
 * ProductPropImg Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("product_prop_img")
@JsonListClass("product_prop_imgs")
public class ProductPropImg extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("created")
	private Date created;

	@JsonField("id")
	private Long id;

	@JsonField("modified")
	private Date modified;

	@JsonField("position")
	private Integer position;

	@JsonField("product_id")
	private Long productId;

	@JsonField("props")
	private String props;

	@JsonField("url")
	private String url;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Integer getPosition() {
		return this.position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProps() {
		return this.props;
	}
	public void setProps(String props) {
		this.props = props;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
