package pattern_decorater;

/**
 * concrete component
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        super.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
