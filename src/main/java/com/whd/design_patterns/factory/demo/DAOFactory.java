package com.whd.design_patterns.factory.demo;

public class DAOFactory {
	
	private static DAOFactory df = new DAOFactory();
	
	private DAOFactory(){
		
	}
	
	public static DAOFactory getInstance(){
		if(null == df)
			df = new DAOFactory();
		return df;
	}
	
	public DAOInteface getDAOInterface(String name){
		switch(name){
		case "ADAO":
			return new ADAO();
			
		}
		return null;
	}


}
