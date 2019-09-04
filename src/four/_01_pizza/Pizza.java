package four._01_pizza;

import java.util.ArrayList;

/**
 * author： YJZ
 * date:  2019/9/3
 * des:披萨类
 */
public abstract class Pizza {

    public String name;
    public String dough;
    public String sauce;

    public ArrayList toppings = new ArrayList();

    public void prepare(){
        System.out.println("preparing " + name);
        System.out.println("Tossing dough... ");
        System.out.println("adding toppings: ");
        for (int i =0;i<toppings.size();i++){
            System.out.println(" " + toppings.get(i));
        }
    }

    public void bake(){
        System.out.println("bake for 25 minutes at 35");
    }

    public void cut(){
        System.out.println("cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}
