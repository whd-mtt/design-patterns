package com.whd.design_patterns.clone;

public class Start {
	
	public static void main(String[] args) { //浅表克隆
		Goods g_1 = new Goods(1,99.80D,3);
		g_1.setGi(new GoodsImage(1,"D:/img.jpg"));
		
		Goods g_2 = (Goods) g_1.clone();
		g_2.getGi().setImgAddress("E:/img_2.jgp");
		
		System.out.println(g_2.getId());
		System.out.println(g_1.getGi().getImgAddress());
	
	}

}
