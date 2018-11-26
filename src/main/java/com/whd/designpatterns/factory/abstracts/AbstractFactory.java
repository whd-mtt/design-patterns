package com.whd.designpatterns.factory.abstracts;

import com.whd.designpatterns.factory.Milk;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/26 21:01
 * @apiNote Describe the function of this class in one sentence
 * 在Spring中使用的最多最广泛的工厂设计模式
 **/
public abstract class AbstractFactory {

    //1.将公共的逻辑写到一起，方便统一管理
    //2.易于扩展

    /***
     *  生产蒙牛的牛奶
     * @return {@link Milk}
     */
    public abstract Milk getMengniu();

    /***
     * 生产伊利的牛奶
     * @return {@link Milk}
     */
    public abstract Milk getYili();

    /***
     * 生产特仑苏的牛奶
     * @return {@link Milk}
     */
    public abstract Milk getTelunsu();

    /***
     * 生产特仑苏的牛奶
     * @return {@link Milk}
     */
    public abstract Milk getGuangming();
}
