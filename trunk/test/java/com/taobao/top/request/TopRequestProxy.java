package com.taobao.top.request;

import java.util.Map;

/**
 * TOP请求代理。
 * 
 * @author carver.gu
 * @since 1.0, Nov 18, 2009
 */
public class TopRequestProxy implements TopRequest {

	private TopRequest request;
	private String nick;

	public TopRequestProxy(TopRequest request, String nick) {
		this.request = request;
		this.nick = nick;
	}

	@Override
	public String getApiName() {
		return request.getApiName();
	}

	@Override
	public Map<String, String> getTextParams() {
		Map<String, String> params = request.getTextParams();
		params.put("session", "xxx");
		params.put("session_id", "xxx");
		params.put("session_nick", this.nick);
		return params;
	}

}
