package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemprops.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItempropsGetRequest implements TopRequest {

	private String childPath;
	private Long cid;
	private Date datetime;
	private String fields;
	private Boolean isColorProp;
	private Boolean isEnumProp;
	private Boolean isInputProp;
	private Boolean isItemProp;
	private Boolean isKeyProp;
	private Boolean isSaleProp;
	private Long parentPid;
	private Long pid;

	public void setChildPath(String childPath) {
		this.childPath = childPath;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setIsColorProp(Boolean isColorProp) {
		this.isColorProp = isColorProp;
	}
	public void setIsEnumProp(Boolean isEnumProp) {
		this.isEnumProp = isEnumProp;
	}
	public void setIsInputProp(Boolean isInputProp) {
		this.isInputProp = isInputProp;
	}
	public void setIsItemProp(Boolean isItemProp) {
		this.isItemProp = isItemProp;
	}
	public void setIsKeyProp(Boolean isKeyProp) {
		this.isKeyProp = isKeyProp;
	}
	public void setIsSaleProp(Boolean isSaleProp) {
		this.isSaleProp = isSaleProp;
	}
	public void setParentPid(Long parentPid) {
		this.parentPid = parentPid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getApiName() {
		return "taobao.itemprops.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("child_path", this.childPath);
		params.put("cid", this.cid);
		params.put("datetime", this.datetime);
		params.put("fields", this.fields);
		params.put("is_color_prop", this.isColorProp);
		params.put("is_enum_prop", this.isEnumProp);
		params.put("is_input_prop", this.isInputProp);
		params.put("is_item_prop", this.isItemProp);
		params.put("is_key_prop", this.isKeyProp);
		params.put("is_sale_prop", this.isSaleProp);
		params.put("parent_pid", this.parentPid);
		params.put("pid", this.pid);
		return params;
	}

}
