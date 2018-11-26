package com.whd.designpatterns.factory;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/26 20:58
 * @apiNote Describe the function of this class in one sentence
 **/
public class Mengniu implements Milk {

    /***
     * 得到牛奶的名称
     * @return String
     */
    @Override
    public String getName() {
        return "蒙牛";
    }
}
