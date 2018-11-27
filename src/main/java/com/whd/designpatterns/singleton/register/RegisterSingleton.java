package com.whd.designpatterns.singleton.register;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/27 22:23
 * @apiNote 注册式单例模式（在spring中用到的比较多）
 **/
public class RegisterSingleton {

    private RegisterSingleton(){}

    /***
     * 注册登记式单例模式，在没使用一次都在固定的容器中去注册并且将使用的过的对象进行缓存，
     * 下一次取对象的时候直接从缓存中取对象，以保证每次获取的都是同同一个对象
     * 在IOC容器中的单例模式，就是典型的注册式单例模式
     */
    private static Map<String, Object> register = new ConcurrentHashMap<>();

    public static RegisterSingleton getInstance(String name){

        if (Objects.isNull(name)){
            name = RegisterSingleton.class.getName();
        }

        try {
            /***
             * 第一次使用，将调用私有构造函数创建一个实例，并且注册到map容器中
             */
            if (Objects.isNull(register.get(name))) {
                register.put(name, new RegisterSingleton());
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return (RegisterSingleton) register.get(name);
    }
}
