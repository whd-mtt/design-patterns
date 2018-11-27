package com.whd.designpatterns.singleton.hungry;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/26 23:39
 * @apiNote 饿汉式单例模式
 **/
public class HungrySingleton {

    private HungrySingleton(){}

    /***
     * 饿汉式，在实力使用之前，不管你用不用，先实例化出来再说，避免了线程安全问题
     */
    private static final HungrySingleton HUNGRY = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return HUNGRY;
    }
}
