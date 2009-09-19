package com.taobao.top.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * TOP响应列表。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class ResponseList<T> {

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
	public T GetFirst() {
		if (content != null && !content.isEmpty()) {
			return content.get(0);
		} else {
			return null;
		}
	}
}
