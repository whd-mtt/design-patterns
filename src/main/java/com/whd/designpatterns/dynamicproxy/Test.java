package com.whd.designpatterns.dynamicproxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clzz = Class.forName("dynamicproxy.RegsitAction");
 
        // 获得被代理类的类加载器，使得JVM能够加载并找到被代理类的内部结构，以及已实现的interface  
        ClassLoader loader = clzz.getClassLoader();  
 
        // 获得被代理类已实现的所有接口interface,使得动态代理类的实例  
        Class<?>[] interfaces = clzz.getInterfaces();  
 
        // 用被代理类的实例创建动态代理类的实例，用于真正调用处理程序  
        InvocationHandler handler = null;
		try {
			handler = new ProxyDemo(clzz.newInstance());
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
 
        /*  
         * loader : 被代理类的类加载器  
         * interfaces ：被代理类已实现的所有接口，而这些是动态代理类要实现的接口列表  
         * handler ： 用被代理类的实例创建动态代理类的实例，用于真正调用处理程序  
         *   
         * return ：返回实现了被代理类所实现的所有接口的Object对象，即动态代理，需要强制转型  
         */ 
        //获得代理的实例  
        Action action = (Action) Proxy.newProxyInstance(loader, interfaces, handler);  
 
        action.execute();  
        //打印出该代理实例的名称  
        System.out.println(action.getClass().getName());  

	}

}
