package com.whd.design_patterns.clone;

public class Goods implements Cloneable{
	
	private Integer id;
	private Double price;
	private Integer num;
	private GoodsImage gi;
	
	public Goods(GoodsImage gi) {
		this.gi = gi;
	}
	public Goods(Integer id, Double price, Integer num) {
		this.id = id;
		this.price = price;
		this.num = num;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public GoodsImage getGi() {
		return gi;
	}
	public void setGi(GoodsImage gi) {
		this.gi = gi;
	}
	
	public Object clone(){
		Goods g = new Goods((GoodsImage) gi.clone());
		g.id = this.id;
		g.num = this.num;
		g.price = this.price;
		return g;
	}

}
