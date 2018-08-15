package com.whd.design_patterns.builder;

public class GamePanel {
	
	public static void main(String[] args) {
		Build build = new Build();
		build.createTank(new SimpleTank());
		
		build.createTank(new SuperTank());
	}

}
