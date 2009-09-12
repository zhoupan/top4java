package com.taobao.top;

import com.taobao.top.parser.TopParser;
import com.taobao.top.request.TopRequest;

/**
 * TOP客户端。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public interface TopClient {

	/**
	 * 执行TOP公开API请求。
	 * 
	 * @param <T> 领域对象
	 * @param request 具体的TOP请求
	 * @param parser 具体的TOP响应解释器
	 * @return 领域对象
	 */
	public <T> T execute(TopRequest request, TopParser<T> parser)
			throws TopException;

	/**
	 * 执行TOP隐私API请求。
	 * 
	 * @param <T> 领域对象
	 * @param request 具体的TOP请求
	 * @param parser 具体的TOP响应解释器
	 * @param session 用户会话授权码
	 * @return 领域对象
	 */
	public <T> T execute(TopRequest request, TopParser<T> parser, String session)
			throws TopException;

}
