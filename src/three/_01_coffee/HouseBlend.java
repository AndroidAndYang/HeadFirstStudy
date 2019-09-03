package three._01_coffee;

/**
 * author： YJZ
 * date:  2019/8/17
 * des: 具体的饮料2
 */
public class HouseBlend extends Beverage {

    @Override
    public double cost() {
        return .89;
    }

    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }
}
