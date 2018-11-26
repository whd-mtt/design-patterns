package com.whd.designpatterns.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyDemo implements InvocationHandler {
	
	private Object obj;
	
	public ProxyDemo(Object obj){
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("方法代理");
		return method.invoke(obj, args);
	}

}
