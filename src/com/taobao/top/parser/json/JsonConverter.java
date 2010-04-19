package com.taobao.top.parser.json;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.stringtree.json.JSONReader;

import com.taobao.top.TopException;
import com.taobao.top.domain.PageList;
import com.taobao.top.mapping.Converter;
import com.taobao.top.mapping.Converters;
import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonListClass;
import com.taobao.top.mapping.Reader;
import com.taobao.top.util.StrUtils;

/**
 * JSON格式转换器。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class JsonConverter implements Converter {

	public <T> PageList<T> toResponseList(String rsp, Class<T> clazz, String api) throws TopException {
		PageList<T> rspList = new PageList<T>();

		JSONReader reader = new JSONReader();
		Map<?, ?> rootJson = (Map<?, ?>) reader.read(rsp);
		if (rootJson == null) {
			return rspList;
		}

		Map<?, ?> rspJson = (Map<?, ?>) rootJson.get(getRootElement(api));
		if (rspJson == null || rspJson.isEmpty()) {
			return rspList;
		}

		Object totalResults = rspJson.get("total_results");
		if (totalResults instanceof Long) {
			rspList.setTotalResults((Long) totalResults);
		}

		Map<?, ?> listJsonMap = (Map<?, ?>) rspJson.get(getJsonListClassName(clazz));
		if (listJsonMap == null || listJsonMap.isEmpty()) {
			return rspList;
		}

		List<?> objJsonList = (List<?>) listJsonMap.get(getJsonClassName(clazz));
		for (Object tmp : objJsonList) {
			Map<?, ?> objJson = (Map<?, ?>) tmp;
			T obj = fromJson(objJson, clazz);
			if (obj != null) {
				rspList.addContent(obj);
			}
		}

		return rspList;
	}

	public <T> T toResponse(String rsp, Class<T> clazz, String api) throws TopException {
		JSONReader reader = new JSONReader();
		Map<?, ?> rootJson = (Map<?, ?>) reader.read(rsp);
		if (rootJson == null) {
			return null;
		}

		Map<?, ?> rspJson = (Map<?, ?>) rootJson.get(getRootElement(api));
		if (rspJson == null || rspJson.isEmpty()) {
			return null;
		}

		Map<?, ?> objJson = (Map<?, ?>) rspJson.get(getJsonClassName(clazz));
		return fromJson(objJson, clazz);
	}

	private String getJsonListClassName(Class<?> clazz) {
		JsonListClass jsonList = clazz.getAnnotation(JsonListClass.class);
		if (jsonList != null) {
			String alias = jsonList.value();
			if (!StrUtils.isEmpty(alias)) {
				return alias;
			}
		}

		return null;
	}

	private String getJsonClassName(Class<?> clazz) {
		JsonClass jsonClass = clazz.getAnnotation(JsonClass.class);
		if (jsonClass != null) {
			String alias = jsonClass.value();
			if (!StrUtils.isEmpty(alias)) {
				return alias;
			}
		}

		return null;
	}

	/**
	 * 把JSON格式的数据转换为对象。
	 * 
	 * @param <T> 泛型领域对象
	 * @param json JSON格式的数据
	 * @param clazz 泛型领域类型
	 * @return 领域对象
	 * @throws TopException
	 */
	public <T> T fromJson(final Map<?, ?> json, Class<T> clazz) throws TopException {
		return Converters.convert(clazz, new Reader() {
			public boolean hasReturnField(Object name) {
				return json.containsKey(name);
			}

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

			public List<?> getListObjects(Object listName, Object itemName, Class<?> subType) throws TopException {
				List<Object> listObjs = null;

				Object listTmp = json.get(listName);
				if (listTmp instanceof Map<?, ?>) {
					Map<?, ?> jsonMap = (Map<?, ?>) listTmp;
					Object itemTmp = jsonMap.get(itemName);
					if (itemTmp instanceof List<?>) {
						listObjs = new ArrayList<Object>();
						List<?> tmpList = (List<?>) itemTmp;
						for (Object subTmp : tmpList) {
							if (subTmp instanceof Map<?, ?>) {// object
								Map<?, ?> subMap = (Map<?, ?>) subTmp;
								Object subObj = fromJson(subMap, subType);
								if (subObj != null) {
									listObjs.add(subObj);
								}
							} else if (subTmp instanceof List<?>) {// array
								// TODO not support yet
							} else {// boolean, long, double, string, null
								listObjs.add(subTmp);
							}
						}
					}
				}

				return listObjs;
			}
		});
	}

	private String getRootElement(String api) {
		int pos = api.indexOf('.');
		if (pos != -1 && api.length() > pos) {
			api = api.substring(pos + 1).replace('.', '_');
		}

		return api + "_response";
	}

}
