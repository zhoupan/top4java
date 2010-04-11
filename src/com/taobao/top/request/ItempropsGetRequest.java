package com.taobao.top.request;

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
	private String datetime;
	private String fields;
	private String isColorProp;
	private String isEnumProp;
	private String isInputProp;
	private String isItemProp;
	private String isKeyProp;
	private String isSaleProp;
	private Long parentPid;
	private Long pid;

	public void setChildPath(String childPath) {
		this.childPath = childPath;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setIsColorProp(String isColorProp) {
		this.isColorProp = isColorProp;
	}
	public void setIsEnumProp(String isEnumProp) {
		this.isEnumProp = isEnumProp;
	}
	public void setIsInputProp(String isInputProp) {
		this.isInputProp = isInputProp;
	}
	public void setIsItemProp(String isItemProp) {
		this.isItemProp = isItemProp;
	}
	public void setIsKeyProp(String isKeyProp) {
		this.isKeyProp = isKeyProp;
	}
	public void setIsSaleProp(String isSaleProp) {
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
