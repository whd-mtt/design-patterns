package com.whd.designpatterns.builder;

public class Build {
	
	
	public Tank createTank(Tank t){
		System.out.println("speed:"+t.speed());
		System.out.println("hp:"+t.getHP());
		return t;
	}
	
	

}
