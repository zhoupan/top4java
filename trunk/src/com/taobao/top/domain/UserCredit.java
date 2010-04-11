package com.taobao.top.domain;

import com.taobao.top.mapping.JsonClass;
import com.taobao.top.mapping.JsonField;

/**
 * UserCredit Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@JsonClass("user_credit")
public class UserCredit extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonField("good_num")
	private Integer goodNum;

	@JsonField("level")
	private Integer level;

	@JsonField("score")
	private Integer score;

	@JsonField("total_num")
	private Integer totalNum;

	public Integer getGoodNum() {
		return this.goodNum;
	}
	public void setGoodNum(Integer goodNum) {
		this.goodNum = goodNum;
	}

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

}
