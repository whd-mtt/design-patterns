package com.whd.designpatterns.factory.method;

import com.whd.designpatterns.factory.Mengniu;
import com.whd.designpatterns.factory.Milk;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/26 21:18
 * @apiNote Describe the function of this class in one sentence
 **/
public class MengniuFactory implements Factory {
    /***
     * 工厂必然生产产品的技能，统一的产品出口
     * @return
     */
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
