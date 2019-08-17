package one.interf.quack.impl;

import one.interf.quack.QuackBehavior;

/**
 * author： YJZ
 * date:  2019/6/11
 * des: 具体的某种Quack行为
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
