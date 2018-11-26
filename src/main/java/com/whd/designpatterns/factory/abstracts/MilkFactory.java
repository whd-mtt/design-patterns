package com.whd.designpatterns.factory.abstracts;

import com.whd.designpatterns.factory.*;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/26 21:04
 * @apiNote Describe the function of this class in one sentence
 **/
public class MilkFactory extends AbstractFactory {
    /***
     *  生产蒙牛的牛奶
     * @return {@link Milk}
     */
    @Override
    public Milk getMengniu() {
//        return new MengniuFactory().getMilk();
        return new Mengniu();
    }

    /***
     * 生产伊利的牛奶
     * @return {@link Milk}
     */
    @Override
    public Milk getYili() {
//        return new YiliFactory().getMilk();
        return new Yili();
    }

    /***
     * 生产特仑苏的牛奶
     * @return {@link Milk}
     */
    @Override
    public Milk getTelunsu() {
//        return new TelunsuiFactory().getMilk();
        return new Telunsu();
    }

    /***
     * 生产特仑苏的牛奶
     * @return {@link Milk}
     */
    @Override
    public Milk getGuangming() {
//        return new GuangmingFactory().getMilk();
        return new Guangming();
    }
}
