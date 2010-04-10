package com.taobao.top.mapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * JSON列表注解。
 * 
 * @author carver.gu
 * @since 1.0, Sep 19, 2009
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.FIELD })
public @interface JsonList {

	/** JSON属性列表名称 **/
	public String list() default "";

	/** JSON属性元素名称 **/
	public String name() default "";

}
