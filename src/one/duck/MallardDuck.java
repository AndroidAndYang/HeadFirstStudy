package one.duck;

import one.interf.fly.impl.FlyNoWay;
import one.interf.quack.impl.Quack;

/**
 * author： YJZ
 * date:  2019/8/15
 * des: 会飞呱呱叫鸭子
 */
public class MallardDuck extends BaseDuck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display(){
        System.out.println("I`m a real mallard duck!");
    }
}
