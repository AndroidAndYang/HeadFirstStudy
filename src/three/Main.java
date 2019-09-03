package three;

import three._01_coffee.Beverage;
import three._01_coffee.HouseBlend;
import three._01_coffee.Mocha;
import three._02_io.LowerCaseInputStream;

import java.io.*;

/**
 * author： YJZ
 * date:  2019/8/17
 * des: 装饰者设计模式 Java I/O
 */
public class Main {

    public static void main(String[] args){

        Beverage houseBlend = new HouseBlend();
        System.out.println("cost = " + houseBlend.cost() + " description = " + houseBlend.getDescription());

        Mocha mocha = new Mocha(houseBlend);
        System.out.println("cost = " + mocha.cost() + " description = " + mocha.getDescription());
        try {
            int c;
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("E:\\Java Project\\HeadFirst\\src\\three\\test.txt"));
            LowerCaseInputStream lowerCaseInputStream = new LowerCaseInputStream(bufferedInputStream);
            while ((c = lowerCaseInputStream.read()) >= 0){
                System.out.println((char)c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
