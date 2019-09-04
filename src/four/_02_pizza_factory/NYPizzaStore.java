package four._02_pizza_factory;

import four._01_pizza.Pizza;

/**
 * author： YJZ
 * date:  2019/9/4
 * des: 纽约商店代表销售披萨
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return SimplePizzaFactory.createPizza(type);
    }
}
