package com.whd.designpatterns.factory;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/26 21:45
 * @apiNote Describe the function of this class in one sentence
 **/
public class Guangming implements Milk {
    /***
     * 得到牛奶的名称
     * @return String
     */
    @Override
    public String getName() {
        return "光明";
    }
}
