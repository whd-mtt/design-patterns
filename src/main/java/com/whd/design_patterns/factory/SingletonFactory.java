package com.whd.design_patterns.factory;

public class SingletonFactory {
	
	private static SingletonFactory sf;
	private static Object objLock = new Object();
	
	private SingletonFactory(){
		
	}
	
	public static SingletonFactory getInstance(){
		if(null == sf){
			synchronized(objLock){
				if(null == sf){
					sf = new SingletonFactory();
				}
			}
		}
		
		return sf;
	}
	
//	public A_1DAO getADAO(){
//		return new A_1DAO();
//	}
//	
//	public BDAO getBDAO(){
//		return new BDAO();
//	}
//	
//	public CDAO getCDAO(){
//		return new CDAO();
//	}

}
