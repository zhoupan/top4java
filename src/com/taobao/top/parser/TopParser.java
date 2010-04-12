package com.taobao.top.parser;

import com.taobao.top.TopException;

/**
 * TOP响应解释器接口。响应格式可以是JSON, XML等等。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public interface TopParser<T> {

	/**
	 * 把响应字符串解释成相应的领域对象。
	 * 
	 * @param rsp 响应字符串
	 * @param api 接口名称
	 * @return 领域对象
	 */
	public T parse(String rsp, String api) throws TopException;

}
