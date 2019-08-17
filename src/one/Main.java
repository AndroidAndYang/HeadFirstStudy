package one;

import one.duck.BaseDuck;
import one.duck.MallardDuck;
import one.duck.ModelDuck;

/**
 * author： YJZ
 * date:  2019/8/15
 * des: 第二章：设计模式入门
 */

public class Main {

    public static void main(String[] args) {

        /*
         * 概述：
         *     叫：鸭子会有呱呱叫、吱吱叫、不会叫
         *     飞：鸭子有的会飞，有的不会飞
         */

        BaseDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();

        BaseDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.display();
    }
}
