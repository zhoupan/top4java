package com.taobao.top.parser.json;

import com.taobao.top.TopException;
import com.taobao.top.mapping.Converter;
import com.taobao.top.parser.TopParser;

/**
 * 通用JSON对象解释器。
 * 
 * @author carver.gu
 * @since 1.0, Oct 12, 2009
 */
public class ObjectJsonParser<T> implements TopParser<T> {

	private Class<T> clazz;

	public ObjectJsonParser(Class<T> clazz) {
		this.clazz = clazz;
	}

	public T parse(String rsp) throws TopException {
		Converter converter = new JsonConverter();
		return converter.toResponse(rsp, clazz);
	}

}
