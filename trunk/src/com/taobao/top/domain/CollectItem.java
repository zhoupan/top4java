package com.taobao.top.domain;

import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListClass;

/**
 * CollectItem Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("collect_item")
@ApiListClass("collect_items")
public class CollectItem extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("item_numid")
	private Long itemNumid;

	public Long getItemNumid() {
		return this.itemNumid;
	}
	public void setItemNumid(Long itemNumid) {
		this.itemNumid = itemNumid;
	}

}
