package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.domain.Location;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.items.get
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ItemsGetRequest implements TopRequest {

	/** 商品数据结构字段列表 */
	private String fields;

	/** 搜索字段 */
	private String query;

	/** 卖家昵称列表 */
	private String nicks;

	/** 商品所属类目编号 */
	private String cid;

	/** 商品最低价格 */
	private String startPrice;

	/** 商品最高价格 */
	private String endPrice;

	/** 页码 */
	private Integer pageNo;

	/** 每页条数 */
	private Integer pageSize;

	/** 排序方式 */
	private String orderBy;

	/** 商品属性 */
	private String props;

	/** 可以根据产品编号搜索属于这个SPU的商品 */
	private String productId;

	/** 旺旺在线状态 */
	private String wwStatus;

	/** 免运费 */
	private String postFree;

	/** 所有地 */
	public Location location;

	public String getApiName() {
		return "taobao.items.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("fields", this.fields);
		params.put("q", this.query);
		params.put("nicks", this.nicks);
		params.put("cid", this.cid);
		params.put("start_price", this.startPrice);
		params.put("end_price", this.endPrice);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("order_by", this.orderBy);
		params.put("props", this.props);
		params.put("product_id", this.productId);
		params.put("ww_status", this.wwStatus);
		params.put("post_free", this.postFree);

		if (this.location != null) {
			params.put("location.state", this.location.getState());
			params.put("location.city", this.location.getCity());
		}

		return params;
	}

}
