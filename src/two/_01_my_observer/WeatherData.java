package two._01_my_observer;

import java.util.ArrayList;

/**
 * author： YJZ
 * date:  2019/8/17
 * des: 气象站
 */
public class WeatherData implements Subject{

    /**
     * 所有的气象站的观察者数据集合
     */
    private ArrayList<Observer> observers;

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

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    /**
     * 注册一个控制面板，用于显示气象站数据
     * @param observer 监视气象站的观察者
     */

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除一个控制面板
     * @param observer 监视气象站的观察者
     */

    @Override
    public void removeObserver(Observer observer) {
        if (observers.indexOf(observer) >= 0){
            observers.remove(observer);
        }
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

    /**
     * 数据更新，通知更新所有的气象站
     */
    private void measurementsChanged(){
        notifyObserver();
    }

    /**
     * 更新所有的观察者
     */
    @Override
    public void notifyObserver() {
        for (Observer observer:observers){
            observer.update(temperature, humidity,pressure);
        }
    }
}
