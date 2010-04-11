package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonProperty;

/**
 * ProductPropImg Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ProductPropImg extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("position")
	private Integer position;

	@JsonProperty("id")
	private Long id;

	@JsonProperty("product_id")
	private Long productId;

	@JsonProperty("url")
	private String url;

	@JsonProperty("props")
	private String props;

	@JsonProperty("created")
	private Date created;

	@JsonProperty("modified")
	private Date modified;

	public Integer getPosition() {
		return this.position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getProps() {
		return this.props;
	}
	public void setProps(String props) {
		this.props = props;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

}
