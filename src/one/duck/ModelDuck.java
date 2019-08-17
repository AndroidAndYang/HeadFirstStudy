package one.duck;

import one.interf.fly.impl.FlyWithWings;
import one.interf.quack.impl.Squeak;

/**
 * author： YJZ
 * date:  2019/8/15
 * des: 吱吱叫会飞
 */
public class ModelDuck extends BaseDuck {

    public ModelDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I`m a real fly duck!");
    }
}
