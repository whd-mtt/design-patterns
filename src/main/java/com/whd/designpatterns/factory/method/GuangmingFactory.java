package com.whd.designpatterns.factory.method;

import com.whd.designpatterns.factory.Guangming;
import com.whd.designpatterns.factory.Milk;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/26 21:46
 * @apiNote Describe the function of this class in one sentence
 **/
public class GuangmingFactory implements Factory{
    /***
     * 工厂必然生产产品的技能，统一的产品出口
     * @return
     */
    @Override
    public Milk getMilk() {
        return new Guangming();
    }
}
