package com.whd.designpatterns.singleton.lazy;


/**
 * @author whd.java@gmail.com
 * @date 2018/11/27 0:04
 * @apiNote Describe the function of this class in one sentence
 **/
public class SafeLazyInnerClassSingleton {

    private static boolean initialized = false;

    /**
     * 默认使用SafeLazyInnerClassSingleton的时候，会先初始化内部类
     * 如果没有使用的话，内部类是不加载的
     */
    private SafeLazyInnerClassSingleton(){
        /***
         * 防止反射入侵
         */
        synchronized (SafeLazyInnerClassSingleton.class){
            if (!initialized){
                initialized = !initialized;
            }else {
                throw new RuntimeException("单例模式已被侵犯");
            }
        }
    }


    public static SafeLazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final SafeLazyInnerClassSingleton LAZY = new SafeLazyInnerClassSingleton();
    }
}
