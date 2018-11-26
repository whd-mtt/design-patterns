package com.whd.designpatterns.strategy;

public class Client {
	
	public static void main(String[] args) {
		Context c = new Context(new DES());
		System.out.println(c.getString("mes"));
		
		c = new Context(new MD5());
		System.out.println(c.getString("mes"));
	}

}
