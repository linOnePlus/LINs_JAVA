package com.lin.pojo;

import java.util.List;

public class QueryVo {

	
	//商品
	private Items items;
	
	private List<Items> itemList;

	public List<Items> getItemList() {
		return itemList;
	}

	public void setItemList(List<Items> itemList) {
		this.itemList = itemList;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}
	
	
}
