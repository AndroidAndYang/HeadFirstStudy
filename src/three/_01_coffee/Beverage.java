package three._01_coffee;

/**
 * author： YJZ
 * date:  2019/8/17
 * des: Beverage 饮料
 */
public abstract class Beverage {

    public String description = "UnKNOW Description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
