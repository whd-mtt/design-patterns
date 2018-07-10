package com.whd.design_patterns.observer;

/**
 * @author whd
 * @className CurrentConditionDisplay
 * @date 2018/7/10 15:03
 * @desc 当前天气的板报
 */
public class CurrentConditionDisplay implements Observer, Displayer {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     * 初始化当前板报的时候，保存当前气象数据，并将自己注册到天气数据中的list中去
     * @param weatherData
     */
    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void disPlay() {
        System.out.println(this.toString());
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        disPlay();
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity + '}';
    }
}
