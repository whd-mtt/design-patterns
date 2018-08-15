package com.whd.design_patterns.singleton;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(null == instance)
			instance = new Singleton();
		
		return instance;
	}

}
