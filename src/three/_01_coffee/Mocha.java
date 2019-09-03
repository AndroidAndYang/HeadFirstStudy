package three._01_coffee;

/**
 * author： YJZ
 * date:  2019/8/17
 * des: 饮料里面的调料
 */
public class Mocha extends CondimentDecorator{

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ，mocha";
    }

    @Override
    public double cost() {
        return .12 + beverage.cost();
    }
}
