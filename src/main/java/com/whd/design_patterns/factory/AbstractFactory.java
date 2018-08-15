package com.whd.design_patterns.factory;

import java.io.IOException;
import java.util.Properties;

public abstract class AbstractFactory {
	
	private static AbstractFactory sf;
	private static final String DEFAUTL_FACTORY = "com.woniuxy.oo.factory.DAOFactory";
	private static Object objLock = new Object();
	
	@Deprecated
	public AbstractFactory(){ }
	
	public static AbstractFactory getInstance(){
		if(null == sf){
			synchronized(objLock){
				if(null == sf){
					Properties pro = new Properties();
					try {
						pro.load(AbstractFactory.class.getResourceAsStream("/dao.properties"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					try {
						sf = (AbstractFactory)Class.forName(DEFAUTL_FACTORY).newInstance();
					} catch (InstantiationException | IllegalAccessException
							| ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

		return sf;
	}
		
	public static AbstractFactory getInstance(String className){
		if(null == sf){
			synchronized(objLock){
				if(null == sf){
					Properties pro = new Properties();
					try {
						pro.load(AbstractFactory.class.getResourceAsStream("/dao.properties"));
					} catch (IOException e) {
						e.printStackTrace();
					}
						
					String factoryName = pro.getProperty(className);
					if(null == factoryName || factoryName.trim().length() <= 0)
						factoryName = DEFAUTL_FACTORY;
						
					try {
						sf = (AbstractFactory)Class.forName(factoryName).newInstance();
					} catch (InstantiationException | IllegalAccessException
								| ClassNotFoundException e) {
						e.printStackTrace();
					}
						
					}
				}
			}
		
		return sf;
	}
	
	public abstract DAOInterface getDAO(String name) throws ClassTypeException;
	
	

}
