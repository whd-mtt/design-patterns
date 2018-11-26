package com.whd.designpatterns.builder;

public class GamePanel {
	
	public static void main(String[] args) {
		Build build = new Build();
		build.createTank(new SimpleTank());
		
		build.createTank(new SuperTank());
	}

}
