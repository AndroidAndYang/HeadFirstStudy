package three._01_coffee;

/**
 * author： YJZ
 * date:  2019/8/17
 * des: 具体的饮料1
 */
public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
