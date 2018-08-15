package com.whd.design_patterns.dynamicproxy;

public class LoginAction implements Action{

	@Override
	public void execute() {
		System.out.println("login");
	}

}
