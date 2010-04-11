package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.JsonProperty;

/**
 * Video Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class Video extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private Long id;

	@JsonProperty("created")
	private Date created;

	@JsonProperty("video_id")
	private Long videoId;

	@JsonProperty("url")
	private String url;

	@JsonProperty("modified")
	private Date modified;

	@JsonProperty("iid")
	private String iid;

	@JsonProperty("num_iid")
	private Long numIid;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getVideoId() {
		return this.videoId;
	}
	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
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

}
