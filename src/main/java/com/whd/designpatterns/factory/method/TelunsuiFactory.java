package com.whd.designpatterns.factory.method;

import com.whd.designpatterns.factory.Milk;
import com.whd.designpatterns.factory.Telunsu;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/26 21:19
 * @apiNote Describe the function of this class in one sentence
 **/
public class TelunsuiFactory implements Factory {

    /***
     * 工厂必然生产产品的技能，统一的产品出口
     * @return
     */
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
