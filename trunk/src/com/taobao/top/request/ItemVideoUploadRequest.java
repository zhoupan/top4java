package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.video.upload
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemVideoUploadRequest implements TopRequest {

	private Long id;
	private String iid;
	private String lang;
	private Long numIid;
	private Long videoId;

	public void setId(Long id) {
		this.id = id;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}

	public String getApiName() {
		return "taobao.item.video.upload";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("id", this.id);
		params.put("iid", this.iid);
		params.put("lang", this.lang);
		params.put("num_iid", this.numIid);
		params.put("video_id", this.videoId);
		return params;
	}

}
