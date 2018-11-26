package com.whd.designpatterns.decorator;

public class Start {

	public static void main(String[] args) {
		TestAction ta = new TestAction();
		MyInterceptor_1 it_1 = new MyInterceptor_1(ta);
//		MyInterceptor_2 it_2 = new MyInterceptor_2(it_1);
		MyInterceptor_3 it_3 = new MyInterceptor_3(it_1);
		String s = it_3.execute();
		System.out.println(s);
	}

}
