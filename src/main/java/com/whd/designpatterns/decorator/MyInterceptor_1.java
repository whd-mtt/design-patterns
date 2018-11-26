package com.whd.designpatterns.decorator;

public class MyInterceptor_1 extends Interceptor{
	
	public MyInterceptor_1(Action action){
		super.action = action;
		this.invork();
	}
	
	@Override
	public Action invork() {
		System.out.println("演的了女王，晒的了下限，红的了脸颊，玩的了小清新");
		return action;
	}

}
