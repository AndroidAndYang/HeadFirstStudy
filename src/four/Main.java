package four;

import four._01_pizza.CheesePizza;
import four._01_pizza.GreekPizza;
import four._01_pizza.Pizza;

/**
 * author： YJZ
 * date:  2019/9/3
 * des:
 */
public class Main {

    public static void main(String[] args){
        Main main = new Main();

        Pizza pizza = main.orderPizza("greek");
        pizza.bake();
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
