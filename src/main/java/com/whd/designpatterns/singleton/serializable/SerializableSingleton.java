package com.whd.designpatterns.singleton.serializable;

import java.io.Serializable;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/27 22:44
 * @apiNote Describe the function of this class in one sentence
 **/
public class SerializableSingleton implements Serializable {

    private SerializableSingleton(){}

    /***
     * 序列化与反序列化保证单例：重写readResolve()方法
     */
    private static final SerializableSingleton INSTANCE = new SerializableSingleton();

    public static SerializableSingleton getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }



}
