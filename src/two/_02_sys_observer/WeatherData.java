package two._02_sys_observer;

import java.util.Observable;

/**
 * author： YJZ
 * date:  2019/8/17
 * des: 使用JAVA内置观察者模式来实现气象站的数据监听
 */
public class WeatherData extends Observable {

    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;

    private void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    /**
     * 获取到最新的气象站数据，并现在控制面板上
     * @param temperature 湿度
     * @param humidity 温度
     * @param pressure 气压
     */
    public void setWeatherData(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
