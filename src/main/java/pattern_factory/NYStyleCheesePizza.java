package pattern_factory;

/**
 * Concrete Product of the factory method uml diagram
 */
public class NYStyleCheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory factory) {
        this.ingredientFactory = factory;
        name = "NY Style Sauce and Cheese Pizza";
        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }

}
