package com.taobao.top.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * TOP分页响应列表。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class PageList<T> implements Serializable {

	private static final long serialVersionUID = 1238749498860238250L;

	/** 所有记录数 */
	private Long totalResults;

	/** 解释后的具体对象 */
	private List<T> content;

	public Long getTotalResults() {
		return this.totalResults;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}

	public List<T> getContent() {
		return this.content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

	public void addContent(T content) {
		if (this.content == null) {
			this.content = new ArrayList<T>();
		}
		this.content.add(content);
	}

	/**
	 * 取得响应列表中的第一个对象。
	 * 
	 * @return 第一个对象或者null
	 */
	public T getFirst() {
		if (content != null && !content.isEmpty()) {
			return content.get(0);
		} else {
			return null;
		}
	}

	/**
	 * 判断响应列表是否为空。
	 * 
	 * @return true/false
	 */
	public boolean isEmpty() {
		return content == null || content.isEmpty();
	}

	/**
	 * 获取实际返回的记录数。
	 */
	public int getReturnResults() {
		if (isEmpty()) {
			return 0;
		} else {
			return content.size();
		}
	}

	/**
	 * 获取返回记录的总页数。
	 */
	public int getPageCount(int pageSize) {
		if (this.totalResults != null) {
			if (this.totalResults % pageSize == 0) {
				return this.totalResults.intValue() / pageSize;
			} else {
				return this.totalResults.intValue() / pageSize + 1;
			}
		}
		return 0;
	}

}
