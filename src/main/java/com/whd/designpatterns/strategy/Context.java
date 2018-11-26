package com.whd.designpatterns.strategy;

/**
 * 上下文，用于获取策略
 */
public class Context {
	
	private Encrypt e;
	
	public Context(Encrypt e){
		this.e = e;
	}
	
	public String getString(String s){
		return e.encrypt(s);
	}

}
