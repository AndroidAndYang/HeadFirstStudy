package two._01_my_observe;

/**
 * author： YJZ
 * date:  2019/8/17
 * des: 观察者
 */
public interface Observer {

    /**
     * 更新当前的所有数据
     * @param temp 湿度
     * @param humidity 温度
     * @param pressure 压力
     */
    void update(float temp,float humidity,float pressure);

}
