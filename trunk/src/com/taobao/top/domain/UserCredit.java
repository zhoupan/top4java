package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * 用户信用。
 * 
 * @author carver.gu
 * @since 1.0, Sep 17, 2009
 */
public class UserCredit extends BaseObject {

	/** 信用等级。 */
	@JsonProperty("level")
	private Integer level;

	/** 信用总分。 */
	@JsonProperty("score")
	private Integer score;

	/** 收到的评价总条数。 */
	@JsonProperty("total_num")
	private Integer totalNum;

	/** 收到的好评总条数。 */
	@JsonProperty("good_num")
	private Integer goodNum;

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
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

}
