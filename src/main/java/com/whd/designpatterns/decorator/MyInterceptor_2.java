package com.whd.designpatterns.decorator;

public class MyInterceptor_2 extends Interceptor{
	
	public MyInterceptor_2(Action action){
		super.action = action;
		this.invork();
	}
	
	public Action invork(){
		System.out.println("咽得下重口味，斥退过死皮赖脸的无知少年，躲过了不怀好意的搭讪大叔，你讲笑话我可以拍桌大笑，");
		return action;
	}

}
