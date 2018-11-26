package com.whd.designpatterns.facade;

public class FacaeDemo {
	
	public void method_1(){
		AClass ac = new AClass();
		ac.method_1();
		
		BClass bc = new BClass();
		bc.b_method_1();
	}
	
	public void method_2(){
		AClass ac = new AClass();
		ac.method_2();
		
		CClass bc = new CClass();
		bc.c_method_1();
		bc.c_method_1();
	}

}
