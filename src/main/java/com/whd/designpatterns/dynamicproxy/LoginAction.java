package com.whd.designpatterns.dynamicproxy;

public class LoginAction implements Action{

	@Override
	public void execute() {
		System.out.println("login");
	}

}
