package com.whd.designpatterns.factory.method;

import com.whd.designpatterns.factory.Milk;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/26 21:16
 * @apiNote Describe the function of this class in one sentence
 **/
public interface Factory {

    /***
     * 工厂必然生产产品的技能，统一的产品出口
     * @return
     */
    Milk getMilk();
}
