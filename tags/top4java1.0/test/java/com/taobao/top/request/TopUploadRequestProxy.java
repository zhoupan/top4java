package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.FileItem;

/**
 * TOP上传请求代理。
 * 
 * @author carver.gu
 * @since 1.0, Nov 18, 2009
 */
public class TopUploadRequestProxy extends TopRequestProxy implements TopUploadRequest {

	private TopUploadRequest request;

	public TopUploadRequestProxy(TopUploadRequest request, String nick) {
		super(request, nick);
		this.request = request;
	}

	public Map<String, FileItem> getFileParams() {
		return request.getFileParams();
	}

}
