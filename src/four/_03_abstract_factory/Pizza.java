package four._03_abstract_factory;

import four._03_abstract_factory.ingredinent.*;

import java.util.ArrayList;

/**
 * author： YJZ
 * date:  2019/9/3
 * des:披萨类
 */
public abstract class Pizza {

    public String name;
    // 面团
    public Dough dough;
    public Sauce sauce;
    // 起司
    public Cheese cheese;
    // 蔬菜
    public Veggies veggies;
    // 香肠
    public Pepperoni pepperoni;
    // 蛤蜊
    public Clams clams;

    public ArrayList toppings = new ArrayList();

    public abstract void prepare();

    public void bake() {
        System.out.println("bake for 25 minutes at 35");
    }

    public void cut() {
        System.out.println("cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
