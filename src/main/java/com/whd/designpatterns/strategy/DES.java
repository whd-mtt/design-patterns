package com.whd.designpatterns.strategy;

public class DES implements Encrypt {

	@Override
	public String encrypt(String s) {
		return "DES加密后的"+s;
	}

}
