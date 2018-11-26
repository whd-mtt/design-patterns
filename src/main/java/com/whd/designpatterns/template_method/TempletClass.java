package com.whd.designpatterns.template_method;

public abstract class TempletClass {
	
	public abstract void abstractMethod_1();
	public abstract void abstractMethod_2();
	
	public void templetMethod(){
		abstractMethod_1();
		abstractMethod_2();
		System.out.println("3L你比欢欢姐强多了");
	}

}
