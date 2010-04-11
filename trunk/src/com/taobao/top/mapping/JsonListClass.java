package com.taobao.top.mapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * JSON列表类型注解。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.TYPE })
public @interface JsonListClass {

	/** JSON列表类型映射名称 **/
	public String value() default "";

}
