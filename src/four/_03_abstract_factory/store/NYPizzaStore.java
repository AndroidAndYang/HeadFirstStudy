package four._03_abstract_factory.store;

import four._03_abstract_factory.Pizza;
import four._03_abstract_factory.factory.PizzaIngredientFactory;
import four._03_abstract_factory.factory.impl.NYPizzaIngredientFactory;
import four._03_abstract_factory.pizza.ChessPizza;
import four._03_abstract_factory.pizza.ClamsPizza;

/**
 * author： YJZ
 * date:  2019/9/4
 * des: 纽约商店代表销售披萨
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case "chess":
                pizza = new ChessPizza(nyPizzaIngredientFactory);
                break;

            case "clams":
                pizza = new ClamsPizza(nyPizzaIngredientFactory);
                break;
        }
        return pizza;
    }
}
