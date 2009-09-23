package com.taobao.top.mapping;

import java.util.List;

import com.taobao.top.TopException;

/**
 * 格式转换器。
 * 
 * @author carver.gu
 * @since 1.0, Sep 19, 2009
 */
public interface Reader {

	/**
	 * 判断返回结果是否包含指定的属性。
	 * 
	 * @param name 属性名称
	 * @return true/false
	 */
	public boolean hasReturnField(Object name);

	/**
	 * 读取单个基本对象。
	 * 
	 * @param name 映射名称
	 * @return 基本对象值
	 */
	public Object getPrimitiveObject(Object name);

	/**
	 * 读取单个自定义对象。
	 * 
	 * @param name 映射名称
	 * @param type 映射类型
	 * @return 映射类型的实例
	 * @throws TopException
	 */
	public Object getObject(Object name, Class<?> type) throws TopException;

	/**
	 * 读取多个对象的值。
	 * 
	 * @param name 映射名称
	 * @param subType 嵌套映射类型
	 * @return 嵌套映射类型实例列表
	 * @throws TopException
	 */
	public List<?> getListObjects(Object name, Class<?> subType) throws TopException;

}
