package two._01_my_observe;

/**
 * author： YJZ
 * date:  2019/8/17
 * des: 主题
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer 观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 更新数据通知所有的观察者
     */
    void notifyObserver();
}
