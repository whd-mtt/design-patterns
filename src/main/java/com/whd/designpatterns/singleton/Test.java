package com.whd.designpatterns.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/26 23:46
 * @apiNote Describe the function of this class in one sentence
 **/
public class Test {

    private static final int COUNT = 100;

    public static void main(String[] args) {

        CountDownLatch downLatch = new CountDownLatch(COUNT);

        for (int i = 0; i < COUNT; i++) {
            new Thread(() -> {
//                HungrySingleton hungrySingleton = HungrySingleton.getInstance();
                NoSafeLazySingleton hungrySingleton = NoSafeLazySingleton.getInstance();
                System.out.printf("%d : %s %n", System.currentTimeMillis(), hungrySingleton);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                downLatch.countDown();
            }).start();
        }

        try {
            downLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
