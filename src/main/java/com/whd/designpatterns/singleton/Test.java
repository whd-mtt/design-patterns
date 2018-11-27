package com.whd.designpatterns.singleton;

import com.whd.designpatterns.singleton.lazy.SafeLazyInnerClassSingleton;
import com.whd.designpatterns.singleton.register.EnumSinglton;

import java.lang.reflect.Constructor;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/26 23:46
 * @apiNote Describe the function of this class in one sentence
 **/
public class Test {

    private static final int COUNT = 500;

    public static void main(String[] args) {

//        CountDownLatch downLatch = new CountDownLatch(COUNT);
        long start = System.currentTimeMillis();
//        for (int i = 0; i < COUNT; i++) {
////            new Thread(() -> {
////                HungrySingleton hungrySingleton = HungrySingleton.getInstance();
////                NoSafeLazySingleton hungrySingleton = NoSafeLazySingleton.getInstance();
////                SafeLazySingleton hungrySingleton = SafeLazySingleton.getInstance();
//                SafeLazyInnerClassSingleton hungrySingleton = SafeLazyInnerClassSingleton.getInstance();
//                System.out.printf("%d : %s %n", System.currentTimeMillis(), hungrySingleton);
////                downLatch.countDown();
////            }).start();
//        }

//        try {
////            downLatch.await();
//            long time = System.currentTimeMillis() - start;
//            System.out.println("time = " + time);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        EnumSinglton.INSTANCE.getInstance();

    }
}
