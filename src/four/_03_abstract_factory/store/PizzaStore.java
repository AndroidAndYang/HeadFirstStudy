package four._03_abstract_factory.store;


import four._03_abstract_factory.Pizza;

/**
 * author： YJZ
 * date:  2019/9/3
 * des:
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
