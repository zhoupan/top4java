package com.taobao.top.util;

import java.util.List;
import java.util.Map;

import org.stringtree.json.JSONReader;

import com.taobao.top.TopException;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;
import com.taobao.top.mapping.JsonClass;

/**
 * 格式转换工具类。
 * 
 * @author fengsheng
 * @since 1.0, Sep 23, 2009
 */
public abstract class ConvertUtils {

	public static <T> ResponseList<T> toResponseList(String rsp, Class<T> clazz)
			throws TopException {
		ResponseList<T> rspList = new ResponseList<T>();
		JSONReader reader = new JSONReader();
		Map<?, ?> rootJson = (Map<?, ?>) reader.read(rsp);
		Map<?, ?> rspJson = (Map<?, ?>) rootJson.get("rsp");

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
			T obj = Converter.fromJson(objJson, clazz);
			if (obj != null) {
				rspList.addContent(obj);
			}
		}

		return rspList;
	}

	public static <T> T toResponse(String rsp, Class<T> clazz) throws TopException {
		ResponseList<T> rspList = toResponseList(rsp, clazz);
		return rspList.getFirst();
	}

	private static String getJsonClassName(Class<?> clazz) {
		JsonClass jsonClass = clazz.getAnnotation(JsonClass.class);
		if (jsonClass != null) {
			String alias = jsonClass.value();
			if (!StrUtils.isEmpty(alias)) {
				return alias;
			}
		}

		return null;
	}

}
