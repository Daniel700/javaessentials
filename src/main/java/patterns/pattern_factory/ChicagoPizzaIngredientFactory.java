package patterns.pattern_factory;

import patterns.pattern_factory.ingredients.Dough;
import patterns.pattern_factory.ingredients.MarinaraSauce;
import patterns.pattern_factory.ingredients.Sauce;
import patterns.pattern_factory.ingredients.ThinCroustDough;

/**
 * Methods to create products in an abstract factory are often implemented with a factory method
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {


    @Override
    public Dough createDough() {
        return new ThinCroustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }


}
