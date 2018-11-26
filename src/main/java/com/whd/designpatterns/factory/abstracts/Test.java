package com.whd.designpatterns.factory.abstracts;

import com.whd.designpatterns.factory.Milk;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/26 21:35
 * @apiNote Describe the function of this class in one sentence
 **/
public class Test {

    public static void main(String[] args) {
        AbstractFactory factory = new MilkFactory();
        //不需要什么输入，用户有权利选择各种牛奶,保证了程序的健壮性
        Milk milk = factory.getMengniu();
        System.out.println("milk = " + milk);
    }
}
