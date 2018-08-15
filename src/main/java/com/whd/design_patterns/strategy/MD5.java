package com.whd.design_patterns.strategy;

public class MD5 implements Encrypt{
	
	public String encrypt(String str){
		return "MD5加密后的"+str;
	}

}
