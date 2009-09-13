package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemprops.get.v2
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemPropsGetRequest implements TopRequest {

	/** 返回的字段 */
	private String fields;

	/** 叶子类目编号 */
	private String leafCid;

	/** 属性编号 */
	private String pid;

	/** 父属性编号 */
	private String Parentpid;

	/** 是否关键属性 */
	private Boolean isKeyProp;

	/** 是否销售属性 */
	private Boolean isSaleProp;

	/** 是否颜色属性 */
	private Boolean isColorProp;

	/** 是否枚举属性 */
	private Boolean isEnumProp;

	/** 是否是卖家可以自行输入的属性 */
	private Boolean isInputProp;

	/** 是否商品属性 */
	private Boolean isItemProp;

	/** 增量时间戳 */
	private Date dateTime;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setLeafCid(String leafCid) {
		this.leafCid = leafCid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public void setParentpid(String parentpid) {
		this.Parentpid = parentpid;
	}

	public void setIsKeyProp(Boolean isKeyProp) {
		this.isKeyProp = isKeyProp;
	}

	public void setIsSaleProp(Boolean isSaleProp) {
		this.isSaleProp = isSaleProp;
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

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getApiName() {
		return "taobao.itemprops.get.v2";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("cid", this.leafCid);
		params.put("pid", this.pid);
		params.put("parent_pid", this.Parentpid);
		params.put("is_key_prop", this.isKeyProp);
		params.put("is_sale_prop", this.isSaleProp);
		params.put("is_color_prop", this.isColorProp);
		params.put("is_enum_prop", this.isEnumProp);
		params.put("is_input_prop", this.isInputProp);
		params.put("is_item_prop", this.isItemProp);
		params.put("datetime", this.dateTime);

		return params;
	}

}
