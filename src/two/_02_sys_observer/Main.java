package two._02_sys_observer;

/**
 * author： YJZ
 * date:  2019/8/15
 * des: 第二章：观察者模式
 */
public class Main {

    public static void main(String[] args){

        /*
         * 自身的观察者模式的缺陷：
         *      1. Observable 是一个类不是接口，因为java只能单继承，所以扩展耦合度搞
         *      2. Observable 中的setChange()方法作用域是protected，那又怎么样呢？ 除非继承自Observable，否则
         *         无法创建Observable实例并组合到你自己的对象中来
         *      3.
         */

        WeatherData weatherData  = new WeatherData();
        CurrentConditionsDisPlay currentConditionsDisPlay = new CurrentConditionsDisPlay();
        weatherData.addObserver(currentConditionsDisPlay);

        weatherData.setWeatherData(15.2f,22.6f ,33.4f);
        weatherData.setWeatherData(55.2f,32.6f ,13.4f);
        weatherData.setWeatherData(25.2f,42.6f ,23.4f);
    }
}
