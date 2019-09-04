package four;

import four._01_pizza.CheesePizza;
import four._01_pizza.GreekPizza;
import four._01_pizza.Pizza;
import four._02_pizza_factory.*;

/**
 * author： YJZ
 * date:  2019/9/3
 * des:
 */
public class Main {

    public static void main(String[] args){
        Main main = new Main();
        // 最开始
        Pizza pizza = main.orderPizza("greek");
        pizza.bake();

        // 1.0
        // PizzaStore pizzaStore = new PizzaStore(SimplePizzaFactory.createPizza("greek"));
        // pizzaStore.orderPizza("greek");

        // 2.0 不同地区生产不一样的披萨
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("greek");

        PizzaStore pizzaStore1 = new NYPizzaStore();
        pizzaStore1.orderPizza("ny");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("chicago");

        System.out.println("2.0");

        // 3.0 抽象工厂
        four._03_abstract_factory.store.PizzaStore chicagoPizzaStore3 = new four._03_abstract_factory.store.ChicagoPizzaStore();
        chicagoPizzaStore3.orderPizza("clams");
    }

    private Pizza orderPizza(String type){
        Pizza pizza = null;
        switch (type){
            case "chess":
                pizza = new CheesePizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
        }
        return pizza;
    }
}
