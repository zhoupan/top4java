package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.app.subapp.apply
 * 
 * @author carver.gu
 * @since 1.0, Oct 19, 2009
 */
public class SubappApplyRequest implements TopRequest {

	/** 父应用的编号 */
	private String parentAppKey;

	/** 子应用的标题 */
	private String title;

	/** 子应用回调地址 */
	private String callbackUrl;

	/** 子应用通知地址 */
	private String notifyUrl;

	/** 申请子应用需要用户开通的服务码 */
	private String serviceCode;

	/** 子应用图标 */
	private FileItem logo;

	public void setParentAppKey(String parentAppKey) {
		this.parentAppKey = parentAppKey;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public void setLogo(FileItem logo) {
		this.logo = logo;
	}

	public String getApiName() {
		return "taobao.app.subapp.apply ";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("parent_app_key", this.parentAppKey);
		params.put("title", this.title);
		params.put("callback_url", this.callbackUrl);
		params.put("notify_url", this.notifyUrl);
		params.put("service_code", this.serviceCode);
		params.put("logo", this.logo);
		return params;
	}

}
