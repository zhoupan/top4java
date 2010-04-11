package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;
import com.taobao.top.mapping.JsonListClass;

/**
 * PropImg Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("prop_img")
@JsonListClass("prop_imgs")
public class PropImg extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("created")
	private Date created;

	@JsonField("id")
	private Long id;

	@JsonField("position")
	private Integer position;

	@JsonField("properties")
	private String properties;

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

	public Integer getPosition() {
		return this.position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
