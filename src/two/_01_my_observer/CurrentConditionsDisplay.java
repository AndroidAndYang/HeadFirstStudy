package two._01_my_observer;

/**
 * author： YJZ
 * date:  2019/8/17
 * des: 当前的温度、气压、湿度显示
 */
public class CurrentConditionsDisplay implements DisplayElement,Observer {

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

    /**
     * 更新当前显示器上的数据
     *
     * @param temp 当前溫度
     * @param humidity 当前湿度
     * @param pressure 当前气压
     */

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    /**
     * 更新数据
     */
    @Override
    public void display() {
        System.out.println("update temperature = " + temperature + " humidity = " + humidity + " pressure = " + pressure);
    }

}
