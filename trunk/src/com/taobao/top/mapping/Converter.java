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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.taobao.top.Constants;
import com.taobao.top.TopException;
import com.taobao.top.util.StrUtils;

public abstract class Converter {

	/**
	 * 把JSON格式的数据转换为对象。
	 * 
	 * @param <T> 泛型领域对象
	 * @param json JSON格式的数据
	 * @param clazz 泛型领域类型
	 * @return 领域对象
	 * @throws TopException
	 */
	public static <T> T fromJson(final Map<?, ?> json, Class<T> clazz) throws TopException {
		return convert(clazz, new Reader() {
			public Object getPrimitiveObject(Object name) {
				return json.get(name);
			}

			public Object getObject(Object name, Class<?> type) throws TopException {
				Object tmp = json.get(name);
				if (tmp instanceof Map<?, ?>) {
					Map<?, ?> map = (Map<?, ?>) tmp;
					return fromJson(map, type);
				} else {
					return null;
				}
			}

			public List<?> getListObjects(Object name, Class<?> subType) throws TopException {
				Object tmp = json.get(name);
				List<Object> listObjs = null;

				if (tmp instanceof List<?>) {
					listObjs = new ArrayList<Object>();
					List<?> tmpList = (List<?>) tmp;
					for (Object subTmp : tmpList) {
						if (subTmp instanceof Map<?, ?>) {
							Map<?, ?> subMap = (Map<?, ?>) subTmp;
							Object subObj = fromJson(subMap, subType);
							if (subObj != null) {
								listObjs.add(subObj);
							}
						}
					}
				}

				return listObjs;
			}
		});
	}

	private static <T> T convert(Class<T> clazz, Reader reader) throws TopException {
		T rsp = null;

		try {
			rsp = clazz.newInstance();
			BeanInfo beanInfo = Introspector.getBeanInfo(rsp.getClass());
			PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();

			for (PropertyDescriptor pd : pds) {
				Method method = pd.getWriteMethod();
				String name = pd.getName();

				if ("class".equals(name)) {
					continue;
				}

				Field field = getDeclaredField(clazz, name);
				JsonProperty jsonProp = field.getAnnotation(JsonProperty.class);
				if (jsonProp != null) {
					String alias = jsonProp.value();
					if (!StrUtils.isEmpty(alias)) {
						name = alias; // 使用注解别名
					}
				}

				Class<?> typeClass = field.getType();
				if (String.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(name);
					if (value != null) {
						method.invoke(rsp, value.toString());
					}
				} else if (Long.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(name);
					if (value != null) {
						method.invoke(rsp, Long.valueOf(value.toString()));
					}
				} else if (Integer.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(name);
					if (value != null) {
						method.invoke(rsp, Integer.valueOf(value.toString()));
					}
				} else if (Boolean.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(name);
					if (value != null) {
						method.invoke(rsp, Boolean.valueOf(value.toString()));
					}
				} else if (Double.class.isAssignableFrom(typeClass)) {
					Object value = reader.getPrimitiveObject(name);
					if (value != null) {
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
							Class<?> subType = (Class<?>) genericTypes[0];
							List<?> listObjs = reader.getListObjects(name, subType);
							if (listObjs != null) {
								method.invoke(rsp, reader.getListObjects(name, subType));
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

	private static <T> Field getDeclaredField(Class<T> clazz, String name)
			throws SecurityException, NoSuchFieldException {
		Field field = null;
		try {
			field = clazz.getDeclaredField(name);
		} catch (NoSuchFieldException e) {
			Class<? super T> superClass = clazz.getSuperclass();
			field = superClass.getDeclaredField(name);
		}
		return field;
	}

}
