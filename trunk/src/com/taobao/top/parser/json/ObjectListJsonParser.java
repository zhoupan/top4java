package com.taobao.top.parser.json;

import com.taobao.top.TopException;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;
import com.taobao.top.parser.TopParser;

/**
 * 通用JSON对象列表解释器。
 * 
 * @author carver.gu
 * @since 1.0, Oct 12, 2009
 */
public class ObjectListJsonParser<T> implements TopParser<ResponseList<T>> {

	private Class<T> clazz;

	public ObjectListJsonParser(Class<T> clazz) {
		this.clazz = clazz;
	}

	public ResponseList<T> parse(String rsp) throws TopException {
		Converter converter = new JsonConverter();
		return converter.toResponseList(rsp, clazz);
	}

}
