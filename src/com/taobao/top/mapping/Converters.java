package com.taobao.top.mapping;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.taobao.top.Constants;
import com.taobao.top.TopException;
import com.taobao.top.domain.BaseObject;
import com.taobao.top.util.StrUtils;

/**
 * 转换工具类。
 * 
 * @author carver.gu
 * @since 1.0, Oct 12, 2009
 */
public class Converters {

	private Converters() {
	}

	/**
	 * 使用指定 的读取器去转换字符串为对象。
	 * 
	 * @param <T> 领域泛型
	 * @param clazz 领域类型
	 * @param reader 读取器
	 * @return 领域对象
	 * @throws TopException
	 */
	public static <T> T convert(Class<T> clazz, Reader reader) throws TopException {
		T rsp = null;

		try {
			rsp = clazz.newInstance();
			BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
			PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();

			for (PropertyDescriptor pd : pds) {
				Method method = pd.getWriteMethod();
				String name = pd.getName();

				if ("class".equals(name)) {
					continue; // ignore class field
				}

				Field field = getDeclaredField(clazz, name);
				JsonProperty jsonProp = field.getAnnotation(JsonProperty.class);
				if (jsonProp != null) {
					String alias = jsonProp.value();
					if (!StrUtils.isEmpty(alias)) {
						name = alias; // use annotation name
					}
				}

				if (!reader.hasReturnField(name)) {
					continue; // ignore non-return field
				}

				Class<?> typeClass = field.getType();
				if (String.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(name);
					method.invoke(rsp, value.toString());
				} else if (Long.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(name);
					if (value instanceof Long) {
						method.invoke(rsp, (Long) value);
					} else {
						method.invoke(rsp, Long.valueOf(value.toString()));
					}
				} else if (Integer.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(name);
					if (value instanceof Integer) {
						method.invoke(rsp, (Integer) value);
					} else {
						method.invoke(rsp, Integer.valueOf(value.toString()));
					}
				} else if (Boolean.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(name);
					if (value instanceof Boolean) {
						method.invoke(rsp, (Boolean) value);
					} else {
						method.invoke(rsp, Boolean.valueOf(value.toString()));
					}
				} else if (Double.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(name);
					if (value instanceof Double) {
						method.invoke(rsp, (Double) value);
					} else {
						method.invoke(rsp, Double.valueOf(value.toString()));
					}
				} else if (Date.class.isAssignableFrom(typeClass)) {
					DateFormat format = new SimpleDateFormat(Constants.DATE_TIME_FORMAT);
					Object value = reader.getPrimitiveObject(name);
					if (value instanceof String) {
						method.invoke(rsp, format.parse(value.toString()));
					}
				} else if (List.class.isAssignableFrom(typeClass)) {
					Type fieldType = field.getGenericType();
					if (fieldType instanceof ParameterizedType) {
						ParameterizedType paramType = (ParameterizedType) fieldType;
						Type[] genericTypes = paramType.getActualTypeArguments();
						if (genericTypes != null && genericTypes.length > 0) {
							if (genericTypes[0] instanceof Class<?>) {
								Class<?> subType = (Class<?>) genericTypes[0];
								List<?> listObjs = reader.getListObjects(name, subType);
								if (listObjs != null) {
									method.invoke(rsp, reader.getListObjects(name, subType));
								}
							}
						}
					}
				} else {
					Object obj = reader.getObject(name, typeClass);
					if (obj != null) {
						method.invoke(rsp, obj);
					}
				}
			}
		} catch (Exception e) {
			throw new TopException(e);
		}

		return rsp;
	}

	private static <T> Field getDeclaredField(Class<T> clazz, String name) throws NoSuchFieldException {
		Field field;

		if ("created".equals(name) || "modified".equals(name)) {
			field = BaseObject.class.getDeclaredField(name);
		} else {
			field = clazz.getDeclaredField(name);
		}

		return field;
	}

}
