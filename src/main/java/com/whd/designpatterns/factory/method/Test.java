package com.whd.designpatterns.factory.method;

import com.whd.designpatterns.factory.Milk;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/26 21:17
 * @apiNote Describe the function of this class in one sentence
 **/
public class Test {

    public static void main(String[] args) {
        Factory factory = new MengniuFactory();
        Milk milk = factory.getMilk();
        System.out.println("milk = " + milk);
    }
}
