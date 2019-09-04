package four._03_abstract_factory.pizza;

import four._03_abstract_factory.Pizza;
import four._03_abstract_factory.factory.PizzaIngredientFactory;

/**
 * author： YJZ
 * date:  2019/9/4
 * des:
 */
public class ChessPizza extends Pizza {

    public PizzaIngredientFactory pizzaIngredientFactory;

    public ChessPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("prepare = " + name);
        dough = pizzaIngredientFactory.crateDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
