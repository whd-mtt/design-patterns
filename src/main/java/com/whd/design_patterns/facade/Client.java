package com.whd.design_patterns.facade;

public class Client {
	
	public static void main(String[] args) {
		
		Client c = new Client();
		c.method_1();
		c.method_2();
	}

	//假设这是一个类
	private void method_2() {
		FacaeDemo fd = new FacaeDemo();
		fd.method_2();
	}

	//假设这是一个类
	private void method_1() {
		FacaeDemo fd = new FacaeDemo();
		fd.method_1();
	}

}
