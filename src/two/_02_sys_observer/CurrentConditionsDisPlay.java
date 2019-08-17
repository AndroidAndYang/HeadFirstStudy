package two._02_sys_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * author： YJZ
 * date:  2019/8/17
 * des:
 */
public class CurrentConditionsDisPlay implements Observer ,DisplayElement{

    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(" humidity = " + humidity + " temperature = " + temperature);
    }
}
