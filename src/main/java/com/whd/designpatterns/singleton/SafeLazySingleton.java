package com.whd.designpatterns.singleton;

import java.util.Objects;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/27 0:04
 * @apiNote Describe the function of this class in one sentence
 **/
public class SafeLazySingleton {

    private SafeLazySingleton(){}

    /***
     * 默认加载的时候不实例化，在使用的时候才实例化,但是这种方式不是线程安全的，还需优化
     */
    private static SafeLazySingleton lazySingleton = null;

    public static synchronized SafeLazySingleton getInstance() {

        if (Objects.isNull(lazySingleton)){
            lazySingleton = new SafeLazySingleton();
        }
        return lazySingleton;
    }
}
