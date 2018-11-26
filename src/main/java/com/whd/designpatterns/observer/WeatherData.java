package com.whd.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author whd
 * @className WeatherData
 * @date 2018/7/10 14:50
 * @desc 天气数据
 */
public class WeatherData implements Subject {

    private List<Observer> list;

    private float temperature;
    private float humidity;
    private float pressure;

    /***
     * 在初始化气象数据的时候，实现了保存观察者的list
     */
    public WeatherData() {
        this.list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = list.indexOf(observer);
        if (i > 0) {
            list.remove(i);
        }
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : list) {
            observer.update(temperature, humidity, pressure);
        }
    }

    private void measurementsChanged(){
        notifyAllObservers();
    }


    public void setMeasurements(float temperature, float humidity,float pressure){
        this.temperature =temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
