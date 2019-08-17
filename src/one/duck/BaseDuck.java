package one.duck;

import one.interf.fly.FlyBehavior;
import one.interf.quack.QuackBehavior;

/**
 * author： YJZ
 * date:  2019/6/11
 * des: 鸭子的基类
 */
public abstract class BaseDuck {

   // ---------------------------- 1.0 ----------------------------

   // /**
   //  * 鸭子叫，有的还会吱吱叫
   //  */
   // public void quack(){
   //     System.out.println("呱呱叫");
   // }

   // /**
   //  * 游泳
   //  */
   // public void swim(){
   //     System.out.println("游泳");
   // }

   // /**
   //  * 鸭子会飞
   //  */
   // public void fly(){

   // }

   // /**
   //  * 鸭子的外观显示
   //  */
   // public abstract void display();

    // ---------------------------- 1.0 ----------------------------


    // ---------------------------- 2.0 ----------------------------

    // 将鸭子的行为封装
    /**
     * 鸭子叫的行为
     */
    QuackBehavior quackBehavior;

    /**
     * 鸭子飞的行为
     */
    FlyBehavior flyBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public abstract void display();

    // ---------------------------- 2.0 ----------------------------
}
