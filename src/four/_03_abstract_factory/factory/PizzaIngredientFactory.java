package four._03_abstract_factory.factory;

import four._03_abstract_factory.ingredinent.*;

/**
 * author： YJZ
 * date:  2019/9/4
 * des:
 */
public interface PizzaIngredientFactory {

    // 面团
    Dough crateDough();

    // 酱
    Sauce createSauce();

    // 起司
    Cheese createCheese();

    // 蔬菜
    Veggies[] createVeggies();

    // 香肠
    Pepperoni createPepperoni();

    // 蛤蜊
    Clams createClams();
}
