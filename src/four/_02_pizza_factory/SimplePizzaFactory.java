package four._02_pizza_factory;

import four._01_pizza.CheesePizza;
import four._01_pizza.GreekPizza;
import four._01_pizza.Pizza;

/**
 * author： YJZ
 * date:  2019/9/3
 * des: 新建一个简单工厂，用来创建我们各式各样的pizza
 */
public class SimplePizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "chess":
                pizza = new CheesePizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
            case "chicago":
                pizza = new ChicagoChessPizza();
                break;
            case "ny":
                pizza = new NYChessPizza();
                break;
            default:
                pizza = new CheesePizza();
                break;
        }
        return pizza;
    }
}
