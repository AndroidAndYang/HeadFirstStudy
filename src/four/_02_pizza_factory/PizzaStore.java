package four._02_pizza_factory;

import four._01_pizza.Pizza;

/**
 * author： YJZ
 * date:  2019/9/3
 * des:
 */
public abstract class PizzaStore {

    // ----------- 1.0 -----------
    // private SimplePizzaFactory simplePizzaFactory;
    // public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
    //     this.simplePizzaFactory = simplePizzaFactory;
    // }

    public Pizza orderPizza(String type) {
        // ----------- 1.0 -----------
        // Pizza pizza = simplePizzaFactory.createPizza(type);

        // ----------- 2.0 -----------
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
