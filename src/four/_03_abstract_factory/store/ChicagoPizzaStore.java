package four._03_abstract_factory.store;

import four._03_abstract_factory.Pizza;
import four._03_abstract_factory.factory.PizzaIngredientFactory;
import four._03_abstract_factory.factory.impl.ChicagoPizzaIngredientFactory;
import four._03_abstract_factory.pizza.ChessPizza;
import four._03_abstract_factory.pizza.ClamsPizza;

/**
 * author： YJZ
 * date:  2019/9/4
 * des: 纽约商店代表销售披萨
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        switch (type) {
            case "clams":
                pizza = new ClamsPizza(chicagoPizzaIngredientFactory);
                pizza.setName("chicago clams pizza");
                break;
            case "chess":
                pizza = new ChessPizza(chicagoPizzaIngredientFactory);
                pizza.setName("chicago chess pizza");
                break;
        }
        return pizza;
    }
}
