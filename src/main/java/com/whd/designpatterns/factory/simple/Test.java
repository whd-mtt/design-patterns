package com.whd.designpatterns.factory.simple;

import com.whd.designpatterns.factory.Milk;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/26 21:10
 * @apiNote Describe the function of this class in one sentence
 **/
public class Test {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Milk milk = simpleFactory.getMilk("蒙牛");
        System.out.println("milk = " + milk);
    }
}
