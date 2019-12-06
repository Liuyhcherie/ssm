package com.test.bean;

import org.springframework.stereotype.Component;

@Component
public class Goods {
	private String goodsid;
	private String goodsname;
	private String price;
	private String goodsdesc;
	private String goodsjpg;
	
	public Goods() {
		super();
	}
	public String getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getGoodsdesc() {
		return goodsdesc;
	}
	public void setGoodsdesc(String goodsdesc) {
		this.goodsdesc = goodsdesc;
	}
	public String getGoodsjpg() {
		return goodsjpg;
	}
	public void setGoodsjpg(String goodsjpg) {
		this.goodsjpg = goodsjpg;
	}
	
}
