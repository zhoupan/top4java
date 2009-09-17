package com.taobao.top.domain;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 地址区域。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class Area extends BaseObject {

	/** 标准行政区域代码 */
	@JsonProperty("area_id")
	private Long areaId;

	/** 区域类型 */
	@JsonProperty("area_type")
	private Long areaType;

	/** 区域名称 */
	@JsonProperty("area_name")
	private String areaName;

	/** 父节点区域标识 */
	@JsonProperty("parent_id")
	private Long parentId;

	/** 具体一个地区的邮编 */
	@JsonProperty("zip")
	private String zip;

	public Long getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public Long getAreaType() {
		return this.areaType;
	}

	public void setAreaType(Long areaType) {
		this.areaType = areaType;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
