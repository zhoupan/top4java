package com.taobao.top.parser;

/**
 * OP响应解释器接口。响应格式可以是JSON, XML等等。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public interface TopParser<T> {

	/**
	 * 把响应字符串解释成相应的领域对象。
	 * 
	 * @param body 响应字符串
	 * @return 领域对象
	 */
	public T parse(String body);

}
