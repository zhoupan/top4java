package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonProperty;

/**
 * ItemImg Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemImg extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("position")
	private Integer position;

	@JsonProperty("id")
	private Long id;

	@JsonProperty("url")
	private String url;

	@JsonProperty("created")
	private Date created;

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

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

}
