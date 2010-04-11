package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.app.subapp.apply
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class AppSubappApplyRequest implements TopRequest {

	private String callbackUrl;
	private FileItem logo;
	private String notifyUrl;
	private String parentAppKey;
	private String serviceCode;
	private String title;

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	public void setLogo(FileItem logo) {
		this.logo = logo;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public void setParentAppKey(String parentAppKey) {
		this.parentAppKey = parentAppKey;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getApiName() {
		return "taobao.app.subapp.apply";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("callback_url", this.callbackUrl);
		params.put("notify_url", this.notifyUrl);
		params.put("parent_app_key", this.parentAppKey);
		params.put("service_code", this.serviceCode);
		params.put("title", this.title);
		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("logo", this.logo);
		return params;
	}

}
