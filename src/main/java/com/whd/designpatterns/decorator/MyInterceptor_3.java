package com.whd.designpatterns.decorator;

public class MyInterceptor_3 extends Interceptor{
	
	public MyInterceptor_3(Action action){
		super.action = action;
		this.invork();
	}
	
	public Action invork(){
		System.out.println("你要玩文艺我仰望星空。得之你幸，失之你命");
		return action;
	}

}
