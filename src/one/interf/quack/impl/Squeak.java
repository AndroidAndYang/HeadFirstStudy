package one.interf.quack.impl;

import one.interf.quack.QuackBehavior;

/**
 * author： YJZ
 * date:  2019/6/11
 * des:
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

}
