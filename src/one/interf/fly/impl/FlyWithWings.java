package one.interf.fly.impl;

import one.interf.fly.FlyBehavior;

/**
 * author： YJZ
 * date:  2019/6/11
 * des: 会飞的鸭子
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("鸭子飞行");
    }
}
