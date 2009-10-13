package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.itemprops.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemPropsGetRequest implements TopRequest {

	/** 要返回的字段列表 */
	private String fields;

	/** 叶子类目编号 */
	private String cid;

	/** 属性编号 */
	private String pid;

	/** 父属性编号 */
	private String parentPid;

	/** 是否关键属性 */
	private Boolean keyProp;

	/** 是否销售属性 */
	private Boolean saleProp;

	/** 是否颜色属性 */
	private Boolean colorProp;

	/** 是否枚举属性 */
	private Boolean enumProp;

	/** 是否是卖家可以自行输入的属性 */
	private Boolean inputProp;

	/** 是否商品属性 */
	private Boolean itemProp;

	/** 增量时间戳 */
	private Date dateTime;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public void setParentPid(String parentPid) {
		this.parentPid = parentPid;
	}

	public void setKeyProp(Boolean keyProp) {
		this.keyProp = keyProp;
	}

	public void setSaleProp(Boolean saleProp) {
		this.saleProp = saleProp;
	}

	public void setColorProp(Boolean colorProp) {
		this.colorProp = colorProp;
	}

	public void setEnumProp(Boolean enumProp) {
		this.enumProp = enumProp;
	}

	public void setInputProp(Boolean inputProp) {
		this.inputProp = inputProp;
	}

	public void setItemProp(Boolean itemProp) {
		this.itemProp = itemProp;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getApiName() {
		return "taobao.itemprops.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("cid", this.cid);
		params.put("pid", this.pid);
		params.put("parent_pid", this.parentPid);
		params.put("is_key_prop", this.keyProp);
		params.put("is_sale_prop", this.saleProp);
		params.put("is_color_prop", this.colorProp);
		params.put("is_enum_prop", this.enumProp);
		params.put("is_input_prop", this.inputProp);
		params.put("is_item_prop", this.itemProp);
		params.put("datetime", this.dateTime);

		return params;
	}

}
