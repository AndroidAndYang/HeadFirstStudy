package four._02_pizza_factory;

import four._01_pizza.Pizza;

/**
 * author： YJZ
 * date:  2019/9/4
 * des:
 */
public class NYChessPizza extends Pizza {

    public NYChessPizza() {
        name = "NY Style sauce and cheese pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("grated reggiano cheese");
    }
}
