package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 品牌结构。
 * 
 * @author carver.gu
 * @since 1.0, Nov 16, 2009
 */
public class Brand {

	/** 属性编号 */
	@JsonProperty("pid")
	private Long propId;

	/** 属性名 */
	@JsonProperty("prop_name")
	private String propName;

	/** 属性值编号 */
	@JsonProperty("vid")
	private Long valueId;

	/** 属性值名称 */
	@JsonProperty("name")
	private String valueName;

	public Long getPropId() {
		return this.propId;
	}

	public void setPropId(Long propId) {
		this.propId = propId;
	}

	public String getPropName() {
		return this.propName;
	}

	public void setPropName(String propName) {
		this.propName = propName;
	}

	public Long getValueId() {
		return this.valueId;
	}

	public void setValueId(Long valueId) {
		this.valueId = valueId;
	}

	public String getValueName() {
		return this.valueName;
	}

	public void setValueName(String valueName) {
		this.valueName = valueName;
	}

}
