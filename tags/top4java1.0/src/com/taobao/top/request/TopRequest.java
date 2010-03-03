package com.taobao.top.request;

import java.util.Map;

/**
 * TOP请求接口。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public interface TopRequest {

	/**
	 * 获取TOP的API名称。
	 * 
	 * @return API名称
	 */
	public String getApiName();

	/**
	 * 获取所有的Key-Value形式的文本请求参数集合。其中：
	 * <ul>
	 * <li>Key: 请求参数名</li>
	 * <li>Value: 请求参数值</li>
	 * </ul>
	 * 
	 * @return 文本请求参数集合
	 */
	public Map<String, String> getTextParams();

}
