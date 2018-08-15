package com.whd.design_patterns.factory;

public class Test {
	
	public static void main(String[] args) {
		AbstractFactory af = AbstractFactory.getInstance();
		System.out.println(af);
	}

}
