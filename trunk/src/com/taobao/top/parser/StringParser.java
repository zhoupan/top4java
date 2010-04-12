package com.taobao.top.parser;

/**
 * 不作任何处理，直接返回响应字符串。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class StringParser implements TopParser<String> {

	public String parse(String rsp, String api) {
		return rsp;
	}

}
