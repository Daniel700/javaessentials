package patterns.pattern_factory;

/**
 * creator class of the factory method uml diagram
 * In the simple factory approach the abstract creator and concrete creator are merged together in one class.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * This is the factory method!
     */
    protected abstract Pizza createPizza(String type);

}
