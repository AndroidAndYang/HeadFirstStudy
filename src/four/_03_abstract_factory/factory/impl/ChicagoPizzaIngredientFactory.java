package four._03_abstract_factory.factory.impl;

import four._03_abstract_factory.factory.PizzaIngredientFactory;
import four._03_abstract_factory.ingredinent.*;
import four._03_abstract_factory.ingredinent.des.*;

/**
 * author： YJZ
 * date:  2019/9/4
 * des: 芝加哥材料工厂
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough crateDough() {
        return new ChicagoThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("ChicagoMarinaraSauce");
        return new ChicagoMarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("ChicagoReggianoCheese");
        return new ChicagoReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new ChicagoOnionVeggies(), new ChicagoOnionVeggies()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new ChicagoSlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        System.out.println("ChicagoFreshClams");
        return new ChicagoFreshClams();
    }


}
