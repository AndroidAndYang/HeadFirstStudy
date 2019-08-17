package two._01_my_observe;

import two._01_my_observe.CurrentConditionsDisplay;
import two._01_my_observe.Observer;
import two._01_my_observe.WeatherData;

/**
 * author： YJZ
 * date:  2019/8/15
 * des: 第二章：观察者模式
 */
public class Main {

    public static void main(String[] args){

        /*
         * 概述：
         *   此系统中的三个部分
         *          1、气象站（获取实际气象数据的物理装置）
         *          2、追踪来自气象站的数据，并更新布告板（WeatherData）
         *          3、布告板（显示目前天气状况给用户看）
         */

        WeatherData weatherData = new WeatherData();

        Observer  currentConditonsDisplayObserver = new CurrentConditionsDisplay();

        weatherData.registerObserver(currentConditonsDisplayObserver);

        weatherData.setWeatherData(25.0f, 35.6f,45.2f);
        weatherData.setWeatherData(15.0f, 65.6f,75.2f);
        weatherData.setWeatherData(5.0f, 25.6f,15.2f);
    }
}
