package com.taobao.top.mapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * JSON类型注解。
 * 
 * @author carver.gu
 * @since 1.0, Sep 23, 2009
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.TYPE })
public @interface JsonClass {

	/** JSON类型映射名称 **/
	public String value() default "";

}
