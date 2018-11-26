package com.whd.designpatterns.observer;

/**
 * @author whd
 * @className Subject
 * @date 2018/7/10 14:35
 * @desc 主题类
 */
public interface Subject {
    /***
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /***
     * 删除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /***
     * 通知观察者
     */
    void notifyAllObservers();

}
