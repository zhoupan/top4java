package com.taobao.top.parser.json;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.stringtree.json.JSONReader;

import com.taobao.top.TopException;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;
import com.taobao.top.mapping.Converters;
import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.Reader;
import com.taobao.top.util.StrUtils;

/**
 * JSON格式转换器。
 * 
 * @author carver.gu
 * @since 1.0, Oct 12, 2009
 */
public class JsonConverter implements Converter {

	public <T> ResponseList<T> toResponseList(String rsp, Class<T> clazz) throws TopException {
		ResponseList<T> rspList = new ResponseList<T>();

		JSONReader reader = new JSONReader();
		Map<?, ?> rootJson = (Map<?, ?>) reader.read(rsp);
		Map<?, ?> rspJson = (Map<?, ?>) rootJson.get("rsp");
		if (rspJson == null || rspJson.isEmpty()) {
			return rspList;
		}

		Object totalResults = rspJson.get("totalResults");
		if (totalResults != null) {
			if (totalResults instanceof Long) {
				rspList.setTotalResults((Long) totalResults);
			} else {
				rspList.setTotalResults(Long.valueOf(totalResults.toString()));
			}
		}

		String jsonClassName = getJsonClassName(clazz);
		List<?> objJsonList = (List<?>) rspJson.get(jsonClassName);

		for (Object tmp : objJsonList) {
			Map<?, ?> objJson = (Map<?, ?>) tmp;
			T obj = fromJson(objJson, clazz);
			if (obj != null) {
				rspList.addContent(obj);
			}
		}

		return rspList;
	}

	public <T> T toResponse(String rsp, Class<T> clazz) throws TopException {
		ResponseList<T> rspList = toResponseList(rsp, clazz);
		return rspList.getFirst();
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

			public List<?> getListObjects(Object name, Class<?> subType) throws TopException {
				Object tmp = json.get(name);
				List<Object> listObjs = null;

				if (tmp instanceof List<?>) {
					listObjs = new ArrayList<Object>();
					List<?> tmpList = (List<?>) tmp;
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

				return listObjs;
			}
		});
	}

}
