package com.whd.design_patterns.factory;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Properties;

public class DAOFactory extends AbstractFactory {

	@Override
	public DAOInterface getDAO(String name) throws ClassTypeException {
		Properties pro = new Properties();
		try {
			pro.load(this.getClass().getResourceAsStream("/dao.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String className = pro.getProperty(name);
		Object obj = null;
		try {
			obj = Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(obj instanceof DAOInterface){
			return (DAOInterface)obj;
		}else{
			throw new ClassTypeException();
		}
		
	}
}
