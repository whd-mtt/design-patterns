package com.whd.designpatterns.observer;

/**
 * @author whd
 * @className Observer
 * @date 2018/7/10 14:44
 * @desc 用于所有观察者的实现的接口
 */
public interface Observer {

    /***
     * 更新温度和湿度和气压
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp, float humidity, float pressure);
}
