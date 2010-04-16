package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.items.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemsGetRequest implements TopRequest {

	private Long cid;
	private Integer endPrice;
	private Integer endScore;
	private Integer endVolume;
	private String fields;
	private Boolean genuineSecurity;
	private Boolean is3D;
	private Boolean isCod;
	private Boolean isMall;
	private Boolean isPrepay;
	private String locationCity;
	private String locationState;
	private String nicks;
	private Boolean oneStation;
	private String orderBy;
	private Integer pageNo;
	private Integer pageSize;
	private Boolean postFree;
	private Long productId;
	private String promotedService;
	private String props;
	private String q;
	private Integer startPrice;
	private Integer startScore;
	private Integer startVolume;
	private String stuffStatus;
	private Boolean wwStatus;

	public void setCid(Long cid) {
		this.cid = cid;
	}
	public void setEndPrice(Integer endPrice) {
		this.endPrice = endPrice;
	}
	public void setEndScore(Integer endScore) {
		this.endScore = endScore;
	}
	public void setEndVolume(Integer endVolume) {
		this.endVolume = endVolume;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setGenuineSecurity(Boolean genuineSecurity) {
		this.genuineSecurity = genuineSecurity;
	}
	public void setIs3D(Boolean is3D) {
		this.is3D = is3D;
	}
	public void setIsCod(Boolean isCod) {
		this.isCod = isCod;
	}
	public void setIsMall(Boolean isMall) {
		this.isMall = isMall;
	}
	public void setIsPrepay(Boolean isPrepay) {
		this.isPrepay = isPrepay;
	}
	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}
	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}
	public void setNicks(String nicks) {
		this.nicks = nicks;
	}
	public void setOneStation(Boolean oneStation) {
		this.oneStation = oneStation;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public void setPostFree(Boolean postFree) {
		this.postFree = postFree;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public void setPromotedService(String promotedService) {
		this.promotedService = promotedService;
	}
	public void setProps(String props) {
		this.props = props;
	}
	public void setQ(String q) {
		this.q = q;
	}
	public void setStartPrice(Integer startPrice) {
		this.startPrice = startPrice;
	}
	public void setStartScore(Integer startScore) {
		this.startScore = startScore;
	}
	public void setStartVolume(Integer startVolume) {
		this.startVolume = startVolume;
	}
	public void setStuffStatus(String stuffStatus) {
		this.stuffStatus = stuffStatus;
	}
	public void setWwStatus(Boolean wwStatus) {
		this.wwStatus = wwStatus;
	}

	public String getApiName() {
		return "taobao.items.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("cid", this.cid);
		params.put("end_price", this.endPrice);
		params.put("end_score", this.endScore);
		params.put("end_volume", this.endVolume);
		params.put("fields", this.fields);
		params.put("genuine_security", this.genuineSecurity);
		params.put("is_3D", this.is3D);
		params.put("is_cod", this.isCod);
		params.put("is_mall", this.isMall);
		params.put("is_prepay", this.isPrepay);
		params.put("location.city", this.locationCity);
		params.put("location.state", this.locationState);
		params.put("nicks", this.nicks);
		params.put("one_station", this.oneStation);
		params.put("order_by", this.orderBy);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("post_free", this.postFree);
		params.put("product_id", this.productId);
		params.put("promoted_service", this.promotedService);
		params.put("props", this.props);
		params.put("q", this.q);
		params.put("start_price", this.startPrice);
		params.put("start_score", this.startScore);
		params.put("start_volume", this.startVolume);
		params.put("stuff_status", this.stuffStatus);
		params.put("ww_status", this.wwStatus);
		return params;
	}

}
