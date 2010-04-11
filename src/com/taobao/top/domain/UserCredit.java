package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * UserCredit Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class UserCredit extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("level")
	private Integer level;

	@JsonProperty("total_num")
	private Integer totalNum;

	@JsonProperty("good_num")
	private Integer goodNum;

	@JsonProperty("score")
	private Integer score;

	public Integer getLevel() {
		return this.level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}
	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getGoodNum() {
		return this.goodNum;
	}
	public void setGoodNum(Integer goodNum) {
		this.goodNum = goodNum;
	}

	public Integer getScore() {
		return this.score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}

}
