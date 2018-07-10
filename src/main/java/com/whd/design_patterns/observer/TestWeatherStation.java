package com.whd.design_patterns.observer;

/**
 * @author whd
 * @className TestWeatherStation
 * @date 2018/7/10 15:10
 * @desc Describe the function of this class in one sentence
 */
public class TestWeatherStation {

    public static void main(String[] args) {

        //初始化气象数据
        WeatherData weatherData = new WeatherData();

        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(26.2f, 12f, 0.565f);

    }
}
