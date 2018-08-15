package com.whd.design_patterns.decorator;

public abstract class Interceptor implements Action{
	
	public Action action;
	
	public Interceptor(){
		
	}
	
	public Interceptor(Action action){
		this.action = action;
		this.invork();
	}
	
//	public Interceptor(Interceptor interceptor){
//		this.action = interceptor.invork();
//	}
	
	public String execute(){
		
		return action.execute();
	}

	public abstract Action invork();

}
