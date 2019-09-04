package four._03_abstract_factory.factory.impl;

import four._03_abstract_factory.factory.PizzaIngredientFactory;
import four._03_abstract_factory.ingredinent.*;
import four._03_abstract_factory.ingredinent.des.*;

/**
 * author： YJZ
 * date:  2019/9/4
 * des: 纽约材料工厂
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough crateDough() {
        return new NYThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new NYMarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NYReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new NYOnionVeggies(),new NYOnionVeggies()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NYSlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new NYFreshClams();
    }

}
