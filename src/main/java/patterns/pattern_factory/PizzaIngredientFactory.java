package patterns.pattern_factory;

import patterns.pattern_factory.ingredients.*;


/**
 * abstract factory
 * Provides an interface for creating a family of products!
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    /*....*/

}
