package four._02_pizza_factory;

import four._01_pizza.Pizza;

/**
 * author： YJZ
 * date:  2019/9/4
 * des:
 */
public class ChicagoChessPizza extends Pizza {

    public ChicagoChessPizza() {
        name = "Chicago Style sauce and cheese pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum tomato Sauce";
        toppings.add("shredded mozzarella cheese");
    }

    @Override
    public void cut() {
        System.out.println("cutting the pizza into square slices");
    }
}
