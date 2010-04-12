package com.taobao.top.parser.json;

import com.taobao.top.TopException;
import com.taobao.top.domain.PageList;
import com.taobao.top.mapping.Converter;
import com.taobao.top.parser.TopParser;

/**
 * 列表JSON对象列表解释器。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ListJsonParser<T> implements TopParser<PageList<T>> {

	private Class<T> clazz;

	public ListJsonParser(Class<T> clazz) {
		this.clazz = clazz;
	}

	public PageList<T> parse(String rsp, String api) throws TopException {
		Converter converter = new JsonConverter();
		return converter.toResponseList(rsp, clazz, api);
	}

}
