package com.whd.designpatterns.template_method;

public abstract class 试卷 {
	
	public boolean method_1(){
		System.out.println("刘玲玲丑吗?");
		return answer_1();
	}
	
	public abstract boolean answer_1();

	public boolean method_2(){
		System.out.println("吴浩冬丑吗?");
		return answer_2();
	}
	
	public abstract boolean answer_2();

}
