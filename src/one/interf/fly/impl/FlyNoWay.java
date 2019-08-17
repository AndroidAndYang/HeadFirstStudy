package one.interf.fly.impl;

import one.interf.fly.FlyBehavior;

/**
 * author： YJZ
 * date:  2019/6/11
 * des: 具体的某种fly行为
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("普通鸭子，不会飞");
    }
}
